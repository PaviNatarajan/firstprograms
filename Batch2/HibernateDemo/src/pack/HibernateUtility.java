package pack;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory(){
		SessionFactory sf=null;
		Configuration cfg=new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
		return sf;
	}

}
