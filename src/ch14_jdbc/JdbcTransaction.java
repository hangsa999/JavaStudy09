package ch14_jdbc;

import java.sql.*;

public class JdbcTransaction {

    /*
        호빵맨의 score 50을 식빵맨에게 준다.
        Update문이 호빵맨의 스코어에 대해 한번
        식빵맨의 score에 대해 두 번 실행이 된다.

        만약 호빵맨의 score가 50이 안되는 상황이면
        식빵맨에게 score를 줄 수 없으니 취소한다.
     */

    public static void main(String[] args) {

        // ojdbc 라이브러리 내 OracleDriver 클래스를 깨우기
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로드 성공");
        } catch (ClassNotFoundException e) {
            // throw new RuntimeException(e)    // 프로그램 멈춤
            System.exit(0);
        }

        // DB 연결을 위한 URL, 계정 ID/PW 준비
        String url = "jdbc:oracle:thin:@nextit.or.kr:1521:xe";
        String id = "std204";
        String pw = "oracle21c";

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        // ResultSet은 SELECT문에서만 사용

        try {
            conn = DriverManager.getConnection(url, id, pw);

            // 자동 커밋 (auto-commit) 기능 끄기
            conn.setAutoCommit(false);

            StringBuffer query = new StringBuffer();
            // 문자열 더하기 중에 여백 없이 딱 붙는 경우가 없도록 하기
            query.append("UPDATE                        ");
            query.append("  members                     ");
            query.append("SET                           ");
            query.append("  mem_score = mem_score - ?   ");
            query.append("WHERE 1=1                     ");
            query.append("  AND mem_name = ?            ");

            ps = conn.prepareStatement(query.toString());

            int idx = 1;
            ps.setInt(idx++, 50);
            ps.setString(idx++, "호빵");

            int result = ps.executeUpdate();

            System.out.println(result);

            // 추가적으로 SELECT 문 실행
            ps.close();
            query = new StringBuffer();

            query.append("SELECT                    ");
            query.append("  , mem_score AS score    ");
            query.append("FROM                      ");
            query.append("  members                 ");
            query.append("WHERE 1=1                 ");
            query.append("  AND mem_name = ?        ");

            // 5. 쿼리문을 실행하기 위한 PreparedStatement 객체 생성
            ps = conn.prepareStatement(query.toString());
            ps.setString(1, "호빵맨");
            // 6. 쿼리문 실행 및 실행 결과를 ResultSet에 담기
            rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("호빵맨 score: " + rs.getInt("score"));

                // 호빵맨의 score에 -50을 한 결과가 음수라면
                // 해당 업데이트 롤백 시키기
                if (rs.getInt("score") < 0){
                    conn.rollback();
                } else {
                    // -50을 한 이후 0보다 크면 식빵맨의 score +50
                    ps.close();

                    query = new StringBuffer();
                    query.append("UPDATE                        ");
                    query.append("  members                     ");
                    query.append("SET                           ");
                    query.append("  mem_score = mem_score + ?   ");
                    query.append("WHERE 1=1                     ");
                    query.append("  AND mem_name = ?            ");

                    ps = conn.prepareStatement(query.toString());

                    ps.setInt(1, 50);
                    ps.setString(2, "식빵맨");

                    int rst = ps.executeUpdate();

                    // rst 가 1 이상이어야 정상 업데이트된 것
                    if (rst > 0) {
                        // 호빵맨의 score가 -50 잘 되었고,
                        // 이후 식빵맨의 score가 +50 잘 된 구간
                        // 커밋 ㄱㄱ
                        conn.commit();
                    } else {
                        // 호빵맨의 score가 -50 잘 되었으나
                        // 식빵맨의 score가 +50 안 된 구간
                        // 롤백 ㄱㄱ
                        conn.rollback();
                    }

                }
            }

            // 7. ResultSet 내부 데이터 조회
            while (rs.next()) {
                System.out.println(rs.getString("mem_id"));
                System.out.println(rs.getString("mem_pw"));
                System.out.println(rs.getString("mem_name"));
                // SELECT 문 컬럼에 AS가 있다면 해당 알리아스에 맞춰주어야 한다.
                System.out.println(rs.getInt("score"));
            }

        } catch (SQLException e) {
            try {conn.rollback();} catch (SQLException ex) {
            throw new RuntimeException(e);}
        } finally {
            // DB 연결에 사용된 객체들 close 해주기
            // 선언된 순서의 반대 순서로 close 해주는 것을 추천
            if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
            if (ps != null) {try {ps.close();} catch (SQLException e) {e.printStackTrace();}}
            if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
        }


    }
}
