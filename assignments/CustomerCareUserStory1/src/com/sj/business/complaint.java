package com.sj.business;

public class complaint {
	
	int complaint_id;
	String name;
	String descrp;
	int status;
	int customer_id;
	
	
	
	public complaint(int complaint_id, String name, String descrp, int status, int customer_id) {
		super();
		this.complaint_id = complaint_id;
		this.name = name;
		this.descrp = descrp;
		this.status = status;
		this.customer_id = customer_id;
	}



	public complaint() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getComplaint_id() {
		return complaint_id;
	}



	public void setComplaint_id(int complaint_id) {
		this.complaint_id = complaint_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescrp() {
		return descrp;
	}



	public void setDescrp(String descrp) {
		this.descrp = descrp;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public int getCustomer_id() {
		return customer_id;
	}



	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	@Override
	public String toString() {
		return "complaint [complaint_id=" + complaint_id + ", name=" + name + ", descrp=" + descrp + ", status="
				+ status + ", customer_id=" + customer_id + "]";
	}

}
