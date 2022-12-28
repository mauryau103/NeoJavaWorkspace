package com.tut;

import javax.persistence.Embeddable;

/*
 *By using embeddable --> hum Student class ke andar uske sare data store kar rahe
 * hai -- single table will be created and inside that all the data will be stored
 * similar to table per cocrete class -- union-class
 */


@Embeddable
public class Certificate {

	private String course;
	private String duration;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Certificate [course=" + course + ", duration=" + duration + "]";
	}
	
	
}
