package com.sj.test;//this is my demo class assignment

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sj.Money;

public class TestMoney {
	
	Money m,c;

	@Before
	public void setUp() throws Exception {
		
		System.out.println("set up invoked ,initializing money");
		m=new Money(75,25);
		
		c=new Money("INR");
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("tear down to execute clean up");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		int result =m.add();
		
		assertTrue(result==100);
		//System.out.println("print:"+result); 
		//String currency;
		//currency="INR";
		//System.out.println("print:"+currency);
	}

}
