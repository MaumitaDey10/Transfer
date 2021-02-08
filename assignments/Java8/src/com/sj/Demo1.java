package com.sj;


public class Demo1 {


	public static  void main(String[] args) {
		// TODO Auto-generated method stub

	

	Greeter greeter = new Greeter();
	
	 greeter.greet(new Greeting() {
		
		public void perform() {
			
			System.out.println("Hello World");
		}
	});
	
	greeter.greet(new Greeting() {
		
		public void perform() {
			
			System.out.println("Hi World");
		}
	});

	greeter.greet(new Greeting() {
		
		public void perform() {
			
			System.out.println("WELCOME");
		}
	});
	
    greeter.greet(()->System.out.println("Hello World"));//Lambda expression//
    
    greeter.greet(()->System.out.println("Hi World"));
}
}
