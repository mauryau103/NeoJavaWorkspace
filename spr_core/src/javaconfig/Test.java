package javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Demo.class);
	
	Employee employee=(Employee)applicationContext.getBean("employee");
	employee.empChk();
}
}
