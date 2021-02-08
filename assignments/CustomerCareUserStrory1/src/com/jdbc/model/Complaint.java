package com.jdbc.model;

public class Complaint {
	
	int complaint_id;
	String title;
	String descrip;
	int status;
	
	
	
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Complaint(int complaint_id, String title, String descrip, int status) {
		super();
		this.complaint_id = complaint_id;
		this.title = title;
		this.descrip = descrip;
		this.status = status;
		
	}


	public int getComplaint_id() {
		return complaint_id;
	}


	public void setComplaint_id(int complaint_id) {
		this.complaint_id = complaint_id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescrip() {
		return descrip;
	}


	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Complaint [complaint_id=" + complaint_id + ", title=" + title + ", descrip=" + descrip + ", status="
				+ status + "]";
	}


	



	
	

}
