
public class SalesManager extends Employee{

	int Comm;
	
	public SalesManager() {
		// TODO Auto-generated constructor stub
		
		System.out.println("SalesManager param constr called");
	}
	public SalesManager(int id,String name,double b_sal,int comm) {
		super(id,name,b_sal);
		Comm = comm;
		
		System.out.println("salesManager paramless constr called");
	}
	
	
	public void showComm() {
		
		System.out.println("Commision is:"+Comm);
	}
	
	public void showTotSal() {
		
		System.out.println("Sales Manager total salary is:"+(B_Sal+Comm));
	}
}
