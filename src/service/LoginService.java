package service;

import java.sql.ResultSet;
import java.sql.Statement;

import model.Login;
import shared.mapper.LoginMapper;

public class LoginService {
    private LoginMapper loginMapper = new LoginMapper();
	private config.DBConfig dbConfig = new config.DBConfig();
	private String pw;
	private int match = 0;

	public LoginService() {
	    this.loginMapper = new LoginMapper();
		this.dbConfig = new config.DBConfig();
	}

	
    public int matchPassword(Login login) {
    	
    	try (Statement st = this.dbConfig.getConnection().createStatement()){
    		String query = "SELECT password FROM users WHERE email = '"+login.getloginemail()+"'";
    		ResultSet rs = st.executeQuery(query);
    		if(rs.next()) {
    			Login newlogin = new Login();
    			pw = this.loginMapper.mapToLogin(newlogin, rs).toString();
    			if(login.getloginpassword().equals(pw)) {
    				match = 1;
    			}
    			else {
    				match = 0;
    			}
			}
        } catch (Exception e) {

        	e.printStackTrace();
        }
		return match;
    }
}
