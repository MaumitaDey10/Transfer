package com.sj;

public class DemoSimple1 {

	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread m1 = new MyThread();
		
		Thread t1= new Thread(m1,"t1");
		Thread t2= new Thread(m1,"t2");
		
		
		t1.setName("t1");
		t2.setName("t2");
		//t1.start();
		//t2.start();
		m1.start();

	}

}
