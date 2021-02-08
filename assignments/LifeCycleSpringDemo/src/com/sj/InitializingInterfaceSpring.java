package com.sj;

import org.springframework.beans.factory.InitializingBean;



public class InitializingInterfaceSpring implements InitializingBean{

	static int ctr=0;
	String title;
	int id;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		ctr++;
		System.out.println("ctr"+ctr);
		this.title = title;
		System.out.println("setTilte invoked");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("setId invoked");
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		InitializingInterfaceSpring other = (InitializingInterfaceSpring) obj;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SimpleBean [title=" + title + ", id=" + id + "]";
	}
	
	
	public InitializingInterfaceSpring(String title, int id) {
		super();
		this.title = title;
		this.id = id;
	}
	
	
	public InitializingInterfaceSpring() {
		super();
		ctr++;
		System.out.println("ctr"+ctr);
		System.out.println("instance created..");
		// TODO Auto-generated constructor stub
	}
	
	  @Override public void afterPropertiesSet() throws Exception {
	   ctr++;
	   System.out.println("ctr"+ctr);
	  
	  System.out.println("my init code inafterPropset");
	  
	  }
	 
	
	
}
