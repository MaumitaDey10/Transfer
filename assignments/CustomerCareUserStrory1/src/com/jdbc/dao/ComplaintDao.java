package com.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.model.Complaint;

public interface ComplaintDao {

	public int add(Complaint c)
			throws SQLException;
	
	public void delete(int customer_id) 
	        throws SQLException; 
	
	public Complaint getComplaint(int id) 
	        throws SQLException; 
	    
	public List<Complaint> getComplaints() 
	        throws SQLException; 
	    
	public void update(Complaint c) 
	        throws SQLException; 
	
}
