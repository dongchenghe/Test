package com.etc.service;

import java.util.ArrayList;

import com.etc.mode.Order;

public interface IManagerOrderService {
	ArrayList<Order> getAllOrders();
	ArrayList<Order> getTypeOrders(String state);
}
