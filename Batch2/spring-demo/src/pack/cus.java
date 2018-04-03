package pack;

public class cus {
	private String name;
	private int age;
	private Addinfo ax;
	public cus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public cus(String name, int age, Addinfo ax) {
		super();
		this.name = name;
		this.age = age;
		this.ax = ax;
	}

	public void display()
	{
		System.out.println(name+""+age);
		String s=ax.display1();
		System.out.println(s);
	}

}
