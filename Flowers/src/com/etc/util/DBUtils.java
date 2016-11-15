package com.etc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator ���ݿ���ʹ���?
 */
public class DBUtils {
	
	private static String url = "jdbc:mysql://127.0.0.1:3306/shop?useUnicode=true&characterEncoding=utf8";
	private static String user = "root";
	private static String pwd = "";
	private static String driver ="com.mysql.jdbc.Driver";
	
	static {
		//��ʼ��
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * ִ����ɾ�ĵ�sql���?
	 * 
	 * @param sql
	 * @return
	 */
	public static int execUpdate(String sql) {
		Connection conn = null;
		Statement stat = null;
		int rs = 0;
		try {
			conn = DriverManager.getConnection(url, user, pwd);
			stat = conn.createStatement();
			rs = stat.executeUpdate(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//��֤�������󶼱���close
			try {
				stat.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	/**
	 * ִ�в�ѯ��sql���?
	 * 
	 * @param sql
	 * @return
	 */
	public static List<Map<String, Object>> execQuery(String sql) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, user, pwd);
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			//��ȡԪ����
			ResultSetMetaData rsmd = rs.getMetaData();
			while(rs.next()) {
				HashMap<String,Object> row = new HashMap<String,Object>();
				for(int i=1; i<=rsmd.getColumnCount(); i++){
					row.put(rsmd.getColumnName(i), rs.getObject(i));
				}
				list.add(row);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//��֤�������󶼱���close
			try {
				rs.close();
				stat.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		List<Map<String,Object>> list = DBUtils.execQuery("select * from user where user_name='贺冬�?");
		System.out.println(list.toString().replaceAll("\\},\\s\\{", "},\r\n{"));
	}
}
