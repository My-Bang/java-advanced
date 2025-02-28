package jdbc.boards;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BoardInsert {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException {

        Connection connection = null;

        // 1. JDBC 드라이버 등록 : MYSQL DB 접근 하기 위한 드라이버 등록
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Driver loaded ok! " + connection);


        // 2. Mysql DB에 연결객체 얻어와서 연결하기
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234");
        System.out.println("Connection Ok!" + connection);


        // 3. 매개변수화된 SQL문 작성
        String query = "insert into boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata)" +
                "values(?,?,?,now(),?,?)";

        PreparedStatement pstmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, "봄이로구나");
        pstmt.setString(2, "봄이 오는데 구경은 못하고 강의실에 잡혀서 jdbc 프로그래밍을 하는 나!");
        pstmt.setString(3, "sym");
        pstmt.setString(4, "spring.jpg");
        pstmt.setBlob(5, new FileInputStream("src/images/spring.jpg"));


        // 4. SQL문 실행
        int rows = pstmt.executeUpdate();
        System.out.println(rows + " rows inserted");

        // bno 값 얻어오기
        if (rows == 1) {
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                int bno = rs.getInt(1);
                System.out.println(bno);
            }
            rs.close();
        }

        if (connection != null) {
            connection.close();
            System.out.println("Connection closed!");
        }
    }

}
