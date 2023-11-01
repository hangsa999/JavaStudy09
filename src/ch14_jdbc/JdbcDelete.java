package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDelete {

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
        // ResultSet은 SELECT문에서만 사용

        try {
            conn = DriverManager.getConnection(url, id, pw);

            StringBuffer query = new StringBuffer();
            // 문자열 더하기 중에 여백 없이 딱 붙는 경우가 없도록 하기
            query.append("DELETE            ");
            query.append("FROM              ");
            query.append("  members         ");
            query.append("WHERE             ");
            query.append("  mem_id = 'd001'  ");

            ps = conn.prepareStatement(query.toString());

            // insert, update, delete문은 executeUpdate()로 실행
            // 결과는 int 타입이 리턴된다.
            int result = ps.executeUpdate();

            System.out.println(result);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // DB 연결에 사용된 객체들 close 해주기
            // 선언된 순서의 반대 순서로 close 해주는 것을 추천
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
