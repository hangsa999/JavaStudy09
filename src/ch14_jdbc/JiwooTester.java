package ch14_jdbc;

import java.sql.*;

public class JiwooTester {

    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로드 성공");
        } catch (ClassNotFoundException e) {
            // throw new RuntimeException(e)    // 프로그램 멈춤
            System.exit(0);
        }

        // DB 연결을 위한 URL, 계정 ID/PW 준비
        String url = "jdbc:oracle:thin:@bdubu.iptime.org:1521:xe";
        String id = "tester";
        String pw = "oracle";

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 3. 데이터베이스 서버와 연결
            // 연결에 성공하면 연결된 상태인 Connection 객체를 리턴한다.
            conn = DriverManager.getConnection(url, id, pw);

            // 4. 쿼리문 작성
//            String query = "SELECT";
//            query += "mem_id";
//            query += "mem_pw";
//            query += "mem_name";
//            query += "FROM";
            StringBuffer query = new StringBuffer();
            // 문자열 더하기 중에 여백 없이 딱 붙는 경우가 없도록 하기
            query.append("SELECT                    ");
            query.append("  fish_id                  ");
            query.append("  , fish_name               ");
            query.append("  , fish_price              ");
            query.append("  , fish_location    ");
            query.append("FROM                      ");
            query.append("  FISHES                 ");    // query문 안쪽에 ;를 넣으면 오류남

            // 5. 쿼리문을 실행하기 위한 PreparedStatement 객체 생성
            ps = conn.prepareStatement(query.toString());

            // 6. 쿼리문 실행 및 실행 결과를 ResultSet에 담기
            rs = ps.executeQuery();

            // 7. ResultSet 내부 데이터 조회
            while (rs.next()) {
                System.out.println(rs.getInt("fish_id"));
                System.out.println(rs.getString("fish_name"));
                System.out.println(rs.getInt("fish_price"));
                System.out.println(rs.getString("fish_location"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // DB 연결에 사용된 객체들 close 해주기
            // 선언된 순서의 반대 순서로 close 해주는 것을 추천
            if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
            if (ps != null) {try {ps.close();} catch (SQLException e) {e.printStackTrace();}}
            if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
        }

    }
}
