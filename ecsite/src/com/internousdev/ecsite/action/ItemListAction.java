package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport{

	private List<ItemInfoDTO> itemList = new ArrayList<ItemInfoDTO>();

	public String execute(){

		ItemListDAO dao = new ItemListDAO();
		itemList = dao.getItemList();

		String result = SUCCESS;
		return result;
	}

	public List<ItemInfoDTO> getItemList() {
		return itemList;
	}

	public void setItemList(List<ItemInfoDTO> itemList) {
		this.itemList = itemList;
	}

}
