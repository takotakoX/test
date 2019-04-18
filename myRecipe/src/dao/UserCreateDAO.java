package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.TempUserEntity;
import util.DBConnector;

public class UserCreateDAO {
	public boolean CreateUser(TempUserEntity tempUser){
		String sql= "INSERT INTO user_account (mail,pass) VALUES(?,?)";
		Connection conn = null;
		int result = 0;
		boolean ret = true;

		try{
			DBConnector db = new DBConnector();
			conn = db.getConnection();

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tempUser.getMail());
			ps.setString(2, tempUser.getPass());
			result = ps.executeUpdate();

			if(result != 1){
				ret = false;
			}
		}catch(Exception e){
			ret = false;
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return ret;
	}

}
