package jdbc.callablestmt;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
public class SP_MEMBER_DTO {

    public int m_seq;
    public String m_userid;
    public String m_pwd;
    public String m_email;
    public String m_hp;
    public Date m_registdate;
    public int m_point;

    public SP_MEMBER_DTO() {

    }
}