package com.neosoft.spring.jdbctemp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/neosoft/spring/jdbctemp/JdbcConfig.xml");
	
	StudentDaoImpl stud=(StudentDaoImpl) context.getBean("edao");
	
	stud.create(1, "Umesh", "BSc");
}
}
