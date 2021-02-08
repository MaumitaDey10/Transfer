package com.jdbc.main;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.dao.PersonDaoImplement;
import com.jdbc.model.Person;

import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.util.ArrayList; 
import java.util.List; 
public class UserApplication {

	public static void main(String[] args) throws SQLException 
		// TODO Auto-generated method stub
		
		{
		Person p= new Person();
	
		p.setName("Roy");
		p.setName("Sen");
		p.setName("Dey");
		p.setName("Jain");
		p.setName("Pal");
		PersonDaoImplement pDao = new PersonDaoImplement();
		
		//add
		pDao.add(p);
		
	
		//read
		Person p1=pDao.getPerson(1);
		Person p2=pDao.getPerson(2);
		Person p3=pDao.getPerson(3);
		Person p4=pDao.getPerson(4);
		Person p5=pDao.getPerson(5);
		System.out.println(p1.getId()+" "+p1.getName());
		System.out.println(p2.getId()+" "+p2.getName());
		System.out.println(p3.getId()+" "+p3.getName());
		System.out.println(p4.getId()+" "+p4.getName());
		System.out.println(p5.getId()+" "+p5.getName());
		
	
		
		//readAll
		
		  List<Person> ls =pDao.getPersons(); for(Person allperson : ls) {
		  System.out.println(allperson); }
		 
		
		  //update
		  Person tempPerson = pDao.getPerson(1); 
		  tempPerson.setName("Abdul");
		  tempPerson.setName("Akash");
		  tempPerson.setName("Mahi");
		  tempPerson.setName("Diva");
		  tempPerson.setName("Dampi");
		  pDao.update(tempPerson);
		 
		//Delete
		pDao.delete(10);
		}

}

