package per.hdc.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import per.hdc.bean.User;

public class UserDao {
	private static SqlSessionFactory factory ;
	 static{
	      try {
			InputStream is = Resources.getResourceAsStream("jdbconf.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	public User getUser(int id){
	    User user = null;
	    SqlSession session = factory.openSession();
	    user = (User)session.selectOne("per.hdc.mapper.userMapper.getUser", id);
	    return user;
	}
	//查找
	public List<User> likeUser(String name){
		 SqlSession session = factory.openSession();
		  List<User> list = session.selectList("per.hdc.mapper.userMapper.likeUser", name);
		return list;
	}
	//删除
	public void deletUser(String id){
		 SqlSession session = factory.openSession();
		 session.delete("per.hdc.mapper.userMapper.deletUser", id);
		 session.commit();
	}
	//增
	public void insertUser(User user){
		SqlSession session = factory.openSession();
		session.insert("per.hdc.mapper.userMapper.insertUser", user);
		session.commit();
	}
	//改
	public void updateUser(User user){
		SqlSession session = factory.openSession();
		session.update("per.hdc.mapper.userMapper.updateUser", user);
		session.commit();
	}
	public static void main(String[] args) {
		UserDao ud = new UserDao();
		//System.out.println(ud.getUser(1));
		List<User> list = ud.likeUser("%二%");
		for(User u: list){
			System.out.println(u);
		}
		//ud.deletUser("21");
		User u = new User();
		u.setUser_id("24");
		u.setUser_name("小哈哈");
		u.setUser_phone("1576074148");
		u.setUser_pwd("123456");
		ud.updateUser(u);
		/*	ud.insertUser(u);*/
		
	}
}
