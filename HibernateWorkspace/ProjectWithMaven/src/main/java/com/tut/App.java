package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started..." );
        
      //  Configuration conf = new Configuration();
        //conf.configure("hibernate.cfg.xml");
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        //creating student
        //transient state--- no effect on database
        
        Student st = new Student();
        st.setId(102);
        st.setName("John");
        st.setCity("Delhi");
        
        System.out.println(st);
        
        
        //creating object of address claa
        
        Address ad = new Address();
        ad.setStreet("street1");
        ad.setCity("Delhi");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.234);
        
        //-------------//
        
        //Reading image
        
//       FileInputStream fis =new FileInputStream("src/main/java/pic1.png");
        
//       byte[] data = new byte[fis.available()];
//       fis.read(data);
//        ad.setImage(data);
        //done with setting the image
        
        
        
        
        //-------------//
        //now we have to save the object and save method is in session object //after calling save method it goes to persistant state
        
        
        //first time we have to use opensession not getcurrentsession.
        Session session = factory.openSession();
        //Transaction tx = session.beginTransaction() ---(optional).
        session.beginTransaction();
        //persistant state by using save method . and it represent one row and it associate witrh session.  
        session.save(st);
        session.save(ad);
        
        //tx.commit
        session.getTransaction().commit();
        
        //after this detached state will happen
        session.close();
        
        
        factory.close();
        
//        System.out.println(factory);        
//        System.out.println(factory.isClosed());
        
        
    }
}
//Commonly used hibernate annotation

/*
 * @Entity -- use to mark any class as Entity
 * @Table -- use to change the table details like name
 * @Id - use to mark column as id(primary key)
 * @GeneratedValue - hibernate will automatically generate values for that using an internal sequence .therefore we don't have to set it manually
 * @Column - can be used to specify column mappings.for example to change the column name in the associated table in database.
 * @Transient --- this tells hibernate not to save this field . and not create column also.
 * @Temporal -- over a date field tells hibernate the format in which the date need to be saved.
 * @Lob - it tells hibernate that this is a large object ,not a simple object.
 * @oneToOne,@OneToMany,@ManyToOne,@JoinColumn,etc
 */
 