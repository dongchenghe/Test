package com.etc.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.apache.logging.log4j.core.jackson.JsonConstants;
import org.apache.struts2.ServletActionContext;

import com.etc.mode.Goods;
import com.etc.service.GoodsService;
import com.etc.service.IGoodsService;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerGoodsAction extends ActionSupport {
	private IGoodsService gds;
	public String execute() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		//response.setContentType("text/html;charset=utf-8");
		//request.setCharacterEncoding("UTF-8");
		String checked = request.getParameter("checked");
		String content = request.getParameter("content");
		request.getSession().setAttribute("content", content);
		request.getSession().setAttribute("checked", checked);
		return SUCCESS;
	}
	public String getGoods() throws IOException{
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		response.setContentType("text/html;charset=UTF-8");
		String checked = (String)request.getParameter("checked");
		System.out.println("de:"+checked);
		PrintWriter out = response.getWriter();
		ArrayList<Goods> allGoods = new ArrayList<Goods>();
		if(checked.equals("all")){
			allGoods = gds.getAllGoods();
		}else if(checked.equals("less")){
			allGoods = gds.getLessGoods();
		}else if(checked.equals("search")){
			//allGoods = gds.getSercherGoods(content);
		}
		System.out.println(JSONArray.fromObject(allGoods).toString());
		out.print(JSONArray.fromObject(allGoods).toString());
		out.flush();
		return null;
	}
	public IGoodsService getGds() {
		return gds;
	}
	public void setGds(IGoodsService gds) {
		this.gds = gds;
	}
	
}
