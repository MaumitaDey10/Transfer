package com.md;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class User {

	@Value("5")
	int x;//here we can give value of x & y but but then in setters and getters remove x & y and also in beans.xml we don't have to add any property of x & y//
	@Value("6")
	int y;
	@Autowired
	CalC calc;//CalC is type & calc is property name//
	
	
	@PostConstruct
	public void customInit() {
		
		System.out.println("for init code");
	}
	
	@PreDestroy
	public void customDestroy() {
	System.out.println("for clean up code");
	}
	
	
	public void invokeAdd() {
		
		calc.add(x,y);
	}
	
	
	
	  public int getX() {//this is setters injection//
		  return x; 
		  }
	  
	  
	  
	  public void setX(int x) { 
		  this.x = x;
		  }
	  
	  
	  public int getY() {
		  return y; 
		  }
	  
	  
	  public void setY(int y) {
		  this.y = y; 
		  }
	  
	  
	  public CalC getCalc() {
		  return calc; 
		  }
	  
	  
	  
	  public void setCalc(CalC calc) { 
		  this.calc = calc;
		  }
	  
	 

	@Override
	public String toString() {
		return "User [x=" + x + ", y=" + y + ", calc=" + calc + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calc == null) ? 0 : calc.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (calc == null) {
			if (other.calc != null)
				return false;
		} else if (!calc.equals(other.calc))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}


	public User(int x, int y, CalC calc) {//constructor injection
		super();
		this.x = x;
		this.y = y;
		this.calc = calc;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



}
