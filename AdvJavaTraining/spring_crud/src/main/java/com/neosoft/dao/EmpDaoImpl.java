package com.neosoft.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.neosoft.beans.Employee;

@Repository
public class EmpDaoImpl implements EmpDao {
	@PersistenceContext
	private EntityManager eManager;
	
	@Transactional
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		eManager.persist(e);
		return e.getEmpno();
	}

	public List<Employee> getList() {
		// TODO Auto-generated method stub
		TypedQuery<Employee> qr=eManager.createQuery("select e from Employee e",Employee.class);
		List<Employee> ls = qr.getResultList();
		return ls;
	}
@Transactional
	public boolean updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		boolean b=false;
		Employee employee=eManager.find(Employee.class, id);
		employee.setEmpnameString(name);
		eManager.merge(employee);
		
		b=true;
		
		return b;
	}

}
