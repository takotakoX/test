package com.internousdev.ecsite.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/kevinecdb2";
	private static String user = "root";
	private static String password = "mysql";

	public Connection getConnection(){
		Connection con = null;

<<<<<<< HEAD
		try{
			Class.forName(driverName);
//			(Connection)はじつはいらない。
			con = (Connection) DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
=======
	try{
		Class.forName(driverName);
		con = (Connection) DriverManager.getConnection(url,user,password);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}

	return con;
	}

>>>>>>> 00a3a8007f9986b1e2bf1bd0ed89c1dabe192314
}
