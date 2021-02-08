package com.md.singleton;

public class Calc {
	
	static Calc c;

	private Calc() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("object created");
	}

	public static Calc getInstance() {
		
		if(c==null)
		c=new Calc();
		
		return c;
	}

	public void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("The sum is :"+(i+j));
	}
}
