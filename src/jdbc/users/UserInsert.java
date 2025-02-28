package jdbc.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsert {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection connection = null;

        // 1. JDBC 드라이버 등록 : MYSQL DB 접근 하기 위한 드라이버 등록
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Driver loaded ok! " + connection);


        // 2. Mysql DB에 연결객체 얻어와서 연결하기
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234");
        System.out.println("Connection Ok!" + connection);


        // 3. 매개변수화된 sql문 작성
        String query = "" +
                "insert into users(userid, username,userpassword, userage, useremail)" +
                "values(?,?,?,?,?)";

        PreparedStatement pstmt = connection.prepareStatement(query);

        pstmt.setString(1, "mycaptain622");
        pstmt.setString(2, "방민영");
        pstmt.setString(3, "1234");
        pstmt.setInt(4, 27);
        pstmt.setString(5, "mycaptain622@gmail.com");


        // 4. SQL문 실행
        int rows = pstmt.executeUpdate();
        System.out.println(rows + " rows inserted");
        // 5. pstmt객체 닫기
        pstmt.close();

        if (connection != null) {
            connection.close();
            System.out.println("Connection closed!");
        }
    }

}
