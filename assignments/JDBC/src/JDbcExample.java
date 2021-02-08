import java.sql.Connection;//mam gave assignment
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDbcExample {

	public static void main(String[] args) {
		
		try {
			
			try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","Mau#1234")){
				
				Statement stmt =conn.createStatement();
				
				ResultSet users = stmt.executeQuery("select * from user");
				
				while(users.next()) {
					
					System.out.println(users.getInt(1)+","+users.getString(2)+","+users.getString(3));
					
					
				}
			}
		}catch(Exception e) {
			
			System.err.println("Something went wrong");
			e.printStackTrace();
			
		}
	
		
		
	}
	
}
