package com.jdbc.model;

public class Customer {
	
	int id;
	String name;
	
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}	
	
}
