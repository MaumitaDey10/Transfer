package com.md.model;

public class Customer {

	int cid;
	String name;
	String title;
	String status;
	int complaintId;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String name, String title, String status, int complaintId) {
		super();
		this.cid = cid;
		this.name = name;
		this.title = title;
		this.status = status;
		this.complaintId = complaintId;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", title=" + title + ", status=" + status + ", complaintId="
				+ complaintId + "]";
	}
	
	
}
