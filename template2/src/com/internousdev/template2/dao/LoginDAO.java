package com.internousdev.template2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template2.dto.LoginDTO;
import com.internousdev.template2.util.DBConnector;

public class LoginDAO {

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
//このloginUserIdとloginPasswordにはlogin.jspで入力した値がLoginActionを経由して入る。
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();
		String sql = "SELECT * FROM login_user_transaction WHERE login_id=? AND login_pass=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);

			ResultSet rs = ps.executeQuery();
//			この時点でResultSet型のrsにはSELECT文で参照した入力と一致するレコードが一つ戻ってきている。
//			orなにも入っていない。
//			すなわち、入力値とDBの値の判定は完了している。

			if(rs.next()){
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
//				dtoインスタンスを使って、LoginDTOクラスのloginId,loginPassword,userNameに値を格納している。

				if(!(rs.getString("login_id").equals(null))){
					dto.setLoginFlg(true);
				}
//				login_idに値が入っていればloginFlgをtrueにする。入っていなければfalse。
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return dto;
	}

}
