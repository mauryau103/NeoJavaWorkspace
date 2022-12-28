package layer.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import layer.entity.Employee;
import layer.utility.HibernateUtility;

public class EmployeeDao {
	public void addEmployee(EmployeeDao emp) {
		Session session=HibernateUtility.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(emp);
		tx.commit();
	}
	
	public Employee listEmployee(int id) {
		Session session=HibernateUtility.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Employee employee=(Employee)session.get(Employee.class, id);
		System.out.println(employee);
		tx.commit();
		
		return employee;
	}
	
}
