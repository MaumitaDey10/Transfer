
public class DemoSimple {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new MyThread();
		Thread t2= new MyThread();
		
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}

}
