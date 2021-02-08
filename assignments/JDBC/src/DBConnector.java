import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	 static DBConnector dbconn;
	 
	
		public DBConnector() {
		super();
		// TODO Auto-generated constructor stub
	}


		public static  Connection getConnection() throws SQLException 
		{
			if(dbconn == null)
				new DBConnector();
			
			return(DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","Mau#1234"));
		}
	
	
    public static Connection getConnection1() 
    { 
        return (Connection) dbconn; 
    } 

}
