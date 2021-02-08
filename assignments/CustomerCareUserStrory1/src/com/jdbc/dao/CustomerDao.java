package com.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.model.Customer;


public interface CustomerDao {

	public int add(Customer c)
		throws SQLException;
	
	public void delete(int id)
			throws SQLException;
	
	public Customer getPerson(int id)
			throws SQLException;
	
	public List<Customer> getPersons()
			throws SQLException;
	
	public void update(Customer c)
			throws SQLException;
	
	
	
	
}
