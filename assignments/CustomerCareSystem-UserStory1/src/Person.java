import java.util.Arrays;

public class Person implements Customer{

	
	int id;
	String name;
	Complaint[] c_list;
	
	
	public Person(int id, String name, Complaint[] c_list) {
		super();
		this.id = id;
		this.name = name;
		this.c_list = c_list;
	}
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", c_list=" + Arrays.toString(c_list) + "]";
	}




	@Override
	public void LaunchComplaint(Complaint[] c) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void LaunchComplaint(Customer c) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
