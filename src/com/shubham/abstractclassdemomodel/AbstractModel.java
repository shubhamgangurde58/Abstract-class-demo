package com.shubham.abstractclassdemomodel;

public class AbstractModel {
	
	private int id ;
	private String name ;
	private double fees ;
	
	public void setid(int id) {
		this.id = id;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setfees(double fees) {
		this.fees = fees;
	}
	
	public int getid() {
		return this.id;
	}
	
	public String getname() {
		return this.name;
	}
	public double getfees() {
		return this.fees;
	}
}
