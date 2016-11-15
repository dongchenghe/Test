package com.etc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.etc.mode.Receive;
import com.etc.util.DBUtils;


public class AddrDao {
	public ArrayList<Receive> getReceive(String user_id){
		String sql = "SELECT * FROM user_receive_info WHERE user_id ="+user_id;
		List<Map<String,Object>> list = DBUtils.execQuery(sql);
		// 查询不到就返回null
		if(list==null||list.size()==0){
			return null;
		}
		ArrayList<Receive> receive_list = new ArrayList<Receive>();
		for(int i=0;i<list.size();i++){
			Receive r = new Receive();
			r.setId(list.get(i).get("id").toString());
			r.setReceive_addr((String)list.get(i).get("receive_addr"));
			r.setReceive_name((String)list.get(i).get("receive_name"));
			r.setReceive_phone((String)list.get(i).get("receive_phone"));
			receive_list.add(r);
		}
		return receive_list;
	}
	public void updatePersonalInfoDao(String user_id,String field,String value){
		String sql="update user set "+field+" ='"+value+"' where user_id='"+user_id+"'";
		DBUtils.execUpdate(sql);
	}
}
