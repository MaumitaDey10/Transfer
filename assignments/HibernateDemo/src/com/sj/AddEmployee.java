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
				int id=Integer.parseInt(args[0]);
				int sl=Integer.parseInt(args[2]);
				Employee emp=new Employee(id,args[1],sl);
				  session.save(emp);
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
