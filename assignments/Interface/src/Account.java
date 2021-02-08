
public class Account implements Printable {
 
	String Name;
	long Number;
	float Balance;
	float INT_RATE;
	
	public Account() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Account paramless const");
	}

	public Account(String name, long number, float balance, float inr_rate) {
		super();
		Name = name;
		Number = number;
		Balance = balance;
		INT_RATE = inr_rate;
		
		System.out.println("Account param contsr");
		
		
	}
	
	public void showBal() {
		
		System.out.println("Balance is :"+Balance);
	}
	
	public void widthdraw(float balance) {
		
		Balance=Balance-balance;
	}
	
	public void deposite(float balance) {
		
		Balance=Balance+balance;
	}
	
	public void CalInt() {
		
		INT_RATE=5.5f;
		System.out.println("Account calculate interset is:"+(Balance*INT_RATE));
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(+Balance);
	}

	

}
