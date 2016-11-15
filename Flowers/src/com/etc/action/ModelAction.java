package com.etc.action;
import com.etc.dao.UserDao;
import com.etc.mode.User;
import com.opensymphony.xwork2.ModelDriven;

public class ModelAction implements ModelDriven<User> {
	private User us = new User();
	public String isNameExist(){
		String user_name = us.getUser_name();
		UserDao ud = new UserDao();
		if(ud.isNameExist(user_name)){
			return "exist";
		}
		return "notexist";
	}
	public String register(){
		System.out.println(us.getUser_name());
		UserDao ud = new UserDao();
		if(isNameExist().equals("notexist")){
			int a=ud.newUser(us);
			return "success";
		}
		return "failure";
	}
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return us;
	}
}
