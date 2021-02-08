
public class Account {
 
	String Name;
	long Number;
	float Balance;
	
	
	public Account() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Account paramless const");
	}

	public Account(String name, long number, float balance) {
		super();
		Name = name;
		Number = number;
		Balance = balance;
	
		
		System.out.println("Account param contsr");
		
		
	}
	
	public void showBal() {
		
		System.out.println("Balance is :"+Balance);
	}
	
	public void widthdraw(float balance) throws Exception {
		
		if(Balance<balance) {
			
			throw new InsufficientBalanceException();
		}
		else
		Balance=Balance-balance;
	}

	@Override
	public String toString() {
		return "Account [Name=" + Name + ", Number=" + Number + ", Balance=" + Balance + "]";
	}
	
	
	/*
	 * public void deposite(float balance) {
	 * 
	 * Balance=Balance+balance; }
	 * 
	 * public void CalInt() {
	 * 
	 * INT_RATE=5.5f;
	 * System.out.println("Account calculate interset is:"+(Balance*INT_RATE)); }
	 */

}
