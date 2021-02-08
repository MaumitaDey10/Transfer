
public class User7 {

	public User7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1=new Account("zzz",234566,500);
		
		System.out.println(a1);
		a1=null;
		System.gc();

	}

}
