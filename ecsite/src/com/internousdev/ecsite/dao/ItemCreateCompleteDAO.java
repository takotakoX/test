package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemCreateCompleteDAO {

	public void createItem(String itemName, int itemPrice, int itemStock){

		String sql = "INSERT INTO item_info_transaction (item_name, item_price, item_stock, insert_date) VALUES (?,?,?,?)";
		DateUtil date = new DateUtil();
		Connection conn = null;

		try{
			DBConnector db = new DBConnector();
			conn = db.getConnection();

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, itemName);
			ps.setInt(2, itemPrice);
			ps.setInt(3, itemStock);
			ps.setString(4, date.getDate());
			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
