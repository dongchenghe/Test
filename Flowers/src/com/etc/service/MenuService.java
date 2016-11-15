package com.etc.service;

import java.util.List;

import net.sf.json.JSONArray;

import com.etc.dao.MenuDao;
import com.etc.mode.Menu;

public class MenuService {
	private MenuDao md = new MenuDao();
	public String getMenuStr(){
		String menustr = JSONArray.fromObject(md.getMenus()).toString();		
		return menustr;
	}
}
