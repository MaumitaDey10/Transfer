
public class CurrentAccount extends Account{
	
	float INT_RATE;

	public CurrentAccount() {
		// TODO Auto-generated constructor stub
		System.out.println("CurrentAccount paramless conts");
		
	}

	public CurrentAccount(String name, long number, float balance,float iNT_RATE) {
		super();
		INT_RATE = iNT_RATE;
		
		System.out.println("CurrentAccount param conts");
		
	}
	
public void CalInt() {
		
		INT_RATE=5.8f;
		System.out.println("Current Account calculate interset is:"+(5*Balance*INT_RATE));
	}

	

}
