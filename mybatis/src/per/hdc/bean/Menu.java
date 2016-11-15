package per.hdc.bean;

import java.util.List;

public class Menu {
	private String id ;
	private String pid ;
	private String text;
	private String path;
	private String describe;
	private List<Menu> children;
	public Menu(){}
	public Menu(String id,String pid,String text,String path,List<Menu> children){
		this.id = id;
		this.pid = pid;
		this.text = text;
		this.path = path;
		this.children =  children;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public List<Menu> getChildren() {
		return children;
	}
	public void setChildren(List<Menu> children) {
		this.children = children;
	}
	
}
