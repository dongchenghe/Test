package com.etc.service;

import java.util.ArrayList;

import com.etc.dao.GoodsShowDao;
import com.etc.mode.Goods;

public class GoodsShowService {
	private GoodsShowDao gsd = new GoodsShowDao();
	public ArrayList<Goods> getJin(){
		return gsd.getJin();
	}
	public ArrayList<Goods> getNew(){
		return gsd.getNew();
	}
	public ArrayList<Goods> getHot(){
		return gsd.getHot();
	}
}
