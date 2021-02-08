
public class Employee implements Printable{
	
	int ID;
	String Name;
	double B_Sal;

	public Employee() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Employee paramless constr called");
	}

	public Employee(int iD, String name, double b_Sal) {
		super();
		ID = iD;
		Name = name;
		B_Sal = b_Sal;
		
		System.out.println("Employee param constr called");
	}
	
	public void showIDName() {
		
		System.out.println("Name:"+Name+"id"+ID);
	}
	
	public void showTotSal() {
		
		System.out.println("Employee total salary is:"+B_Sal);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("Name:"+Name+"id"+ID+B_Sal);
		
	}

}
