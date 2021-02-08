package com.sj;

public class User {

	String uname;
	String password;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
		System.out.println("Setter invoked:"+uname);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		System.out.println("Setter invoked:"+password);
	}
	
	public boolean isValid() {
		if(password.equals("admin"))
		return true;
	else
		return false;
	}
	
}
