
public class A {
	
	int i;
	
	public A() {
		// TODO Auto-generated constructor stub
		i=10;
	}
	
	public void m1() {
		
		System.out.println("This is super m1.i="+i);
	}
    public void m2() {
	 
    	System.out.println("This is super m2");
 }
    
    class B extends A {
    	
    	public void m1() {
    		
    		System.out.println("This is sub m1");
    	
    	
    }
    	public void m2() {
    		System.out.println("This is sub m2");
    	}
}
}