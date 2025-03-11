package employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = null;
        try {
            conn = Db.getConnection();
            String sql = "SELECT * FROM Employee";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String eno = rs.getString("eno");
                String name = rs.getString("name");
                String role = rs.getString("role");
                double salary = rs.getDouble("salary");
                int enterYear = rs.getInt("enterYear");
                int enterMonth = rs.getInt("enterMonth");
                int enterDay = rs.getInt("enterDay");
                employee = new Employee(eno,name, salary, role, enterYear, enterMonth, enterDay);
                employees.add(employee);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            closeResources();
        }
        return employees;
    }

    public void updateSalary(String eno, double newSalary) throws ClassNotFoundException {
        try {
            conn = Db.getConnection();
            String sql = "UPDATE Employee SET salary = ? WHERE eno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, newSalary);
            pstmt.setString(2, eno);


            int updatedRows = pstmt.executeUpdate();

            if (updatedRows > 0) {
                System.out.println("급여가 성공적으로 업데이트되었습니다.  " + newSalary);
            } else {
                System.out.println("급여 업데이트 실패. 직원 ID: " + eno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
    }

    private void closeResources() {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
