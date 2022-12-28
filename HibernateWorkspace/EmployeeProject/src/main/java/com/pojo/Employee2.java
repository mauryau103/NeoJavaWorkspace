package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
// JPA
@Entity  // Employee2 class object is know as Entity
@Table(name = "neoemployee")
public class Employee2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "neoemp_id")
	private int empId; // mapping to primary key of table
	
	@Column(name = "neoemp_name")
	private String empName;
	@Column(name = "neoemp_salary")
	private double empSalary;
	@Column(name = "neoemp_qual")
	private String qualification;
	//pojo class must have default constructor
	public Employee2() {
		
	}
	
	public Employee2(int empId, String empName, double empSalary, String qualification) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.qualification = qualification;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
}