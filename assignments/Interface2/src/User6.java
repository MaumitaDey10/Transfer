
public class User6 {

	public User6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalC c= new CalA();//loose coupling-using interface reference
		CalC c1 = new CalB();
		
		c.additionService(14, 7);
		c1.additionService(20, 3);

	}

}
