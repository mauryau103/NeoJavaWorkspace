package jdbctemp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con=new ClassPathXmlApplicationContext("jdbctemp/JdbcConfig.xml");
        StudentDaoImpl stu= (StudentDaoImpl) con.getBean("edao");
        stu.create(1,"Umesh","BSc");
    }
}
