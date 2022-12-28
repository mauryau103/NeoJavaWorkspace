package com.neosoft.dao;

import java.util.List;

import com.neosoft.beans.Employee;

public interface EmpDao {

	int addEmployee(Employee e);
	List<Employee> getList();
	boolean updateEmployee(int id,String name);
	
}
