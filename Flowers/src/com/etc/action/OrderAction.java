package com.etc.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONArray;

import com.etc.mode.Goods;
import com.etc.mode.Order;
import com.etc.service.GoodsService;
import com.etc.service.IManagerOrderService;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAction extends ActionSupport {
	private IManagerOrderService mod;
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		response.setContentType("text/html;charset=UTF-8");
		String checked = (String)request.getParameter("checked");
		PrintWriter out = response.getWriter();
		ArrayList<Order> list = mod.getAllOrders();
		if(checked.equals("all")){
			list = mod.getAllOrders();
		}else if(checked.equals("unpay")){
			list = mod.getTypeOrders("未付款");
		}else if(checked.equals("unsend")){
			list = mod.getTypeOrders("未发货");
		}
		System.out.println(JSONArray.fromObject(list).toString());
		out.print(JSONArray.fromObject(list).toString());
		out.flush();
		return null;
	}
	public IManagerOrderService getMod() {
		return mod;
	}
	public void setMod(IManagerOrderService mod) {
		this.mod = mod;
	}
	
/*	public static void main(String[] args) {
		ManageOrdersDao mod = new ManageOrdersDao();
		ArrayList<ManagerOrder> list = mod.getAllOrders();
		System.out.println(JSONArray.fromObject(list).toString());
	}*/
}
