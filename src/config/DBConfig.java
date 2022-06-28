package config;

import java.sql.*;


public class DBConfig {

	private final String CONNECTION = "jdbc:mysql://localhost:3306/hotel_management";
	private final String PASSWORD = "toor";
	private static Connection con = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException{
		if(con == null) {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management","root",PASSWORD);
		}
		return con;
	}
}
