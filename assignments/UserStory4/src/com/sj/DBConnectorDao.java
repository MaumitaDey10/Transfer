package com.sj;

import java.sql.Connection;

public class DBConnectorDao {

	Connection con;
	
	public DBConnectorDao() throws ClassNotFoundException
	{
		super();
		Class.forName("com.mysql.jdbc.Driver");
		
	}
		public boolean insertProject(Project project)
		{
			
			
			try {
				con=DBConnector.getConnection();
				
			}
		}

	
}
