package com.jdbc.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.model.Customer;
import com.jdbc.model.Person;
import com.jdbc.util.DatabaseConnection;

public class PersonDaoImplement implements CustomerDao {
	
	static Connection con = DatabaseConnection.getConnection();
	
	
	

	@Override
	public int add(Person p) throws SQLException {
		// TODO Auto-generated method stub
		
	 String query  = "insert into person( " + "name) VALUES ( ?)";
     PreparedStatement ps  = con.prepareStatement(query);  
     ps.setString(1, p.getName()); 
     int n = ps.executeUpdate(); 
     return n; 
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	 String query  = "delete from person where id =?"; 
     PreparedStatement ps  = con.prepareStatement(query); 
     ps.setInt(1, id); 
     ps.executeUpdate(); 
		
	}

	@Override
	public Person getPerson(int id) throws SQLException {
		// TODO Auto-generated method stub
		

        String query  = "select * from person where id= ?"; 
        PreparedStatement ps  = con.prepareStatement(query); 
  
        ps.setInt(1, id); 
        Person p = new Person(); 
        ResultSet rs = ps.executeQuery(); 
        boolean check = false; 
  
        while (rs.next()) { 
            check = true; 
           p.setId(rs.getInt("id"));
           p.setName(rs.getString("name"));
        } 
  
        if (check == true) { 
            return p; 
        } 
        else	
        	return null;
	}

	@Override
	public List<Person> getPersons() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from person"; 
        PreparedStatement ps = con.prepareStatement(query); 
        ResultSet rs = ps.executeQuery(); 
        List<Person> ls = new ArrayList<Person>(); 
  
        while (rs.next()) { 
            Person p = new Person(); 
           p.setId(rs.getInt("id"));
           p.setName(rs.getString("name"));
           ls.add(p); 
        } 
        return ls; 
	}

	@Override
	public void update(Person p) throws SQLException {
		// TODO Auto-generated method stub
		 String query = "update person set id=?, " + " name= ? where id = ?"; 
     PreparedStatement ps  = con.prepareStatement(query); 
     ps.setInt(1, p.getId()); 
     ps.setString(2, p.getName()); 
     ps.executeUpdate(); 
	}

	@Override
	public int add(Customer c) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getPerson(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Customer c) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
