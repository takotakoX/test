package com.internousdev.final_login02.dto;

public class LoginDTO {
	private String name;
	private String pass;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPass(){
		return this.pass;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
}
