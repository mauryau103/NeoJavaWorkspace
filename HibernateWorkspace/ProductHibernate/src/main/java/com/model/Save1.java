package com.model;

//--1st step -- import hibernate Api

import org.hibernate.*;
import org.hibernate.cfg.*;


public class Save1 {
	
	public static void main(String[] args) throws HibernateException {
		
		/*
		 * - This is our original java programe this application is doing to 
		 * store the object in db.fot this using hibernate concept and save the object in dbase.
		 * */
		
		//--2nd step -- create an object of confiuration class
		//configuration is a class
		
	//	Configuration conf = new Configuration();
		//conf.configure();
	
		//--3rd step -- create a high level of object called session factory--
		//SeesionFactory is Interface
	
	//	SessionFactory factory = conf.buildSessionFactory();
		
		SessionFactory Factory = new Configuration().configure().buildSessionFactory();
	}
	
	
	
	
	

}
