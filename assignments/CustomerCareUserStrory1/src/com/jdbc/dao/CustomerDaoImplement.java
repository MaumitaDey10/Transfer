package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.jdbc.model.Complaint;
import com.jdbc.util.DatabaseConnection;

public class CustomerDaoImplement implements ComplaintDao {
	
	 static Connection con  = DatabaseConnection.getConnection(); 


	@Override
	public int add(Complaint c) throws SQLException {
		// TODO Auto-generated method stub

        String query  = "insert into complaint(complaint_id, " + " title,"+ "descrip ,"+ "status) VALUES (?, ?, ?, ?)"; 
        PreparedStatement ps  = con.prepareStatement(query); 
        ps.setInt(1,c.getComplaint_id());
        ps.setString(2,c.getTitle());
        ps.setString(3,c.getDescrip());
        ps.setLong (4,c.getStatus());
        int n = ps.executeUpdate(); 
        return n; 
	}

	@Override
	public void delete(int customer_id) throws SQLException {
		// TODO Auto-generated method stub
		
		 String query  = "delete from complaint where complaint_id =?"; 
     PreparedStatement ps  = con.prepareStatement(query); 
     ps.setInt(1, customer_id); 
     ps.executeUpdate(); 
		
	}

	@Override
	public Complaint getComplaint(int id) throws SQLException {
		// TODO Auto-generated method stub
	  String query  = "select * from person  where complaint_id= ?"; 
      PreparedStatement ps  = con.prepareStatement(query); 

      ps.setInt(1, id); 
      Complaint c = new Complaint(); 
      ResultSet rs = ps.executeQuery(); 
      boolean check = false; 

      while (rs.next()) { 
          check = true; 
          c.setCustomer_id(rs.getInt("complaint_id")); 
          c.setComplaint_id(rs.getInt("complaint_id"));
          c.setTitle(rs.getString("title"));
          c.setDescrip(rs.getString("descrip"));
          c.setStatus(rs.getInt(0));
      } 

      if (check == true) { 
          return c; 
      } 
      else	
		
		
		
		return null;
	}

	@Override
	public List<Complaint> getComplaints() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Complaint c) throws SQLException {
		// TODO Auto-generated method stub
		 String query = "update complaint set complaint_id=?, "+ " title= ?,"+ "descrip=?,"+ "status=? where complaint_id = ?"; 
     PreparedStatement ps = con.prepareStatement(query); 
     ps.setInt(1,c.getComplaint_id());
     ps.setString(2,c.getTitle());
     ps.setString(3,c.getDescrip());
     ps.setLong (4,c.getStatus());
     ps.setInt(5,c.getCustomer_id());
     ps.executeUpdate(); 
	}

	
	
}
