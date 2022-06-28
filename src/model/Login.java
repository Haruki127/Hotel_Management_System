package model;

public class Login {
	private String loginemail;
	private String loginpassword;
	
	public String getloginemail() {
		return this.loginemail;
	}
	//del?
	public void setloginemail(String lgem) {
		this.loginemail = lgem;
	}
	public String getloginpassword() {
		return this.loginpassword;
	}
	public void setloginpassword(String string) {
		this.loginpassword = string;
	}
	@Override
	public String toString() {
		return "Login [email =" + loginemail + ", password=" + loginpassword.toString() + "]";
	}
}
