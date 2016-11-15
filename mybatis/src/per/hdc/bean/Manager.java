package per.hdc.bean;
/**
 * 管理员的信息
 * @author Administrator
 *
 */
public class Manager {
	private int dba_id;
	private String dba_name;
	private String dba_pwd;
	public int getDba_id() {
		return dba_id;
	}
	public void setDba_id(int dba_id) {
		this.dba_id = dba_id;
	}
	public String getDba_name() {
		return dba_name;
	}
	public void setDba_name(String dba_name) {
		this.dba_name = dba_name;
	}
	public String getDba_pwd() {
		return dba_pwd;
	}
	public void setDba_pwd(String dba_pwd) {
		this.dba_pwd = dba_pwd;
	}
	
}
