package layer.dao;
import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Restrictions;

import layer.entity.Student;
import layer.utility.HibernateUtility;
public class StudentDao {
	public Integer addStudent(Student student)
	{
		Session sess=HibernateUtility.getSessionFactory().openSession();
		Transaction tx=sess.beginTransaction();
		
		//Student st=new Student(name,course,average);
		Integer i=(Integer)sess.save(student);
		tx.commit();
		return i;
	}
	public void listStudent()
	{
		Session sess=HibernateUtility.getSessionFactory().openSession();
		Transaction tx=sess.beginTransaction();
		
		Criteria cr=sess.createCriteria(Student.class);
		cr.add(Restrictions.gt("average",70.0));
		List ls=cr.list();
		//List ls=sess.createQuery("from Student").list();
		for(Iterator it=ls.iterator();it.hasNext();)
		{
			Student s=(Student)it.next();
			System.out.println(s.getSid());
			System.out.println(s.getSname());
			System.out.println(s.getCourse());
			System.out.println(s.getAverage());
		}
		
	}
}
