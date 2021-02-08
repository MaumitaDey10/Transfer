package com.jdbc.main;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.dao.CustomerDaoImplement;
import com.jdbc.model.Complaint;

public class UserApplication2 {

	public static void main(String[] args) 
	throws SQLException{
		
		Complaint c = new Complaint();
		c.setComplaint_id(2);
		c.setDescrip("network issue");
		c.setTitle("laptop");
		c.setStatus(1);
		CustomerDaoImplement cDao=new CustomerDaoImplement();
		
		//add
		cDao.add(c);
		//read
		Complaint c1 = cDao.getComplaint(1);
		System.out.println(c1.getComplaint_id()+""+c1.getCustomer_id()+""+c1.getDescrip()+""+c1.getStatus()+""+c1.getTitle());
		
		//readAll
		List<Complaint> ls = cDao.getComplaints(); 
        for (Complaint allcus : ls) { 
            System.out.println(allcus); 
        } 
		
        // update 
        Complaint tempCust = cDao.getComplaint(1); 
        tempCust.getCustomer_id();
        
        cDao.update(tempCust); 
		
        //delete
        cDao.delete(1);
        
	}

}
