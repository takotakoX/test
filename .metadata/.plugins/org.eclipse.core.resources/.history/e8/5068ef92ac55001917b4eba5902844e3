package com.internousdev.template2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template2.dto.MyPageDTO;
import com.internousdev.template2.util.DBConnector;

public class MyPageDAO {

//	MyPageDAOでは2つのメソッド、getMyPageUserInfoとbuyItemHistoryDeleteを定義している。
//	前者はマイページでユーザーの購入履歴をDBから取得するメソッド。
//	後者はマイページからユーザーの購入履歴を削除するためのメソッド。

	public MyPageDTO getMyPageUserInfo(String item_transaction_id, String user_master_id)
	throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		MyPageDTO dto = new MyPageDTO();
		String sql = "SELECT iit.item_name, ubit.total_price, ubit.total_count, ubit.pay FROM user_buy_item_transaction ubit LEFT JOIN item_info_transaction iit ON ubit.item_transaction_id = iit.id WHERE ubit.item_transaction_id = ? AND ubit.user_master_id = ? ORDER BY ubit.insert_date DESC";
//		テーブル名のエイリアス（別名）はスペースを空けて記述できる。
//		【sql文の解説】
//		買ったものの名前、金額の合計、いくつ買ったか、支払い方法が出力される。
//		where文でubitのtransaction idとuser master id(買った人のID)を指定している。
//		【エラーメモ】
//		結合文で ubit.user_master_id = iit.id としていた。（左側はString型、右側はint型）
//		実行してもnullが出るだけでエラーは出ない。。
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
//				System.out.println("resultsetの中のitem_nameカラムの内容");
//				System.out.println(rs.getString("item_name"));
//				System.out.println(rs.getString("total_price"));
//				System.out.println(rs.getString("total_count"));
//				System.out.println(rs.getString("pay"));
				dto.setItemName(rs.getString("item_name"));
				dto.setTotalPrice(rs.getString("total_price"));
				dto.setTotalCount(rs.getString("total_count"));
				dto.setPayment(rs.getString("pay"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return dto;
	}

	public int buyItemHistoryDelete(String item_transaction_id, String user_master_id)
	throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM user_buy_item_transaction "
				+ "WHERE item_transaction_id = ? AND user_master_id = ?";
		PreparedStatement ps;
		int result = 0;
		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);

			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}
}
