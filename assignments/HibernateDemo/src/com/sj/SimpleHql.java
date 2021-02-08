package com.sj;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SimpleHql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session	session= factory.openSession();
		Transaction tr= session.beginTransaction();
		
	Query query=(Query) session.createQuery("from Employee e1");
	List empList =  query.list();
	for(Object  e:empList ) {
	
	System.out.println((Employee)e);
	}

}
}
