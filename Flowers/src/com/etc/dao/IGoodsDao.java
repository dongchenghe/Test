package com.etc.dao;

import java.util.ArrayList;

import com.etc.mode.Goods;

public interface IGoodsDao {
	Goods getGoods(String id);
	ArrayList<Goods> getLessGoods();
	ArrayList<Goods> getSearchGoods(String str);
	ArrayList<Goods> getAllGoods();
	void updateGoods(Goods goods);
}
