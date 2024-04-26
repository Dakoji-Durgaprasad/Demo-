package com.pack.dp.user;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	
	public void storeUser(User u) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Dp", "root", "root");
			
			Statement st = con.createStatement();
			
			String storeUserQuery = "insert into user_info(Name, Date_Of_Birth, Address, Phone_No) values('"+u.getName()+"', '"+u.getDob()+"', '"+u.getAddress()+"', '"+u.getPhNo()+"')";
			
			int result = st.executeUpdate(storeUserQuery);
			
			System.out.println(result +" row/s effected! ");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
