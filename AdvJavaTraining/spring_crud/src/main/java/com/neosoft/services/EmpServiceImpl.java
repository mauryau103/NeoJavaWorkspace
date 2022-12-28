package com.neosoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.beans.Employee;
import com.neosoft.dao.EmpDao;

@Service("empService")
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpDao empDao;

	public int addEmployee(Employee e) {
		
		return empDao.addEmployee(e) ;
	}

	public List<Employee> getList() {
		// TODO Auto-generated method stub
		return empDao.getList();
	}

	public boolean updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		return empDao.updateEmployee(id, name);
	}

	
	
}
