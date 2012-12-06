package org.iiitb.assignment.mt2011080_rcp.utility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query {

	private static Connection conn = null;
	
	private static void getConn(){
		
		conn  = Dbconnect.getConnection();
		
	}

	public static int Insert(String sqlQuery){
		
		Statement stm ;
		ResultSet rs;
		int result = -1;
		
		try 
		{
			if(conn == null)
			{
				getConn();
				
			}
			
			stm = conn.createStatement();
			stm.executeUpdate(sqlQuery,Statement.RETURN_GENERATED_KEYS);
			rs =stm.getGeneratedKeys();
			if(rs.next()){
				result = rs.getInt(1);
			}			
			
			return result;
			
		}
		catch(Exception e){
					
			e.printStackTrace();		
		}
		
		return -1;
		
	}
	
}
