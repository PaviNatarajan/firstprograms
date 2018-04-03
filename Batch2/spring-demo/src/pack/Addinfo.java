package pack;

public class Addinfo {
	private String city;
	private String state;
	
	public Addinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Addinfo(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public String display1(){
		return city+" "+state;
	}
}
