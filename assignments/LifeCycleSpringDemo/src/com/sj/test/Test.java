package com.sj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("life cycle demo");

		context.getBean("b1");
		
		
		System.out.println("excution over");//only the change in beans.xml is dont add ini-method thats all
		
		
	}

}
