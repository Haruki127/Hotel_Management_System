package model;		
		
public class Login {		
	private String loginemail;	
	private String loginpassword;	
	private int rememberme;	
		
	public String getloginemail() {	
		return this.loginemail;
	}	
	public void setloginemail(String lgem) {	
		this.loginemail = lgem;
	}	
	public String getloginpassword() {	
		return this.loginpassword;
	}	
	public void setloginpassword(String string) {	
		this.loginpassword = string;
	}	
	public Integer getrememberme() {	
		return this.rememberme;
	}	
	public void setrememberme(int rm) {	
		this.rememberme = rm;
	}	
	@Override	
	public String toString() {	
		return "Login [email =" + loginemail + ", password=" + loginpassword.toString() + ", rememberme=" + rememberme + "]";
	}	
}		
