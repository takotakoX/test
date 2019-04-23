package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {

	public List<ItemInfoDTO> getItemList(){
		List<ItemInfoDTO> itemList = new ArrayList<ItemInfoDTO>();
		String sql = "SELECT id, item_name, item_price, item_stock, insert_date FROM item_info_transaction ORDER BY id ASC";
		Connection conn = null;

		try{
			DBConnector db = new DBConnector();
			conn = db.getConnection();

			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ItemInfoDTO dto = new ItemInfoDTO();
				dto.setItemId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getInt("item_price"));
				dto.setItemStock(rs.getInt("item_stock"));
				dto.setInsertDate(rs.getString("insert_date"));
				itemList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return itemList;
	}
}
