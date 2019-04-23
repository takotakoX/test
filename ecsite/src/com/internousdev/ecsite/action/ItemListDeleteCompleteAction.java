package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport{
	public String execute(){

		ItemListDeleteCompleteDAO dao = new ItemListDeleteCompleteDAO();
		dao.listDelete();

		String result = SUCCESS;
		return result;
	}

}
