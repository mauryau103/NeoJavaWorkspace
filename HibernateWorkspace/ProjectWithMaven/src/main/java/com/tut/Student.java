package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity(name="student_details") --- this annotation define that this is a entity bean class after applying this annotation ....hibernate is able save it as a object and access any data as a object of this entity ...also we have given a parameter name .....so further in any query of hql we have to use that by default it is class name.
//@Table   -- table also have a name property it whatever name we provide it create table with the same name. by defauklt table name is class name.but for accessiing an data in query we have tp use entity name OR table name. here belowe ------

//Entity name is =-- Student
//table name is =--- mystudents and table annotation is optional.

@Entity

//@Table(name="mystudents")

public class Student {

	@Id

	private int id;
	private String name;
	private String city;

	
	private Certificate certificate;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", certificate=" + certificate + "]";
	}

}
