package pack;

public class Employee {
 private int empid;
 private String name;
 private double salary;
 private String desg;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empid, String name, Double salary, String desg) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
	this.desg = desg;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
	

}
