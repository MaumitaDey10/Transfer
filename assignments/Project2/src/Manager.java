
public class Manager extends Employee{
	
	int sp_allow;

	public Manager() {
		// TODO Auto-generated constructor stub
		System.out.println("Manager  constr called");
	}
	
	

	public Manager(int id,String name,double b_sal, int sp_allow) {
		super(id,name,b_sal);
		this.sp_allow = sp_allow;
		
		System.out.println("Manager paramless constr called");
	}
	
	
	public void shpwSpAllow() {
		
		System.out.println("Special Allowence is:"+sp_allow);
	}
	
	public void showTotSal() {
		
		System.out.println("Manager total salary is:"+(B_Sal+this.sp_allow));
	}

	

}
