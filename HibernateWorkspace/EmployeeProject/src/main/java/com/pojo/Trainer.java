package com.pojo;

public class Trainer extends Employee {
	private String trainingTechnology;
	private double extraPayPerHr;
	public Trainer() {
		// TODO Auto-generated constructor stub
	}
	public Trainer(String trainingTechnology, double extraPayPerHr) {
		super();
		this.trainingTechnology = trainingTechnology;
		this.extraPayPerHr = extraPayPerHr;
	}
	public String getTrainingTechnology() {
		return trainingTechnology;
	}
	public void setTrainingTechnology(String trainingTechnology) {
		this.trainingTechnology = trainingTechnology;
	}
	public double getExtraPayPerHr() {
		return extraPayPerHr;
	}
	public void setExtraPayPerHr(double extraPayPerHr) {
		this.extraPayPerHr = extraPayPerHr;
	}
	@Override
	public String toString() {
		return  super.toString()+"Trainer [trainingTechnology=" + trainingTechnology + ", extraPayPerHr=" + extraPayPerHr + "]";
	}
	
	
}