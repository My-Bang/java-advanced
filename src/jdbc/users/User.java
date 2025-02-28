package jdbc.users;

import lombok.Data;

@Data
public class User {
    private String userid;
    private String username;
    private String userpassword;
    private String memTel;
    private String memAddr;


@Override
    public String toString() {
        return " "+userid + "\t\t " + username + "\t\t" + userpassword + "\t" + memTel + "\t " + memAddr;
    }
}
