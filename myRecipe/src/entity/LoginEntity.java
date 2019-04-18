package entity;

public class LoginEntity {

	private String mail;
	private String pass;

	public LoginEntity(String mail, String pass){
		this.mail = mail;
		this.pass = pass;
	}

	public String getMail(){
		return this.mail;
	}
	public void setMail(String mail){
		this.mail = mail;
	}
	public String getPass(){
		return this.pass;
	}
	public void setPass(String pass){
		this.pass = pass;
	}

}
