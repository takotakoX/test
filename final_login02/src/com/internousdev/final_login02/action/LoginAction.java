package com.internousdev.final_login02.action;

import java.sql.SQLException;

import com.internousdev.final_login02.dao.LoginDAO;
import com.internousdev.final_login02.dto.LoginDTO;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String name;
	private String pass;

	public String execute() throws SQLException{

		LoginDTO dto = new LoginDTO();
		LoginDAO dao = new LoginDAO();
		String result = ERROR;

		dto = dao.UserLogin(name, pass);

		if(name.equals(dto.getName()) && pass.equals(dto.getPass())){
			result = SUCCESS;
		}
		return result;
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
