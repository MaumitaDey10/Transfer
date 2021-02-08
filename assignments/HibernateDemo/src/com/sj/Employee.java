package com.sj;

public class Employee {

	public int id,sal;
	public String name;
	
	public Employee() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name,int sal) {
		//super();
		this.id = id;
		this.sal = sal;
		this.name = name;
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
