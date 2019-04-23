package com.internousdev.ecsite.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private Map<String, Object> session;
	private LoginDAO lidao = new LoginDAO();
	private LoginDTO lidto = new LoginDTO();
	private BuyItemDAO bidao = new BuyItemDAO();

	public String execute(){
		String result = ERROR;
		lidto = lidao.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", lidto);



		if(((LoginDTO) session.get("loginUser")).isLoginFlg() && ((LoginDTO) session.get("loginUser")).isAdminFlg()){
			result = "admin";
			BuyItemDTO bidto = bidao.getBuyItemInfo();

			session.put("login_user_id",lidto.getLoginId());
			session.put("id",bidto.getId());
			session.put("buyItem_name",bidto.getItemName());
			session.put("buyItem_price",bidto.getItemPrice());
		}else if(((LoginDTO) session.get("loginUser")).isLoginFlg()){
			result = SUCCESS;
			BuyItemDTO bidto = bidao.getBuyItemInfo();

			session.put("login_user_id",lidto.getLoginId());
			session.put("id",bidto.getId());
			session.put("buyItem_name",bidto.getItemName());
			session.put("buyItem_price",bidto.getItemPrice());
		}
		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}
//	【エラーメモ】
//	セッターの綴りを間違えていたためログインできなかった？？"taro"がloginUserIdとしてunexpectedとコンソールに表示されていた。
//	↑strutsのjspからactionに変数を持ってくる条件として、変数名が同じこととゲッターセッターが定義されていることの2つがあった。
//	解答：valuestackのルールとしてゲッターセッターのメッソド名は決められている。
//	このメソッド名は慣例などではなく合っていないと機能しなくなる。

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

}
