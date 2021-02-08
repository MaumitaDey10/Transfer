package com.md.strategy;

public class GBPconverter implements CurrencyConverter{

	@Override
	public double convertToINR(double amt) {
		// TODO Auto-generated method stub
		return (amt*92);
	}

	

}
