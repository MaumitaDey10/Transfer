
public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int x=5;
		//x=6;//we can not change the value of x as it is already declared as a final//
		
		A a1= new A();
		a1.m1();
		a1.i=13;
		a1.m1();
	}

}
