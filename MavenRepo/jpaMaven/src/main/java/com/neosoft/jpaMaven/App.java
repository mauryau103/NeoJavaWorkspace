package com.neosoft.jpaMaven;
	
/**
 * Hello world!
 *
 */
import javax.persistence.*;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("JpaMaven");
        EntityManager eManager=emFactory.createEntityManager();
        
        eManager.getTransaction().begin();
        
        Student student=new Student("Umesh",73);
        
        eManager.persist(student);
        eManager.getTransaction().commit();
        
    }
}
