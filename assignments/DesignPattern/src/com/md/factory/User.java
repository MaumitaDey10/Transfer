package com.md.factory;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button b=ButtonFactory.createNSupplyButton(args[0]);
		b.paint();
	}

}
