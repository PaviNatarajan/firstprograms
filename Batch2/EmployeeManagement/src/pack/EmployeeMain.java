package pack;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args){
		int ch;
		ApplicationContext context=new ClassPathXmlApplicationContext("pack.xml");
		EmployeeService service=(EmployeeService)context.getBean("service");
		Employee employee=(Employee)context.getBean("Employee");
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1,ADD");
			System.out.println("2,Delete byId");
			System.out.println("3,Display");
			System.out.println("4,Update");
			System.out.println("5,Exit");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch){
			case 1://insert
			{
				System.out.println("Performing insert");
				System.out.println("Enter an Id");
				employee.setEmpid(sc.nextInt());
				System.out.println("Enter a name");
				employee.setName(sc.next());
				System.out.println("Enter salary");
				employee.setSalary(sc.nextDouble());
				System.out.println("Enter Designation");
			    employee.setDesg(sc.next());
				service.insert(employee);
				System.out.println("Recorded");
				break;
			}
				case 2:{
					System.out.println("Enter the employee id");
					employee.setEmpid(sc.nextInt());
					service.delete(employee);
					System.out.println("Recorde deleted");
					break;
				}
				case 3:
				{
					System.out.println("Display details");
					//service.getAllEmployee(employee);
					List<Employee>l=service.getAllEmployees();
					for(Employee e:l){
						System.out.println(e.getEmpid()+""+e.getName()+""+e.getSalary()+""+e.getDesg());
						break;
					}
				}
				case 4:{
					System.out.println("Enter an employee id to be updated");
					employee.setEmpid(sc.nextInt());
					service.insert(employee);
					int ch1;
					do
					{
					System.out.println("1 name 2 salary 3 designation 4 exit");
					ch1=sc.nextInt();
                 switch(ch1)
                 {
                 case 1:
                	
                	 employee.setName(sc.next());
					service.update(employee);
					break;
                 case 2:
                	 employee.setSalary(sc.nextDouble());
         			service.update(employee);
         			break;
                 case 3:
                	 employee.setDesg(sc.next());
         			service.update(employee);
         			break;
                 case 4:
                	 System.out.println("EXIT");
                	 
                 }
				}while(ch1<4);
					break;
				}
			case 5:{
			System.out.println("Exit from employee");
					}
			}
		}while(ch!=5);
	}

}


			