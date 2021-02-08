package com.sj.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sj.DBConnector;

public class TestDBConn {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetConnection() throws SQLException {
		//fail("Not yet implemented");
		
		assertTrue(DBConnector.getConnection()!=null);
	}

}
