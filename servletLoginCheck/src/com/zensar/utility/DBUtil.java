package com.zensar.utility;
import java.sql.*;

public class DBUtil
{
	public static Connection getMySQLDbConnection()
	{
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/employee";
		String dbUserName = "root";
		String dbPassword = "root"; 
		
		Connection con = null;
		try
		{
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url,dbUserName,dbPassword);
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return con;
		
	}

}
