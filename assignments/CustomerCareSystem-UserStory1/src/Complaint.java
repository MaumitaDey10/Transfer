
public class Complaint {

	int cid;
	String title;
	String descrp;
	int status;
	int customer_id;
	
	
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Complaint(int cid, String title, String descrp, int status, int customer_id) {
		super();
		this.cid = cid;
		this.title = title;
		this.descrp = descrp;
		this.status = status;
		this.customer_id = customer_id;
	}
	
	
	@Override
	public String toString() {
		return "Complaint [cid=" + cid + ", title=" + title + ", descrp=" + descrp + ", status=" + status
				+ ", customer_id=" + customer_id + "]";
	}
	
	
	
	
	
}
