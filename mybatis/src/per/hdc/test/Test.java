package per.hdc.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import per.hdc.bean.Use;
import per.hdc.bean.User;
import per.hdc.dao.InterfaceUserDao;
import per.hdc.utils.DBSupport;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqlSession sesstion = DBSupport.getFactory().openSession();
		InterfaceUserDao userdao = sesstion.getMapper(InterfaceUserDao.class);
		/*User u = userdao.getUser(11);
		System.out.println(u);*/
		/*List<User> li = userdao.likeUser("%二%");
		for(User us: li){
			System.out.println(us);
		}*/
		/*//用map传参数
		Map mm = new HashMap<String, Object>();
		mm.put("id", "22");
		User uu = new User();
		uu.setUser_name("王二虎");
		mm.put("user", uu);
		userdao.updateUser(mm);
		sesstion.commit();*/
		/*Use use = userdao.selectRUser("1");
		System.out.println(use);*/
		/*User use1 = new User(null,"贺冬成","123456",null);
		List<User> listuser = userdao.queryDy(use1);
		for(User us: listuser){
			System.out.println(us);
		}*/
		String[] str ={"1","11","12","20"};
		/*userdao.queryDyArry(str);
		List<User> listuser = userdao.queryDyArry(str);
		for(User us: listuser){
			System.out.println(us);
		}*/
		Map cc = new HashMap();
		cc.put("abc", str);
		List<User> listuser = userdao.queryDyMap(cc);
		for(User us: listuser){
			System.out.println(us);
		}
	}

}
