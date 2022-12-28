package layer;

import layer.dao.EmployeeDao;

import layer.entity.Address;
import layer.entity.Employee;


public class Main {
	public static void main(String[] args) {
		
//		StudentDao studentDao=new StudentDao();
//		Student student = new Student("Tilaka","MCA",84);
//		studentDao.addStudent(student);
//		
//		studentDao.li`stStudent();
		
		
		Employee employee=new Employee("Sandy", 85000);
		Address address=new Address("Santi dham", "Chennai", "421605");
		employee.setAddress(address);
		
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.addEmployee(employeeDao);
	}
}

//state of Entity Object

//1.transient -- Student student = new Student("umesh","Developer",123);
//2.persistence -- st.save(st),st.persist(st),........
//3.detached
//4.removed