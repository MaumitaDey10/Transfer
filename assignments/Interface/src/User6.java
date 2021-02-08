
public class User6 {

	public User6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Printable[]p=new Printable[2];
		
		p[0]=new Employee();
		p[1]=new Account();
		
		for(Printable p1:p) {
			
			p1.print();
		}
	}

}
