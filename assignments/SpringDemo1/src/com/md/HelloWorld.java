package com.md;

public class HelloWorld {

	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		return result;
	}

	
	public HelloWorld(String msg) {
		super();
		this.msg = msg;
	}

	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void sayHello() {
		
		System.out.println("Hello World");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HelloWorld other = (HelloWorld) obj;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "HelloWorld [msg=" + msg + "]";
	}
	
	
}
