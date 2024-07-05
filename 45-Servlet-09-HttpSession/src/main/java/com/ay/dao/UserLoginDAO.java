package com.ay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ay.bean.ProductBean;
import com.ay.bean.UserBean;
import com.ay.connection.DBConnection;

public class UserLoginDAO {

	private static final String login = "Select * from userdetails1 where username = ? and password = ?";
	public UserBean checkLogin(UserBean ub)
	{
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(login);
			ps.setString(1, ub.getUname());
			ps.setString(2, ub.getPword());
			
			ResultSet rs = ps.executeQuery();
				
			if(rs.next())
			{
				ub.setUid(rs.getInt(1));
				ub.setUname(rs.getString(2));
				ub.setPword(rs.getString(3));
				ub.setFname(rs.getString(4));
				ub.setLname(rs.getString(5));
				ub.setPid(rs.getString(6));
			}
			else
				ub = null;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ub;
		
	}
	
}
