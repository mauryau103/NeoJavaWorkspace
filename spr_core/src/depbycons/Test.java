package depbycons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("depbycons/appcontext.xml");
		
		Employee employee=(Employee)context.getBean("e1");
		employee.display();
		
	}
}
