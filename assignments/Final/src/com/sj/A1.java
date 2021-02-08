package com.sj;

final public class A1 {
	int i;

	public A1() {
		// TODO Auto-generated constructor stub
		int i=10;
	}
		
	final	public void m1() {//if we declare only this method as a final that then we can see the error in the Class B1 m1 method//
			
			System.out.println("This is super m1.i="+i);
		}
	    public void m2() {
		 
	    	System.out.println("This is super m2");
	 }
	    
	    class B1 extends A1 {//here it is error coz we can not extends the class A1 as it is already in final//
	    	
	    	public void m1() {
	    		
	    		System.out.println("This is sub m1");
	    	
	    	
	    }
	    	public void m2() {
	    		System.out.println("This is sub m2");
	    	}
	}
	}

}
