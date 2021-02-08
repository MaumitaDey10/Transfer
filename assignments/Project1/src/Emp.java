
public class Emp {

	int ID;
	String Name;
	int Salary;
	static int count;
	
	public Emp() {
		super();
		count++;
		// TODO Auto-generated constructor stub
		System.out.println("constr called");
	}

	public void showCount() {
		
		System.out.println("No. of objects of data type:"+count);
	}

	public Emp(int iD, String name, int salary) {
		super();
		ID = iD;
		Name = name;
		Salary = salary;
		
		System.out.println("Paramless constr");
		
	}
	
	public void setEmp(int id,String n,int sal) {
		
		ID=id;
		Name=n;
		Salary=sal;
	}
	
	
	public void displayEmp() {
		
		System.out.println("Slary is :"+ Salary);
	}
	
	
}
