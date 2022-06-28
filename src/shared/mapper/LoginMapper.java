package shared.mapper;

import java.sql.ResultSet;

import model.Login;

public class LoginMapper {

    public String mapToLogin(Login login, ResultSet rs) {
        try {
        	login.setloginpassword(rs.getString("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return login.getloginpassword();
    }
}
