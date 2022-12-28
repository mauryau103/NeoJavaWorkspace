package com.neosoft.jpaMaven;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_DB")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	private int score;
	
	
	
	public Student() {
		super();
	}
	public Student(String sname, int score) {
		super();
		this.sname = sname;
		this.score = score;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", score=" + score + "]";
	}
	
	
	
}