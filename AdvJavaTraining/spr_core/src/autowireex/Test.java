package autowireex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con=new ClassPathXmlApplicationContext("autowireex/auto.xml");
        A a=con.getBean("a1",A.class);
        a.display();

    }
}
