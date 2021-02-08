package com.md.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.md.util.DatabaseConnection;

public class UserApplication {

	public static void main(String[] args) {
		
		createCustomer();
		readCustomerById();
}


	private static void createCustomer() {
		// TODO Auto-generated method stub
try(Connection connection = DatabaseConnection.getConnection();Statement st = connection.createStatement();) {
			
			String SQLINSERT = "INSERT INTO customer(cid,name,title,status,complaintId) "
					+ "VALUES('1','Mau','Mobile Problem','resolved,401)";
			int executeUpdate = st.executeUpdate(SQLINSERT);
			if(executeUpdate ==1){
				System.out.println("Employee is created..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	   private static void readCustomerById() {
	  
	  try(Connection connection = DatabaseConnection.getConnection();Statement st =
	  connection.createStatement();) {
	  
	  String SELECTSQL = "SELECT *FROM customer WHERE id = 1"; ResultSet rs =
	  st.executeQuery(SELECTSQL); while(rs.next()){ int cId = rs.getInt(1); String
	  cName = rs.getString(2); String cTitle = rs.getString(3); String
	  cStatus=rs.getString(4); int complaintId=rs.getInt(5);
	  
	  
	  System.out.println("Customer Id:"+cId);
	  System.out.println("Customer Name:"+cName);
	  System.out.println("Customer Title:"+cTitle);
	  System.out.println("Customer Status:"+cStatus);
	  System.out.println("Customer ComplaintId:"+complaintId); }
	  
	  } catch (Exception e) { e.printStackTrace(); } }
	 
}
