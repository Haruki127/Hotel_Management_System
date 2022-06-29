package service;

import java.sql.PreparedStatement;
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
    		String query = "SELECT password FROM staff WHERE email = '"+login.getloginemail()+"'";
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
    
    public void updateRememberme(int rm, Login login) {
        try {
            PreparedStatement ps = this.dbConfig.getConnection()
                    .prepareStatement("UPDATE staff SET remember_me=? WHERE email=? and password=?");

            ps.setInt(1, rm);
            ps.setString(2, login.getloginemail());
            ps.setString(3, login.getloginpassword());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
    
    public Login getTokenPassword(String email) {
    	Login login = new Login();
    	try (Statement st = this.dbConfig.getConnection().createStatement()){
    		String query = "SELECT password, remember_me FROM staff WHERE email = '"+email+"'";
    		ResultSet rs = st.executeQuery(query);
    		if(rs.next()) {
    			login.setloginpassword(rs.getString("password"));
    			login.setrememberme((rs.getInt("remember_me")));
    		}
    	}catch (Exception e) {

        	e.printStackTrace();
        }
		return login;
    }
}
