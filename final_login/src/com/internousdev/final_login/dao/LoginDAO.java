package com.internousdev.final_login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.final_login.dto.LoginDTO;
import com.internousdev.final_login.util.DBConnector;

public class LoginDAO {
	public LoginDTO UserLogin(String name, String pass){
		String sql = "SELECT user_name, password FROM user WHERE user_name = ? AND password = ?";
		Connection conn = null;
		LoginDTO dto = new LoginDTO();

		try{
			DBConnector db = new DBConnector();
			conn = db.getConnection();

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setName(rs.getString("user_name"));
				dto.setPass(rs.getString("password"));
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
		return dto;
	}

}
