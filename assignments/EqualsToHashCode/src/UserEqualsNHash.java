import java.sql.Date;

public class UserEqualsNHash {


	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1 = new Date(1,1,2000);
		
		//Date d2 = new Date(2,2,2001);
		
		Date d2 = new Date(1,1,2000);
		
		//d1=d2;
		
		
		System.out.println(d1.equals(d2));
		
		System.out.println("d1's memory loc as hashcode:"+d1.hashCode());
		
		System.out.println("d2's memory loc as hashcode:"+d2.hashCode());
		
		
		
		
		
		
		

	}

}
