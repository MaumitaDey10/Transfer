package com.sj;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class AddEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			
			Session session=null;
			SessionFactory factory;
			try {
				
				factory =new Configuration().configure().buildSessionFactory();
				session= factory.openSession();
				Transaction tr= session.beginTransaction();
				
				Employee emp=new Employee(1,"abc",34000);
				session.save(emp);
				  
				 SalesPerson sp=new SalesPerson(2,"xyz",9000);
				  session.save(sp);
				  
				  
				tr.commit();
				System.out.println("Record Added");
			}
			
			catch(Exception e)
			{
				
				e.printStackTrace();
			}
			
			
			  finally 
			  { 
				  System.out.println("in finally");
			  session.flush();
			  session.close();
			  }
			 
			 
			 
		}
		
		
		
		
		
	}

}
