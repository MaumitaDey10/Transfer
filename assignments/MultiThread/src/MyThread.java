
public class MyThread extends Thread {

	public void run() {
		
		if(Thread.currentThread().getName().equals("t1"))
			
			System.out.println("Hello World");
		
		else
			System.out.println("Hi World");
	}
}
