package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.TempUserEntity;
import util.DBConnector;

public class TempUserCheckDAO {
	public boolean TempUserCheck(TempUserEntity tempUser){

		String sql = "SELECT mail FROM user_account WHERE mail = ?";
		Connection conn = null;
		boolean result = true;

		try{
			DBConnector db = new DBConnector();
			conn = db.getConnection();

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tempUser.getMail());
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				result = false;
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
