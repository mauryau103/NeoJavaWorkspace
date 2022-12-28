package com.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.db.MyConnection;
import com.pojo.Developer;
import com.pojo.Employee;
import com.pojo.Trainer;

public class TrainerCrud {
	SessionFactory sfactory;
	public TrainerCrud() {
			sfactory=MyConnection.connect();
			System.out.println("Connection Done.......");
	}
	public boolean addTrainer(Trainer trainer) {
		boolean b=false;
		try(Session session=sfactory.openSession();){
		Transaction tr=session.beginTransaction();
		Serializable id= session.save(trainer); // insert query  // persists
		tr.commit();
		b=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return b;
		
		
	}
	
	public List<Trainer> getAllTrainers(){
		
		List<Trainer> trList=null;
		try(Session session=sfactory.openSession();){
			Transaction tr=session.beginTransaction();
			TypedQuery<Trainer> query=session.createQuery("from Trainer", Trainer.class); // HQL Employee : pojo class name 
			trList= query.getResultList();
			tr.commit();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		return trList;
	}
	
	public boolean addDeveloper(Developer developer) {
		boolean b=false;
		try(Session session=sfactory.openSession();){
		Transaction tr=session.beginTransaction();
		Serializable id= session.save(developer); // insert query  // persists
		tr.commit();
		b=true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return b;
		
		
	}
}