package testspring;

public class stuinfo {
 private String dept;
 private String  name;
	
	public stuinfo() {
		// TODO Auto-generated constructor stub
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public stuinfo(String dept, String name) {
		super();
		this.dept = dept;
		this.name = name;
	}
	
}
