
/*public class Greeter {

	public void greet() {
		
		System.out.println("Hello World");
	}*/



	interface Greeting{
		
		public void perform();
	}

	
   class HelloGreeting implements Greeting{

		@Override
		public void perform() {
			// TODO Auto-generated method stub
			
			System.out.println("Hello Greeting");
			
		}
		
		
	}
	class HiGreeting implements Greeting{

		@Override
		public void perform() {
			// TODO Auto-generated method stub
			
			System.out.println("Hi Greeting");
			
		}
	}
	
	
	  public class Greeter{
	  
	  
	  
	  public void greet(Greeting greeting) { 
		  
		  greeting.perform();
	  
	  }
	  }
	 
