package com.etc.service;

import com.etc.dao.IManagerDao;
import com.etc.dao.ManagerDao;
import com.etc.mode.Manager;


/**
 *	处理管理员的登陆业务 
 * @author Administrator
 *
 */
public class ManagerService implements IManagerService {
	// 通过用户名先判断是否存在该管理员
	private IManagerDao dao;
	public Manager Login(String dba_name){
		return dao.managerLogin(dba_name);
	}
	public IManagerDao getDao() {
		return dao;
	}
	public void setDao(IManagerDao dao) {
		this.dao = dao;
	}
}
