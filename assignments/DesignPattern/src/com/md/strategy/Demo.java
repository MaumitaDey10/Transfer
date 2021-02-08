package com.md.strategy;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amt =500;
		String currency=args[0];
		
		CurrencyConverter c1=null;
		if(args[0].equals("gbp"))
			c1=new GBPconverter();
		
		else
			c1=new USDconverter();
		
		double inr = c1.convertToINR(500);
		
		System.out.println("Amount is INR is:"+ inr);
	}

}
