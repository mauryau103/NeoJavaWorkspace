package layer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import layer.dao.EmployeeDao;
import layer.dao.StudentDao;
import layer.entity.Address;
import layer.entity.Employee;
import layer.entity.Student;
import layer.utility.HibernateUtility;

public class Main {

	public static void main(String[] args) {
		/*StudentDao std=new StudentDao();
		Student st=new Student("Abid", "BE", 80.0);
		//std.addStudent(st);
		std.listStudent();*/
		Employee emp=new Employee("Abc", 50000);
		Address ad=new Address("Noida", "Mumbai", "384759");
		emp.setAddress(ad);
		
		EmployeeDao edao=new EmployeeDao();
		edao.addEmployee(emp);
		//edao.listEmployee(0);
		Main main = new Main();
		main.hqlQueries();

	}

	public void hqlQueries() {
		Session sess=HibernateUtility.getSessionFactory().openSession();
		Transaction tx=sess.beginTransaction();
		
		Query qrQuery=sess.createQuery("from Employee where id= :id");
		qrQuery.setInteger("id", 1);
		Employee employee=(Employee)qrQuery.uniqueResult();
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getAddress().getCity());
		
	}
}
/*
 * 1. transient:- Student st=new Student("A","Java",5);
 * 2. persistence:- session.save(st),load(st),update(st),delete(st);
 * 3. detached:- session.close(),clear(),awake();
 * 4. removed:- session.remove();
 */