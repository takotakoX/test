package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ecsite.util.DBConnector;

public class UserListDeleteCompleteDAO {
	public void userDelete(){
		String sql = "DELETE FROM login_user_transaction";
		Connection conn = null;

		try{
			DBConnector db = new DBConnector();
			conn = db.getConnection();

			PreparedStatement ps = conn.prepareStatement(sql);
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
