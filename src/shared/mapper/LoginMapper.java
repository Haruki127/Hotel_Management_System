package shared.mapper;

import java.sql.ResultSet;

import model.Login;
//just for put (rs data) to (obj)
public class LoginMapper {

    public String mapToLogin(Login login, ResultSet rs) {
        try {
        	login.setloginpassword(rs.getString("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return login.getloginpassword();
    }
    
//    public String mapToLogin_Rememberme(Login login, ResultSet rs) {
//        try {
//        	login.setloginpassword(rs.getString("password"));
//        	login.setloginpassword(rs.getString("password"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return login.getloginpassword();
//    }
}
