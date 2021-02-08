package com.sj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreStDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","Mau#1234" ); 
			PreparedStatement pst = con.prepareStatement("insert into user values (?,?,?)");
			pst.setInt(1,5);
			pst.setString(2, "aaa");
			pst.setString(3, "aaa");

			
			
			 int rows = pst.executeUpdate();
			
			 if(rows ==1) 
				System.out.println("Data inserted successfully");
				
			else
			    System.out.println("Something went wrong");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}


}
}
