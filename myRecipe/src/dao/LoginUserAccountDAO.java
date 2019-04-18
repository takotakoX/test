package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.LoginEntity;
import entity.AccountEntity;
import util.DBConnector;

public class LoginUserAccountDAO {
	public AccountEntity UserLogin(LoginEntity loginEntity){

		String sql = "SELECT mail, pass FROM user_account WHERE mail = ? AND pass = ?";
		AccountEntity accountEntity = null;
		Connection conn = null;

		try{
//			コネクションを通す
			DBConnector db = new DBConnector();
			conn = db.getConnection();

//			プレースホルダーに引数をセットしSQL文を実行
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, loginEntity.getMail());
			ps.setString(2, loginEntity.getPass());
			ResultSet rs = ps.executeQuery();

//			一致したユーザーのAccountEntityインスタンスを生成
			if(rs.next()){
				String mail = rs.getString("mail");
				String pass = rs.getString("pass");
				accountEntity = new AccountEntity(mail, pass);
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

		return accountEntity;
	}

}
