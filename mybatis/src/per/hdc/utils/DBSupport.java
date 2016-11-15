package per.hdc.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBSupport {
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
	 public static SqlSessionFactory getFactory(){
		 return factory;
	 }
}
