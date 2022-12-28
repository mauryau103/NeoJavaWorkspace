package first;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class Main {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Product p=new Product();
		p.setPname("Mobile");
		p.setPrice(20000);
		
		s.save(p);
		tx.commit();
	}
}
