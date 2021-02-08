package com.sj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	 static DBConnector dbconn;
	
	public static  Connection getConnection() throws SQLException 
	{
		if(dbconn == null)
			new DBConnector();
		
		return(DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","Mau#1234"));
	}

}
