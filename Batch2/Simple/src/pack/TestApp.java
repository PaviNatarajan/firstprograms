 package pack;

public class TestApp {
	public static void main(String[] args){
		Employee emp=new Employee("Alexandar",35);
		System.out.println(emp);
		Manager mgr=new Manager("bob",45,10);
		System.out.println(mgr);
	}
} 
