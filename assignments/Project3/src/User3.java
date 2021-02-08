
public class User3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1 = new Account();
		
		Account [] account_list = new Account[3];
		
		account_list[0] = new Account("bbbb",67890,234,899);
		account_list[1] = new SavingAccount("ccc",8900,4555,3);
		account_list[2] = new CurrentAccount("ddd",123456,900,3);
		
		for(Account act:account_list) {
			
			
			act.CalInt();
		}
	}

}
