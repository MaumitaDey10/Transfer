import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {

	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","Mau#1234");
		
		Statement stmt =connection.createStatement();
		
		ResultSet users = stmt.executeQuery("select * from user");
		
		while(users.next()) {
			
			System.out.println(users.getInt(1)+","+users.getString(2)+","+users.getString(3));
			
			
		}
		
		//"com.mysql.jdbc.Driver" "jdbc:mysql://localhost:3306/","root","root"
	}

}
