package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * packageName   : jdbc.advanced.users
 * fileName      : DBUtil
 * author        : a
 * date          : 2025-02-28
 * description   : 데이터베이스 연결 작업 클래스
 * =================================================
 * DATE             AUTHOR             NOTE
 * -------------------------------------------------
 * 2025-02-28        a
 */
public class DBUtil {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        ResultSet rs = null;
        // 1. JDBC 드라이버 등록 : MYSQL DB 접근 하기 위한 드라이버 등록
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Driver loaded ok! " + connection);


        // 2. Mysql DB에 연결객체 얻어와서 연결하기
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234");
        System.out.println("Connection Ok!" + connection);
        return connection;
    }
}