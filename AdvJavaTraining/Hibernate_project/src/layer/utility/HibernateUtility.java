package layer.utility;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import layer.entity.Address;
import layer.entity.Employee;


public class HibernateUtility {
	
	private static SessionFactory sFactory;
	
	public static SessionFactory getSessionFactory()
	{
		Configuration cfgConfiguration=new Configuration();
		
		Properties properties = new Properties();
		properties.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
		properties.put(Environment.URL,"jdbc:mysql://localhost:3306/jdbc_umesh");
		properties.put(Environment.USER,"root");
		properties.put(Environment.PASS,"root");
		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
		properties.put(Environment.SHOW_SQL,"true");
		properties.put(Environment.HBM2DDL_AUTO,"create");
		
		cfgConfiguration.setProperties(properties);
		//cfgConfiguration.addAnnotatedClass(Student.class);
		cfgConfiguration.addAnnotatedClass(Employee.class);
		cfgConfiguration.addAnnotatedClass(Address.class);
		sFactory = cfgConfiguration.buildSessionFactory();
		return sFactory;
	}
	
}
