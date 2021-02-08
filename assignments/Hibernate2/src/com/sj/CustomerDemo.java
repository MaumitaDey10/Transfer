package com.sj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
{
			
			Session session=null;
			SessionFactory factory;
			try {
				
				factory =new Configuration().configure().buildSessionFactory();
				session= factory.openSession();
				Transaction tr= session.beginTransaction();
				Date doc = new Date(3,7,2019);
				Customer c1=new Customer(2, "abc",doc);
				session.save(c1);
				tr.commit();
				session.flush();
				session.close();
				System.out.println("record saved");
				
				
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		
	}

}
}
