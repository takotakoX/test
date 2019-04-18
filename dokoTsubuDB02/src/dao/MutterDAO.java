package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Mutter;

public class MutterDAO {

	private final String driverName = "com.mysql.jdbc.Driver";
	private final String dbUrl = "jdbc:mysql://localhost/dokotsubu";
	private final String dbUser = "root";
	private final String dbPass = "mysql";

	public List<Mutter> findAll(){
		Connection conn = null;
		List<Mutter> mutterList = new ArrayList<Mutter>();
		try{
//			DBとのコネクションを通す
			Class.forName(driverName);
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);

//			SQL文を定義してprepareStatementメソッドに渡し、実行した際の戻り値をResultSetとして受け取る。
//			prepareStatementメソッドはConnectionクラスで定義されており戻り値はPreparedStatement。
			String sql = "SELECT id, name, text FROM mutter ORDER BY id DESC";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

//			idの降順で並べられたmutterテーブルのレコード全て、つまり新しい順に並べられたつぶやきが
//			一つ一つmutterインスタンスにまとめられ、mutterListに格納される。
			while(rs.next()){
				int id = rs.getInt("id");
				String userName = rs.getString("name");
				String text = rs.getString("text");
				Mutter mutter = new Mutter(id, userName, text);
				mutterList.add(mutter);
			}
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch(SQLException e){
					e.printStackTrace();
					return null;
				}
			}
		}
		return mutterList;
	}

	public boolean create(Mutter mutter){
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);

			String sql = "INSERT INTO mutter(name, text) values(?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mutter.getUserName());
			ps.setString(2, mutter.getText());

			int result = ps.executeUpdate();

			if(result != 1){
				return false;
			}
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return true;
	}
}
