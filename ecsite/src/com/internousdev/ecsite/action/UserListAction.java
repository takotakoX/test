package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport{

	List<UserInfoDTO> userList = new ArrayList<UserInfoDTO>();

	public String execute(){

		UserListDAO dao = new UserListDAO();
		userList = dao.getUserInfo();

		String result = SUCCESS;
		return result;
	}

	public List<UserInfoDTO> getUserList() {
		return userList;
	}

	public void setUserList(List<UserInfoDTO> userList) {
		this.userList = userList;
	}

}
