package com.etc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.sf.json.JSONArray;

import com.etc.mode.Menu;
import com.etc.mode.Receive;
import com.etc.util.DBUtils;
import com.etc.util.DButilConnection;

public class MenuDao {
	public List<Menu> getMenus(){
		return getMenu("-1");
	}
	public List<Menu> getMenu(String pid){
		String sql="SELECT * FROM menu WHERE pid = "+pid;
		List menu_list = null;
		Connection  connection = DButilConnection.getConnection();
		QueryRunner run = new QueryRunner();
		ResultSetHandler<List<Menu>> h = new BeanListHandler<Menu>(Menu.class);
		try {
			menu_list = run.query(connection, sql, h);
			if(menu_list==null||menu_list.size()==0){
				return null;
			}
			for(int i =0;i<menu_list.size();i++){
				Menu m = (Menu)menu_list.get(i);
				if(getMenu(m.getId())!=null){
					m.setChildren(getMenu(m.getId()));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*List<Map<String, Object>> list = DBUtils.execQuery(sql);
		if(list==null||list.size()==0){
			return null;
		}
		for(int i=0;i<list.size();i++){
			String id = list.get(i).get("id").toString();
			String text = (String)list.get(i).get("text");
			String path = (String)list.get(i).get("path");
			String describe = (String)list.get(i).get("describe");
			Menu m = new Menu(id, pid, text, path , getMenu(id));
			menu_list.add(m);
		}*/
		return menu_list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuDao menu = new MenuDao();
		String menustr = JSONArray.fromObject(menu.getMenus()).toString();
		System.out.println(menustr);
	}
}
