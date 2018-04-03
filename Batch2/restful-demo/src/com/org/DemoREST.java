package com.org;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.service.spi.ServiceRegistryImplementor;

import sun.misc.Service;
import sun.print.resources.serviceui;

@Path("/demo")
public class DemoREST {
	private static EmployeeService service=new EmployeeService();
	@Path("/simple")
	@GET
	@Produces(MediaType.APPLICATION_XML)
		public String test(){
			System.out.println("test() is called");
			return "<greeting>HelloRESTFUL</greeting>";
		}
	@Path("/getCustomer")
	@GET
	@Produces(MediaType.APPLICATION_XML)
		public Customer sendCustomer(){
			System.out.println("SendCustomer is called");
			Customer c=new Customer(111,"Rahul",34);
			return c;
	}
	@Path("/storeCustomer")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_XML)
	public String receiveCustomer(Customer c){
		System.out.println("Id="+c.getCustomerId());
		System.out.println("NAME="+c.getCustomerName());
		System.out.println("SALARY="+c.getAge());
		return "Stored Successfully";
	} 
	@Path("/storeEmp")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.TEXT_PLAIN)
	@POST
	public String storeEmployee(Employee emp){
		int count=service.insertObject(emp);
		return count+"Record Aded";
	}
	@Path("/update/{i}/{s}")
	@PUT
	@Produces(MediaType.APPLICATION_XML)
	
	public Employee updateEmployeeSalary(@PathParam("i")int id,@PathParam("s")double salary ){
		Employee e=service.updatesalary(id,salary);
		return e;
	}
		}
