package pack;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration();
		c.configure();
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx = s.beginTransaction();
		Employee emp=new Employee(556,"vikram",35000);
		Employee emp1=new Employee(676,"gram",40000);
		s.save(emp);
		s.save(emp1);
		tx.commit();
		Employee e=(Employee) s.get(Employee.class, 555);
		System.out.println("Id= "+e.getId()+" ,Name="+e.getName()+", Salary= "+e.getSalary());
		s.close();
		sf.close();
		System.out.println("DONE");
	}

}
