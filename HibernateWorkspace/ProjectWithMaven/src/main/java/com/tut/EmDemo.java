package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	
	
	Student stud1 = new Student();
	stud1.setId(1431);
	stud1.setName("Umesh Kumar");
	stud1.setCity("lko");
	
	Certificate cert = new Certificate();
	cert.setCourse("Android");
	cert.setDuration("2 months");
	stud1.setCertificate(cert);
	
	
	Student stud2 = new Student();
	stud2.setId(131);
	stud2.setName("Ashish");
	stud2.setCity("luknow");
	
	Certificate cert1 = new Certificate();
	cert1.setCourse("Python");
	cert1.setDuration("3 months");
	stud2.setCertificate(cert1);
	
	
	Session sess= factory.openSession();
	Transaction tx = sess.beginTransaction();
	sess.save(stud1);
	sess.save(stud2);
	tx.commit();
	
	sess.close();
	factory.close();
}
}
