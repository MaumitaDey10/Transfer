
public class User3 {

	public User3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("Carrying out a division");
		
		try {
			
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			
			
		System.out.println("Div:"+(10/0));
		}
		
		catch(RuntimeException e) {//this is super class of any exception//
			
			System.out.println("You entered something wrong");
			
			
		/*catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}*/
			/*catch(NumberFormatException e) {
			System.out.println("p1 pass a number");
		}*/
		System.out.println("Program ends normally after division");

	}

	}

}
