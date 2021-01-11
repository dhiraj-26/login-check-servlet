package com.zensar;
import java.sql.*;
import java.util.*;

import com.zensar.utility.*;
import com.zensar.beans.Employee;

public class EmployeeRepository {

	public boolean logincheck(String id, String password) {
		
		System.out.println("In login check");
		boolean res = false;
		Connection con = DBUtil.getMySQLDbConnection();
		System.out.println(con);
		String sql = "select *from login where id =?";
		
		
		try {
			PreparedStatement pst =   con.prepareStatement(sql);
			
			pst.setString(1,id);
			ResultSet rs =  pst.executeQuery();
			while(rs.next())
			{
				System.out.println("In result");
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("password"));
				
				if(rs.getString("id").equals(id) && rs.getString("password").equals(password))
				{
				System.out.println("Login Success");
				res = true;
				}
				else
				{
					System.out.println("Login Failed");
					res = false;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		return res;
		
	}

}
