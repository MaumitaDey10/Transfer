package com.md.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.md.HelloWorld;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
	    HelloWorld bean1=	(HelloWorld) context.getBean("b1");
	    
	    bean1.sayHello();
		
		
	}

}
