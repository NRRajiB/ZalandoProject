package org.cts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCCntn {
public static void main(String[] args) throws ClassNotFoundException,SQLException {
	Connection con=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","hr","raji@sql");
		String sql="Select * from Passenger";
		 PreparedStatement ps = con.prepareStatement(sql);
		 ResultSet eQ = ps.executeQuery();
		 while(eQ.next()){
			String name=eQ.getString("Name");
			String age=eQ.getString("Age");
			String dest=eQ.getString("Destination");
			String depart=eQ.getString("Departure");
			String trip=eQ.getString("TripType");
			String bagg=eQ.getString("Baggage");
			System.out.println(name);
			System.out.println(age);
			System.out.println(dest);
			System.out.println(depart);
			System.out.println(trip);
			System.out.println(bagg);
		 }
	}
	catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	catch(SQLException e){
		e.printStackTrace();
	}
	
	finally {
		try {
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}	

}
