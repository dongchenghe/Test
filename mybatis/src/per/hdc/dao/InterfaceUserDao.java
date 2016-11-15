package per.hdc.dao;

import java.util.List;
import java.util.Map;

import per.hdc.bean.Use;
import per.hdc.bean.User;

public interface InterfaceUserDao {
	User getUser(int id);
	List<User> likeUser(String name);
	List<User> queryDy(User uu);
	List<User> queryDyArry(String[] str);
	List<User> queryDyMap(Map cc);
	void deletUser(String id);
	void insertUser(User user);
	void updateUser(Map mm);
	Use selectRUser(String id);
}
