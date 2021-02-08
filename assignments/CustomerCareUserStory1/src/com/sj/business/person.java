package com.sj.business;

public class person {

	int id;
	String name;
	
	
	
	public person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public person() {
		super();
		// TODO Auto-generated constructor stub
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



	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}
		
}
