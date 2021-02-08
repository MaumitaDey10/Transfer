package com.sj.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sj.Money;
import com.sj.Money1;
import com.sj.NotSameCurrency;

public class TestMoney1 {
	
	Money1 usd30;
	Money1 usd70;
	Money1 usd100;
	Money1 inr70;

	@Before
	public void setUp() throws Exception {
		
		System.out.println("set up called");
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("teardown");
	}

	@Test(expected=NotSameCurrency.class)
	public final void testexception() throws NotSameCurrency{
		
		Money1 ans = new Money1();
		
		ans = usd30.addMoney1(inr70);
	}
	@Test
	public void testAddMoneyMoney1() throws NotSameCurrency {
		//fail("Not yet implemented");
		
		 Money1 ans = new Money1();
			
		 ans =  (usd30).addMoney1(usd70);
		 
		 assertTrue(ans.equals(usd100));
	}

}
