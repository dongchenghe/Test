package com.etc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.etc.mode.User;
import com.etc.util.DBUtils;

public class UserDao {
	//判断名字是否存在
	public boolean isNameExist(String user_name){
		String sql="SELECT * FROM USER WHERE user_name='"+user_name+"'";
		List<Map<String, Object>> list = DBUtils.execQuery(sql);
		if(list!=null){
			if(list.size()!=0){
				return true;
			}
		}
		return false;
	}
	//注册新用�?
	public int newUser(User u){
		String name = u.getUser_name();
		String pwd =u.getUser_pwd();
		String sex = u.getUser_sex();
		String phone = u.getUser_phone();
		String email = u.getUser_email();
		String addr = u.getUser_addr();
		String sql = "insert into user(user_name,user_pwd,user_sex,user_phone,user_email,user_addr)"
				+ "values('"+name+"','"+pwd+"','"+sex+"','"+phone+"','"+email+"','"+addr+"')";
		// 插入数据
		return DBUtils.execUpdate(sql);
	}
	//获取�?��用户
	public ArrayList<User> getUserList(){
		String sql = "SELECT * FROM user";
		List<Map<String, Object>> list = DBUtils.execQuery(sql);
		if(list==null){
			return null;
		}
		else{
			ArrayList<User> userlist = new ArrayList<User>();
			for(int i=0;i<list.size();i++){
				User u = new User();
				u.setUser_id(list.get(i).get("user_id").toString());
				u.setUser_name((String)list.get(i).get("user_name"));
				u.setUser_pwd((String)list.get(i).get("user_pwd"));
				u.setUser_sex((String)list.get(i).get("user_sex"));
				u.setUser_phone((String)list.get(i).get("user_phone"));
				userlist.add(u);
			}
			return userlist;
		}
	}
	//判断密码是否正确
	public boolean isLogin(String user_name,String user_pwd){
		String sql="SELECT * FROM USER WHERE user_name='"+user_name+"' and user_pwd='"+user_pwd+"'";
		List<Map<String, Object>> list = DBUtils.execQuery(sql);
		if(list!=null){
			if(list.size()!=0){
				return true;
			}
		}
		return false;
	}
	//查询用户返回用户对象
	public User findUser(String user_name, String user_pwd) {
		String sql = "select * from user where user_name = '"+user_name+"'and user_pwd = '"+user_pwd+"'";
		List<Map<String,Object>> userList = DBUtils.execQuery(sql);
		// 查询不到就返回null
		if(userList==null||userList.size()==0){
			return null;
		}
		// 查到了就将数据存在javabean�?
		User user = new User();
		String user_id = userList.get(0).get("user_id").toString();
		user.setUser_id(user_id);
		AddrDao add = new AddrDao();
		user.setUser_name((String)userList.get(0).get("user_name"));
		user.setUser_pwd((String)userList.get(0).get("user_pwd"));
		user.setUser_sex((String)userList.get(0).get("user_sex"));
		user.setUser_phone((String)userList.get(0).get("user_phone"));
		user.setUser_email((String)userList.get(0).get("user_email"));
		user.setUser_addr((String)userList.get(0).get("user_addr"));
		return user;
	}
}
