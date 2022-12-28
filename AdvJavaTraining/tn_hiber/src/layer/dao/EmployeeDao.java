package layer.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import layer.entity.Employee;
import layer.utility.HibernateUtility;

public class EmployeeDao {
	
	public void addEmployee(Employee emp)
	{
		Session sess=HibernateUtility.getSessionFactory().openSession();
		Transaction tx=sess.beginTransaction();
		sess.save(emp);
		tx.commit();
	}
	public Employee listEmployee(int id)
	{
		Session sess=HibernateUtility.getSessionFactory().openSession();
		Transaction tx=sess.beginTransaction();
		Employee e=(Employee)sess.get(Employee.class, id);
		System.out.println(e);
		return e;
		
	}
	public void updatehqlQueries() {
        Session s=HibernateUtility.getSessionFactory().openSession();
        Transaction tx=s.beginTransaction();
       
         Query q= s.createQuery("update Employee set name = :n where id= :id");
         q.setString("n", "tom");
         q.setInteger("id", 7);
        q.executeUpdate();
        tx.commit();
        }
}
