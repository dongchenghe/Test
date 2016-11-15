package com.etc.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.etc.dao.GoodsShowDao;
import com.etc.service.GoodsShowService;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		GoodsShowService gss = new GoodsShowService();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("jin", gss.getJin());
		request.getSession().setAttribute("new1", gss.getNew());
		request.getSession().setAttribute("hot", gss.getHot());
		return SUCCESS;
	}
}
