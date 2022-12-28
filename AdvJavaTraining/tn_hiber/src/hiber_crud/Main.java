package hiber_crud;
import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class Main {
	static SessionFactory sf;
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("Hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		Main m=new Main();
		//m.addStudent("Abid", "bcom", 30000);
		//m.deleteStudent(1);
		//m.updateStudent(2);
		m.listStudent();
		
	}
	public Integer addStudent(String name,String course,double average)
	{
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		
		Student st=new Student(name,course,average);
		Integer i=(Integer)sess.save(st);
		tx.commit();
		return i;
	}
	public void listStudent()
	{
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		
		List ls=sess.createQuery("from Student").list();
		for(Iterator it=ls.iterator();it.hasNext();)
		{
			Student s=(Student)it.next();
			System.out.println(s.getSid());
			System.out.println(s.getSname());
			System.out.println(s.getCourse());
			System.out.println(s.getAverage());
		}
		
	}
	public void deleteStudent(Integer i)
    {
        Session sess=sf.openSession();
        Transaction tx=sess.beginTransaction();
        Student s=(Student)sess.get(Student.class,i);
        sess.delete(s);
        tx.commit();
     }
	public void updateStudent(Integer i)
    {
       Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        Student st=(Student)s.load(Student.class,i);
        st.setSname("new Name");
        s.update(st);
        tx.commit();
        }
}
