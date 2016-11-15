package com.etc.dao;

import java.util.ArrayList;

import com.etc.mode.Order;

public interface IOrderDao {
	ArrayList<Order> getAllOrders();
	ArrayList<Order> getTypeOrders(String state);
}
