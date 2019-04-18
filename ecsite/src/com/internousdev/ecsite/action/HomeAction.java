package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class HomeAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;

	public String execute(){
		String result = "login";
		if(session.containsKey("id")){
			BuyItemDAO dao = new BuyItemDAO();
			BuyItemDTO dto = dao.getBuyItemInfo();
			session.put("id", dto.getId());
			session.put("buyItem_name", dto.getItemName());
			session.put("buyItem_price", dto.getItemPrice());
			result = SUCCESS;
		}
		return result;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
