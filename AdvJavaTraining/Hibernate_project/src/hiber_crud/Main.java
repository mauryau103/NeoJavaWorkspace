package hiber_crud;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	static SessionFactory sf;
	
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		Main m=new Main();
		m.addStudent("sid","BE", 489);
		//m.listStudent();
	}
	
	public Integer addStudent(String name,String course,double average) {
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Student st=new Student(name,course,average);
		Integer i=(Integer)session.save(st);
		tx.commit();
		return i;
		
		
	}
	
	public void listStudent() {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		List ls=session.createQuery("from Student").list();
		for(Iterator it=ls.iterator();it.hasNext();) // one by one want print the data
		{
			Student s=(Student)it.next();
			System.out.println(s.getId());
			System.out.println(s.getSname());
			System.out.println(s.getCourse());
			System.out.println(s.getAverage());

		
		}
	}
	
	public void deletestudent(Integer i) {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Student s=(Student) session.get(Student.class, i);
		session.delete(s);
		tx.commit();
	}
	public void updatestudent(Integer i)
    {
       Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        Student st=(Student)s.load(Student.class,i);
        st.setSname("new Name");
        s.update(st);
        tx.commit();
        }
}
