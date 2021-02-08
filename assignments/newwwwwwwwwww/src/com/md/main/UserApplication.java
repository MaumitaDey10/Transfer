package com.md.main;

import java.sql.SQLException;
import java.util.List;

import com.md.dao.CustomerDaoImplementation;
import com.md.model.Customer;

public class UserApplication {


		 public static void main(String[] args) throws SQLException 
			    { 
			  
			        Customer c = new Customer(); 
			        c.setName("Biju"); 
			        c.setTitle("Laptop Issue"); 
			        c.setStatus("resolved");
			        c.setComplaintId(497);
			        CustomerDaoImplementation cDao  = new CustomerDaoImplementation(); 
			  
		
			        // add 
			        cDao.add(c);
			        
					/*
					 * // read Customer c1 = cDao.getCustomer(1); System.out.println(c1.getCid() +
					 * " " + c1.getName() + " " + c1.getTitle() + " " + c1.getStatus() + " " +
					 * c1.getComplaintId());
					 */
			  
			     // read All 
			        List<Customer> ls = cDao.getCustomers();
			        for (Customer allCs: ls) { 
			            System.out.println(allCs); 
			        } 
					 
	}

}
