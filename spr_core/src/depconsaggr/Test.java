package depconsaggr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("depconsaggr/aggrcons.xml");
	
	Employee e1=(Employee) applicationContext.getBean("e1");
	e1.show();
}
}
