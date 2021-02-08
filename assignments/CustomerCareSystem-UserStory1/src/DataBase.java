
public class DataBase {

Customer []  customerDB;
	
	
	public DataBase() {
		// TODO Auto-generated constructor stub
		
		customerDB = new Customer [3];
		
		Complaint[] c1 = {new Complaint(121,"t1","Buffering Video",0,121),new Complaint(121,"t1","Networking Problem",1,121),new Complaint(121,"t1","Need Help Desk",0,121)};
		Complaint[] c2= {new Complaint(122,"t2","Networking Problem",1,122),new Complaint(122,"t2","Buffering Video",0,122)};
		Complaint[] c3= {new Complaint(123,"t3","Need Help Desk",0,123)};
		
		customerDB[0] =  (Customer) new Person(1,"Ashok",c1);
		customerDB[1] =  (Customer) new Person(2,"Sovha",c2);
		customerDB[2] =  (Customer) new Person(3,"Mahi",c3);
	}
	
	
	
}
