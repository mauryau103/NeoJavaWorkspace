package layer.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import layer.entity.Student;
import layer.utility.HibernateUtility;

public class StudentDao {
	
public Integer addStudent(Student student) {
		
		Session session=HibernateUtility.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		//Student st=new Student(name,course,average);
		Integer i=(Integer)session.save(student);
		tx.commit();
		return i;
	}

public void listStudent() {
	Session session=HibernateUtility.getSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	
	Criteria criteria=session.createCriteria(Student.class);
	criteria.add(Restrictions.gt("average", 120.0));
	
	//List ls=session.createQuery("from Student").list();
	
	List ls=criteria.list();
	
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
	Session session=HibernateUtility.getSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	Student s=(Student) session.get(Student.class, i);
	session.delete(s);
	tx.commit();
}
public void updatestudent(Integer i)
{
	Session session=HibernateUtility.getSessionFactory().openSession();
    Transaction tx=session.beginTransaction();
    Student st=(Student)session.load(Student.class,i);
    st.setSname("new Name");
    session.update(st);
    tx.commit();
    }
	
}
