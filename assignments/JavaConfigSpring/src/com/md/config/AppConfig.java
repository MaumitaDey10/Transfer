package com.md.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.md.CalA;
import com.md.CalC;
import com.md.User;

@Configuration
public class AppConfig {
	@Bean(name="user1")
	public User user() {
		
		return new User();
		}
	
	@Bean(name="cal1")
	public CalC calc() {
		
		return new CalA();
	}
}
