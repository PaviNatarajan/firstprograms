package pack;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private Identifier id;
	
	@Autowired
	private Address address;
	
	public Customer() {
		super();
		System.out.println("customer() is called");
	}
	public Customer(Identifier id) {
		super();
		System.out.println("Customer(identifier) is called");
		this.id = id;
	}
	public Identifier getId() {
		return id;
	}
	public void setId(Identifier id) {
		System.out.println("SetId() is called ");
		this.id = id;
	}
public void getInformations(){
	id.display();
	address.display();
}
public Address getAddress(){
	return address;
}
public void setAddress(Address address){
	this.address=address;
}
}
