package com.internousdev.final_login.action;

import java.sql.SQLException;

import com.internousdev.final_login.dao.LoginDAO;
import com.internousdev.final_login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String name;
	private String pass;

	public String execute() throws SQLException{

		String ret = ERROR;

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		dto = dao.UserLogin(name, pass);

		if(name.equals(dto.getName()) && pass.equals(dto.getPass())){
			ret = SUCCESS;
		}
		return ret;
	}

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
