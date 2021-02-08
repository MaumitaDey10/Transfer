
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Carrying out a division");
		
		try {
		System.out.println("Div:"+(10/0));
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		System.out.println("Program ends normally after division");

	}

}
