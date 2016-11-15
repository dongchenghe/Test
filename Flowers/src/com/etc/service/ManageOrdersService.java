package com.etc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.etc.dao.IOrderDao;
import com.etc.mode.Order;

/**
 * 处理后台订单业务
 * @author Administrator
 *
 */
public class ManageOrdersService implements IManagerOrderService{
	private IOrderDao dao;
	public  ArrayList<Order> getAllOrders(){
		return dao.getAllOrders();
	}
	public ArrayList<Order> getTypeOrders(String state){
		return dao.getTypeOrders(state);
	}
	public IOrderDao getDao() {
		return dao;
	}
	public void setDao(IOrderDao dao) {
		this.dao = dao;
	}
	
}
