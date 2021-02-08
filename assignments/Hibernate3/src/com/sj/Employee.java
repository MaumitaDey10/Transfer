package com.sj;

public class Employee {
	
	int id,sal;
	String name;
	
	
	
	public Employee(int id, String name,int sal) {
		super();
		this.id = id;
		
		this.name = name;
		this.sal = sal;
	}



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getSal() {
		return sal;
	}



	public void setSal(int sal) {
		this.sal = sal;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}
	
	
}
