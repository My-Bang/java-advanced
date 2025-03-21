package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

    Connection connection = null;

        // 1. JDBC 드라이버 등록 : MYSQL DB 접근 하기 위한 드라이버 등록
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Driver loaded ok! "+ connection);


        // 2. Mysql DB에 연결객체 얻어와서 연결하기
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234");
        System.out.println("Connection Ok!" + connection);

        if (connection != null) {
            connection.close();
            System.out.println("Connection closed!");
        }
    }
}
