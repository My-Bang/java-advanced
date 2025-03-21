package jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmtEx03 {
    Connection conn = null;
    CallableStatement cs = null;

    public CallableStmtEx03() throws SQLException {
        // 1. connection 얻어오기
        conn = DBUtil.getConnection();
        conn.setAutoCommit(false);
        // 2. CallableStatement 객체를 이용하여 호출할 프로시저 연결
        cs = conn.prepareCall("{call SP_MEMBER_INSERT(?,?,?,?,?,?)}");     // ? : cData  ? : cTName

        // 3. 바인드 변수에 값을 셋팅     inparamenter (?) 에 값 넣기
        cs.setString(1, "TB_MEMBER");
        cs.setString(2, "12345");
        cs.setString(3, "abcd");
        cs.setString(4, "smb7000@naver.com");
        cs.setString(5, "010-1234-5678");

        // 4. out 파라미터에 저장된 프로시저의 수행결과에 대한 외부 변수 등록
        cs.registerOutParameter(6, java.sql.Types.VARCHAR);
        // 5. 쿼리 수행
        // flag의 값은 resultSet 객체의 경우는 true, 갱신 카운트 또는 결과가 없는 flase리턴 됨
        boolean flag = cs.execute();
        System.out.println(flag);
        String resultMsg = cs.getString(6);
        System.out.println(resultMsg);
        conn.commit();
        if (cs != null) {
            cs.close();
        }
        if (conn != null) {
            conn.close();
        }

    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx03();
    }


}
