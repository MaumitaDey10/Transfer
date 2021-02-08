package com.md.factory;

public class ButtonFactory {

	public static Button createNSupplyButton(String os) {
		
		{
			
			if(os.equals("MacButton"))
				return new MacButton();
			
			if(os.equals("WindowsButton"))
				return new WindowsButton();
			return null;
		}
	}

}
