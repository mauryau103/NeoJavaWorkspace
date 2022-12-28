package com.neosoft.services;

import java.util.List;

import com.neosoft.beans.Employee;

public interface EmpService {
	
	int addEmployee(Employee e);
	List<Employee> getList();
	boolean updateEmployee(int id,String name);

}
