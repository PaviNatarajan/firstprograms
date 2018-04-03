package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHQL {
public static void main(String[] args){
	SessionFactory sf=HibernateUtility.getSessionFactory();
	Session s=sf.openSession();
	String hq="select obj from pack.Employee obj where obj.salary>30000";
	Query query=s.createQuery(hq);
	@SuppressWarnings("rawtypes")
	List list=((org.hibernate.Query) query).list();
	@SuppressWarnings("rawtypes")
	Iterator it=list.iterator();
	while(it.hasNext()){
		Employee e=(Employee)it.next();
		System.out.println(e.getId()+" "+e.getName()+" " +e.getSalary());
		
	}
	System.out.println("*********");
	String sq="select obj.name,obj.salary from pack.Employee obj";
	org.hibernate.Query q2=s.createQuery(sq);
	@SuppressWarnings("rawtypes")
	List l2=q2.list();
	@SuppressWarnings("rawtypes")
	Iterator it2=l2.iterator();
	while(it2.hasNext()){
		//String empnames=(String)it2.next();
		Object[] o=(Object[])it2.next();
		String name=(String)o[0];
		Double salary=(Double)o[1];
		System.out.println("Name="+name+",salary="+salary);
	}
	s.close();
	sf.close();
	}
}
