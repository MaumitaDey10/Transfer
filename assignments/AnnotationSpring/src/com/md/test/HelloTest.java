package com.md.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.md.model.Book;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Book bean1=(Book) context.getBean("b1");
		
		System.out.println(bean1);
	}

}
