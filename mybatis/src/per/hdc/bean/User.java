package per.hdc.bean;

import java.util.ArrayList;
import java.util.Date;

/**
 * 用户的信�?
 * @author Administrator
 *
 */
public class User {
	private String user_id;
	private String user_name;
	private String user_pwd;
	private String user_sex;
	private String user_phone;
	private String user_email;
	private String user_addr;
	private ArrayList<Receive> receive_list;
	
	public User(String user_id, String user_name, String user_pwd,
			String user_sex) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.user_sex = user_sex;
	}
	
	public User() {
		super();
	}

	public ArrayList<Receive> getReceive_list() {
		return receive_list;
	}
	public void setReceive_list(ArrayList<Receive> receive_list) {
		this.receive_list = receive_list;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_addr() {
		return user_addr;
	}
	public void setUser_addr(String user_addr) {
		this.user_addr = user_addr;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name
				+ ", user_pwd=" + user_pwd + ", user_sex=" + user_sex
				+ ", user_phone=" + user_phone + ", user_email=" + user_email
				+ ", user_addr=" + user_addr + ", receive_list=" + receive_list
				+ "]";
	}
	
}
