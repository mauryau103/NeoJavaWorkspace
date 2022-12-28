package first;


import org.hibernate.cfg.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		
		
		Product p =new Product();
		
		
		p.setPname("Umesh");
		p.setPrice(200);
		
		s.save(p);
		tx.commit();
		
	
		
	}
}
