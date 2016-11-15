package com.etc.service;

import java.util.ArrayList;
import com.etc.dao.IGoodsDao;
import com.etc.mode.Goods;


public class GoodsService implements IGoodsService {
	private IGoodsDao gd;
	public Goods getGoods(String id){
		Goods g = gd.getGoods(id);
		if(g==null){
			//处理逻辑？？？？
			return null;
		}else{
			return g;
		} 
	}
	public ArrayList<Goods> getLessGoods(){
		return gd.getLessGoods();
	}
	public ArrayList<Goods> getAllGoods(){
		return gd.getAllGoods();
	}
	public ArrayList<Goods> getSercherGoods(String id){
		return gd.getSearchGoods(id);
	}
	public void updateGoods(Goods goods){
		gd.updateGoods(goods);
	}
	public IGoodsDao getGd() {
		return gd;
	}
	public void setGd(IGoodsDao gd) {
		this.gd = gd;
	}
	
}
