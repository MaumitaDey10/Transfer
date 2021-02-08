
public class Demo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void m1() throws Exception{
		
		System.out.println("in m1");
		throw new Exception();
	}
	public void m2()throws Exception{
		m1();
	}
	public void m3() {
		
		try {
			m2();
			
		}
		catch(Exception e) {
			
			System.out.println("Handling exception in m3");
		}
		
		
		
		
	
}
}
