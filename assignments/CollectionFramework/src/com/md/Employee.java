package com.md;

public class Employee implements Comparable{
	
	int ID;
	String Name;
	double B_Sal;

	public Employee() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Employee paramless constr called");
	}

	public Employee(int iD, String name, double b_Sal) {
		super();
		ID = iD;
		Name = name;
		B_Sal = b_Sal;
		
		System.out.println("Employee param constr called");
	}
	
	public void showIDName() {
		
		System.out.println("Name:"+Name+"id"+ID);
	}
	
	public void showTotSal() {
		
		System.out.println("Employee total salary is:"+B_Sal);
	}
	
	

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", B_Sal=" + B_Sal + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		// TODO Auto-generated method stub
		//return (this.ID-((Employee)o).ID);
		//return this.Name.compareTo(((Employee)o).Name);
		return (int) (this.B_Sal-((Employee)o).B_Sal);
	}

}
