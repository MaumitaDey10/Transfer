package com.sj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
	SessionFactory factory =new Configuration().configure().buildSessionFactory();
	Session	session= factory.openSession();
	Transaction tr= session.beginTransaction();
		//find by id
	   Employee e2 = (Employee) session.load(Employee.class,1);
		
		  e2.setSal(7000); session.update(e2);//do for updation//
		  System.out.println(e2);
		  
		  session.delete(e2);//for deletion// 
		  tr.commit(); 
		  session.flush();
		  session.close();
		 
	}

}
