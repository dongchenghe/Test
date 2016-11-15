package com.etc.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.etc.service.MenuService;
import com.opensymphony.xwork2.ActionSupport;

public class MenuAction extends ActionSupport {
	
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		MenuService ms  = new MenuService();
		String menu = ms.getMenuStr();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(menu);
		out.flush();
		return null;
	}
}
