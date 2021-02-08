package com.md.singleton;

public class User {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calc c1 = Calc.getInstance();
		
		c1.add(10,2);
		
		Calc c2 = Calc.getInstance();
		
		c2.add(11, 3);
		
		Calc c3 = Calc.getInstance();
		
		c3.add(16, 3);
	}

}
