package per.hdc.bean;

public class Use {
	private String use_id;
	private String use_name;
	private String use_pwd;
	private Role user_r;
	public String getUse_id() {
		return use_id;
	}
	public void setUse_id(String use_id) {
		this.use_id = use_id;
	}
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}
	public String getUse_pwd() {
		return use_pwd;
	}
	public void setUse_pwd(String use_pwd) {
		this.use_pwd = use_pwd;
	}
	public Role getUser_r() {
		return user_r;
	}
	public void setUser_r(Role user_r) {
		this.user_r = user_r;
	}
	@Override
	public String toString() {
		return "Use [use_id=" + use_id + ", use_name=" + use_name
				+ ", use_pwd=" + use_pwd + ", user_r=" + user_r + "]";
	}
	
}
