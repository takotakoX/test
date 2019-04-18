package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DBConnector;

public class RecipeDeleteDAO {
	public boolean DeleteRecipe(String dish, String mailId){

		String sql = "DELETE FROM recipe WHERE dish = ? AND mail_id = ?";

		Connection conn = null;
		int result = 0;
		boolean ret = true;

		try{
			DBConnector db = new DBConnector();
			conn = db.getConnection();

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dish);
			ps.setString(2, mailId);
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
