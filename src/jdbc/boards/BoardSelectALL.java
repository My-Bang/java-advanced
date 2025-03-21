package jdbc.boards;

import java.sql.*;

public class BoardSelectALL {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        ResultSet rs = null;

        // 1. JDBC 드라이버 등록 : MYSQL DB 접근 하기 위한 드라이버 등록
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Driver loaded ok! " + connection);


        // 2. Mysql DB에 연결객체 얻어와서 연결하기
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234");
        System.out.println("Connection Ok!" + connection);


        // 3. 매개변수화된 sql문 작성
        String query = new StringBuilder()
                .append("select * from boards ")
                .toString();
        PreparedStatement pstmt = connection.prepareStatement(query);


        // 4. SQL문 실행
        rs = pstmt.executeQuery();

        while (rs.next()) {
            Board board = new Board();
            board.setBno(rs.getInt("bno"));
            board.setBtitle(rs.getString("btitle"));
            board.setBcontent(rs.getString("bcontent"));
            board.setBwriter(rs.getString("bwriter"));
            board.setBdate(rs.getDate("bdate"));
            board.setBfilename(rs.getString("bfilename"));
            System.out.println(board);
        }
        // 5. pstmt객체 닫기
        pstmt.close();

        if (connection != null) {
            connection.close();
            System.out.println("Connection closed!");
        }
    }

}
