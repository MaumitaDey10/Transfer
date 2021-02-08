
public class SavingAccount extends Account{
	
	float INT_RATE;

	public SavingAccount() {
		// TODO Auto-generated constructor stub
		
		System.out.println("SavaingAccount paramless conts");
	}

	public SavingAccount(String name, long number, float balance,float iNT_RATE) {
		super();
		INT_RATE = iNT_RATE;
		
		System.out.println("SavaingAccount param conts");
	}
	
	public void CalInt() {
		
		INT_RATE=6f;
		System.out.println("Saving Account calculate interset is:"+(3*Balance*INT_RATE));
	}

}
