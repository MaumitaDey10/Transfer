package com.md.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.md.User;



public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		User bean1= (User) context.getBean("b1");
		bean1.invokeWithdraw(6000);
		//System.out.println(bean1);
	}

}
