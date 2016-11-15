package com.etc.dao;

import java.util.List;
import java.util.Map;

import com.etc.mode.Manager;
import com.etc.util.DBUtils;
/**
 * 通过用户名和密码判断用户是否合法
 * @author Administrator
 *
 */
public class ManagerDao {
	// 通过用户名判断数据库中是否存在
	public Manager managerLogin(String dba_name){
		String sql1 = "select * from dba where dba_name = '"+dba_name+"'";
		List<Map<String,Object>> list = DBUtils.execQuery(sql1);
		// 没有查出数据
		if(list==null||list.size()==0){			
			return null;
		}
		Manager manager = new Manager();
		manager.setDba_name((String)list.get(0).get("dba_name"));
		manager.setDba_pwd((String)list.get(0).get("dba_pwd"));
		return manager;
	}
}
