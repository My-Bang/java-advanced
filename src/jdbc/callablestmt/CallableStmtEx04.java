package jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CallableStmtEx04 {
    Connection conn = null;

    CallableStatement cs = null;
       ResultSet rs = null;

    public CallableStmtEx04() throws SQLException {
        // 1. connection 얻어오기
        conn = DBUtil.getConnection();
        conn.setAutoCommit(false);

        // 2. CallableStatement 객체를 이용하여 호출할 프로시저 연결
        cs = conn.prepareCall("{call SP_MEMBER_LIST()}");     // ? : cData  ? : cTName
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            SP_MEMBER_DTO sp_member_dto = new SP_MEMBER_DTO();
            sp_member_dto.setM_seq(rs.getInt("m_seq"));
            sp_member_dto.setM_userid(rs.getString("m_userid"));
            sp_member_dto.setM_pwd(rs.getString("m_pwd"));
            sp_member_dto.setM_email(rs.getString("m_email"));
            sp_member_dto.setM_hp(rs.getString("m_hp"));
            sp_member_dto.setM_registdate(rs.getDate("m_registdate"));
            System.out.println(sp_member_dto);
        }
        // 5. 쿼리 수행
        // flag의 값은 resultSet 객체의 경우는 true, 갱신 카운트 또는 결과가 없는 flase리턴 됨
        boolean flag = cs.execute();
        System.out.println(flag);

        conn.commit();
        if (cs != null) {
            cs.close();
        }
        if (conn != null) {
            conn.close();
        }

    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx04();
    }


}
