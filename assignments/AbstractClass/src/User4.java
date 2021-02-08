
public class User4 {

	public User4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape [] s =new Shape[4];
		
		s[0]= new Rectangle();
		s[1]= new Circle();
		s[2]= new Rectangle();
		s[3]= new Circle();
		
		for(Shape s1:s) {
			s1.CalculatAerea();
			s1.isShape();
		}

	}

}
