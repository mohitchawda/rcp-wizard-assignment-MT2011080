package org.iiitb.assignment.mt2011080_rcp.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnect {

		public static Connection getConnection()
		{		
			
			String driver = "com.mysql.jdbc.Driver";
			String username = "root";
			String password = "hello";
			Connection conn = null;
		try{
			
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wizard", username,password);
			return conn;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
			
		}

	}

}


