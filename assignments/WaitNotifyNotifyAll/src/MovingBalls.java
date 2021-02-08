import java.awt.Frame;

public class MovingBalls extends Frame implements Runnable{

	
	Thread t1,t2,t3;
	int x1=10,  x2=10,  x3=10;
	
	public MovingBalls() {
		
		t1=new Thread(this,"ball1");
		t2=new Thread(this,"ball2");
		t3=new Thread(this,"ball3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}


	public void run() {
		
		
		try {
			
			if(Thread.currentThread() == t1)
			{
				
				while(true)
				{
					x1=x1+10;
					System.out.println(x1);
					Thread.sleep(100);
					synchronized(this)
					{
						if(x1==400)
						{
							wait();
							x1=10;
						}
					}
				}
			}
			
			else
				if(Thread.currentThread() == t2)
				{
					while(true)
					{
						x2=x2+10;
						System.out.println(x2);
						Thread.sleep(200);
						synchronized(this) {
							
							
							if(x2==400)
							{
								wait();
								x2=10;
							}
						}
						
					}
				}
				else
					if(Thread.currentThread() == t3)
					{
						while(true)
						{
							x3=x3+10;
							System.out.println(x3);
							Thread.sleep(300);
							synchronized(this) {
								
								if(x2==400)
								{
									notifyAll();
									x3=10;
								}
							}
						}
					}
		
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Reached finally block");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovingBalls m1 = new MovingBalls();
		

	}
}
