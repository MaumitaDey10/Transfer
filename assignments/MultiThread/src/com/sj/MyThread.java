package com.sj;//Mam wants this type to increment and decrement x value like this//

public class MyThread extends Thread {

	int x=0;
	
	public void run() {
		
		for(int i=0;i<4;i++) {
			
			if(Thread.currentThread().getName().equals("t1")) {
				
				this.x++;
				System.out.println("t1"+this.x++);
				
				
				try {
					Thread.sleep(300);
				}
				catch(InterruptedException e) {
					
					e.printStackTrace();
				}

				if(Thread.currentThread().getName().equals("t2")) {
					
				//else
					this.x--;
				System.out.println("t1"+this.x++);
				}
				
			}
		}
	}

}
