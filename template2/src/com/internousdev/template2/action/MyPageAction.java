package com.internousdev.template2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template2.dao.MyPageDAO;
import com.internousdev.template2.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private String deleteFlg;
//	deleteFlgとは
//	初期値は当然null。myPage.jspのs:form内のsubmitが走ると"1"が上書きされる。
//	上書きされた状態でMyPageActionが走ることでdeleteメソッドが発動し、レコードが削除される。
	private String result;

	public String execute() throws SQLException{
		MyPageDAO dao = new MyPageDAO();
		MyPageDTO dto = new MyPageDTO();

		if(deleteFlg == null){
			String item_transaction_id = session.get("id").toString();
			String user_master_id = session.get("login_user_id").toString();

			dto = dao.getMyPageUserInfo(item_transaction_id, user_master_id);
			//test code
			System.out.println(dto.getItemName());
			//test code

			session.put("buyItem_name",dto.getItemName());
			session.put("total_price",dto.getTotalPrice());
			session.put("total_count",dto.getTotalCount());
			session.put("total_payment",dto.getPayment());
			session.put("message","");
		}else if(deleteFlg.equals("1")){
			delete();
		}
		result = SUCCESS;
		return result;
	}

	public void delete() throws SQLException{
		MyPageDAO dao = new MyPageDAO();

		String item_transaction_id = session.get("id").toString();
		String user_master_id = session.get("login_user_id").toString();

		int res = dao.buyItemHistoryDelete(item_transaction_id, user_master_id);

		if(res>0){
			session.put("message","商品情報を正しく削除しました。");
		}else if(res == 0){
			session.put("message","商品情報の削除に失敗しました。");
		}
//		resはint型。なぜならMyPageDAOでdeleteのsql文を実行しているのがexecute.Update()メソッドだから。
	}

	public String getDeleteFlg(){
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}
//	【エラーメモ】
//	テキストではこのActionのMapがpublicで定義されていたためゲッターの記述はなかった。
//	privateで定義した場合はゲッターが必要（myPage.jspでsessionを呼び出すため。）

	@Override
	public void setSession(Map<String, Object> loginSessionMap){
		this.session = loginSessionMap;
	}

}
