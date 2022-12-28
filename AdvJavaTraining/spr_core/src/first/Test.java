package first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
    	Resource rs=new ClassPathResource("first/context.xml");
    	BeanFactory bf=new XmlBeanFactory(rs);
    	
    	Student student =(Student) bf.getBean("stu");
    	student.setName("Sakshi");
    	student.display();
    	
    	Student student1 =(Student) bf.getBean("stu");
    	student1.setName("Sanju");
    	student1.display();
    	
    	Student student2 =(Student) bf.getBean("stu");
    	student2.display();
    	
    	
    }
}
