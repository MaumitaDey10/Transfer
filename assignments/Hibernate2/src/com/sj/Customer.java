package com.sj;

public class Customer {

	int cid;
	String cname;
	Date doc;
	
	
	public Customer() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(int cid, String cname, Date doc) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.doc = doc;
	}
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Date getDoc() {
		return doc;
	}
	public void setDoc(Date doc) {
		this.doc = doc;
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", doc=" + doc + "]";
	}
	
	
	
}
