package com.ay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ay.bean.ProductBean;
import com.ay.bean.UserBean;
import com.ay.connection.DBConnection;

public class UserRegisterDAO {

	private static final String addUser = "INSERT INTO USERDETAILS1 VALUES(USERID_SEQ.NEXTVAL,?,?,?,?,?)";
	private static final String addProduct = "INSERT INTO PRODUCTDETAILS VALUES(?,?,?,?)";

	public int registerUser(UserBean ub, ProductBean pb) {
		int k = 0;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps1 = con.prepareStatement(addUser);
			PreparedStatement ps2 = con.prepareStatement(addProduct);
			
			ps1.setString(1, ub.getUname());
			ps1.setString(2, ub.getPword());
			ps1.setString(3, ub.getFname());
			ps1.setString(4, ub.getLname());
			ps1.setString(5, ub.getPid());

			ps2.setString(1, pb.getId());
			ps2.setString(2, pb.getName());
			ps2.setFloat(3, pb.getPrice());
			ps2.setInt(4, pb.getQty());

			int p = ps1.executeUpdate();
			int q = ps2.executeUpdate();
			if (p > 0 && q > 0) {
				k = 1;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
