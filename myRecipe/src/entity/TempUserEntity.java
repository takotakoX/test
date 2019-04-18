package entity;

import java.io.Serializable;

//インスタンスごとセッションスコープに格納するためjavabeansにする。
public class TempUserEntity implements Serializable{

	private String mail;
	private String pass;

	public TempUserEntity(){}
	public TempUserEntity(String mail, String pass){
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