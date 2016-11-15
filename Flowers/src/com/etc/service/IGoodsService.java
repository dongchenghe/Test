package com.etc.service;

import java.util.ArrayList;

import com.etc.mode.Goods;

public interface IGoodsService {
	Goods getGoods(String id);
	ArrayList<Goods> getLessGoods();
	ArrayList<Goods> getAllGoods();
	ArrayList<Goods> getSercherGoods(String id);
	void updateGoods(Goods goods);
}
