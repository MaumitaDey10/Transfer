package com.sj.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sj.CalC;

public class TestCalC {
	
	
	CalC c;

	@Before
	public void setUp() throws Exception {
		System.out.println("set uo invoked ,initializing calc");
		c= new CalC(10,3);
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("tear down to execute clean up");
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		int result =c.add();
		
		assertTrue(result==13);
		
	}

}
