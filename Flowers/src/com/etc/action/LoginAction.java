package com.etc.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.etc.dao.UserDao;
import com.etc.mode.Manager;
import com.etc.mode.User;
import com.etc.service.IManagerService;
import com.etc.service.ManagerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String result;
	private IManagerService service;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		UserDao ud = new UserDao();
		String user_name = request.getParameter("name");
		String user_pwd = request.getParameter("pwd");
		if(!ud.isNameExist(user_name)){
			result = "nameError";
			return SUCCESS;
		}
		if(!ud.isLogin(user_name, user_pwd)){
			result = "pwdError";
			return SUCCESS;
		}
		result = "indexAction";
		User u = ud.findUser(user_name, user_pwd);
		request.getSession().setAttribute("user", u);
		return SUCCESS;
	}
	public String getResult() {
		return result;
	}
	public String logoff() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().removeAttribute("user");
		/*request.getSession().removeAttribute("list_goods");
		request.getSession().removeAttribute("orderdisplay");*/
		return SUCCESS;
	}
	//管理员登录
	public String dbaLogin() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out = response.getWriter();
		// 获取用户输入的参数
		String dba_name = request.getParameter("dba_name");
		String dba_pwd = request.getParameter("dba_pwd");
		System.out.println(dba_name+dba_pwd);
		System.out.println(service);
		Manager manager = service.Login(dba_name);
		System.out.println(manager);
		if(manager==null){
			out.print("{'managerlogin':'false'}");
		}
		else{
			if(!manager.getDba_pwd().equals(dba_pwd)){
				out.print("{'managerlogin':'false'}");
			}else{
				request.getSession().setAttribute("manager", manager);
				out.print("{'managerlogin':'ok'}");
			}
		}
		out.flush();
		return null;
	}
	public IManagerService getService() {
		return service;
	}
	public void setService(IManagerService service) {
		System.out.println(service+"sdfsdfs");
		this.service = service;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
