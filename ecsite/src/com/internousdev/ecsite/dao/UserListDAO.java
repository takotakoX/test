package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {
	public List<UserInfoDTO> getUserInfo(){
		String sql = "SELECT id, login_id, login_pass, user_name, insert_date FROM login_user_transaction";
		List<UserInfoDTO> userList = new ArrayList<UserInfoDTO>();
		Connection conn = null;

		try{
			DBConnector db = new DBConnector();
			conn = db.getConnection();

			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserInfoDTO dto = new UserInfoDTO();
				dto.setUserId(rs.getInt("id"));
				dto.setLoginId(rs.getString("login_id"));
				dto.setUserPass(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setInsertDate(rs.getString("insert_date"));
				userList.add(dto);
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
		return userList;
	}

}
