package com.md.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.md.User;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		User user1=(User) context.getBean("e1");
	
		user1.showRoute();
		
	}

}
