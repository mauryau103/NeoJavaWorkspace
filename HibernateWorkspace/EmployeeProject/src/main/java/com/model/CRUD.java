package com.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.MyConnection;

import com.pojo.Employee;
import com.pojo.Employee2;
public class CRUD  implements EmployeeDao{
	SessionFactory sfactory;
	public CRUD() {
			sfactory=MyConnection.connect();
			System.out.println("Connection Done.......");
	}
	public boolean addEmployee(Employee em) {
		boolean b=false;
		try(Session session=sfactory.openSession();){
		Transaction tr=session.beginTransaction();
		Serializable id= session.save(em); // insert query  // persists
		tr.commit();
		b=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
	  public boolean updateEmployee(Employee em) {
		  boolean b=false;
			try(Session session=sfactory.openSession();){
			Transaction tr=session.beginTransaction();
			session.update(em); // id : existing, other : new/old
			b=true;
			tr.commit();		
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			return b;
	  } 
	  
	 
	  public boolean deleteEmployee(int empId) { 
		  
		  boolean b=false;
			try(Session session=sfactory.openSession();){
			Transaction tr=session.beginTransaction();
			Employee emp=session.get(Employee.class, empId);
			session.delete(emp);
			tr.commit();
			b=true;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			return b;
		  
	  }
	  
	  
	 
	  public Employee getEmployeeById(int empId) 
	  {  Employee emp=null;
		  // if we want to select record on the basis of pk then direct method : get is available
		  try(Session session=sfactory.openSession();){
			Transaction tr=session.beginTransaction();
		    emp=session.get(Employee.class, empId);// ORM
			tr.commit();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		  return emp;
	  }
	  
	
	public List<Employee> getAllEmployees() 
	{ 
		List<Employee> empList=null;
		try(Session session=sfactory.openSession();){
			Transaction tr=session.beginTransaction();
			TypedQuery<Employee> query=session.createQuery("from Employee", Employee.class); // HQL Employee : pojo class name 
			empList= query.getResultList();
			tr.commit();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		return empList;
	}
	
	
	
	public boolean addEmployee(Employee2 em) {
		boolean b=false;
		try(Session session=sfactory.openSession();){
		Transaction tr=session.beginTransaction();
		Serializable id= session.save(em); // insert query  // persists
		tr.commit();
		b=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
} // method ended
	  
	  
	  
	  
	 
	
	
	
	
