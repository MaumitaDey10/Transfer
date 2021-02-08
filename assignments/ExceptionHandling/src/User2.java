
public class User2 {

	public User2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Carrying out a division");
		
		try {
			
			Class.forName("java.lang.String");
			
		} 
		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
		
			System.out.println("Div:"+(10/0));
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("Cannot divide by zero");
		}
		
		System.out.println("Program ends normally after division");

	}
	
	
}

