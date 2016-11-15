package com.etc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DButilConnection {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		String url="jdbc:mysql://127.0.0.1:3306/shop?useUnicode=true&characterEncoding=utf8";
		String username="root";
		String password = "";
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/*public static void main(String[] args) {
		System.out.println(DButilConnection.getConnection());
	}*/
}
