package com.sj;

public class SalesPerson extends Employee {
		
	int comm;

	

	public SalesPerson(int id, String name, int sal) {
		super(id, name, sal);
		// TODO Auto-generated constructor stub
	}

	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	@Override
	public String toString() {
		return  super.toString()+ "SalesPerson [ Comm="  +comm + "]";
	}

}
