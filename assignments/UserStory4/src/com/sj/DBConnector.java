package com.sj;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	{
		static DBConnector db;
		
		private DBConnector()
		{
			super();
		}
	}
	public static DBConnector getInstance()
	{
		if(db=null)
			db=new DBConnector();
		return db;
	}
public static Connection getConnection() throws SQLException
{
	
	return(DriverManager.getConnection("jdbc:mysql:// localhost:3306/schemaproject", "root" ,"Mau#1234"));
}

}
