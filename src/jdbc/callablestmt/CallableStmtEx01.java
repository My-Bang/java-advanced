package jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmtEx01 {
    Connection conn = null;
    CallableStatement cs = null;

    public CallableStmtEx01() throws SQLException {
        // 1. connection 얻어오기
        conn = DBUtil.getConnection();

        // 2. CallableStatement 객체를 이용하여 호출할 프로시저 연결
        cs = conn.prepareCall("{call P_INSERTCODES(?,?)}");     // ? : cData  ? : cTName

        // 3. 바인드 변수에 값을 셋팅     inparamenter (?) 에 값 넣기
        cs.setString(1,"프론트 고급개발자");    // 코드네임
        cs.setString(2,"CODE1");    // 코드를 등록할 테이블명

        // 4. 쿼리 수행
        // flag의 값은 resultSet 객체의 경우는 true, 갱신 카운트 또는 결과가 없는 flase리턴 됨
        boolean flag = cs.execute();
        System.out.println(flag);

        if (cs != null) {cs.close();}
        if (conn != null) {conn.close();}

    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx01();
    }






}
