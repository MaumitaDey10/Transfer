package com.md.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.md.SimpleBean;



public class TestSimpleBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("life cycle demo");

		SimpleBean b1=(SimpleBean) context.getBean("b1");
		b1=null;
		
		System.out.println("excution over");
		
		
	}

}
