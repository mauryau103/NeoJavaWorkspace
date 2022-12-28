package com.neosoft.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neosoft.beans.Employee;
import com.neosoft.services.EmpService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
		
		EmpService eService=(EmpService)applicationContext.getBean("empService");
		
		Employee employee=new Employee();
		
		//employee.setEmpnameString("Umesh");
		//employee.setEmpsal(20000);
		
		//eService.addEmployee(employee);
		//System.out.println(eService.getList());
		
		eService.updateEmployee(2, "Aashish");
	}
}
