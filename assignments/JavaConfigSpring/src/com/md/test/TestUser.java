package com.md.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.md.CalC;
import com.md.User;
import com.md.config.AppConfig;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		User user1=(User) context.getBean("user1");
		
		user1.invokeAdd();
		
		//CalC cal1=	 (CalC) context.getBean("cal1");
		
		
		//cal1.add(4, 6);	
		
		
		
	}

}
