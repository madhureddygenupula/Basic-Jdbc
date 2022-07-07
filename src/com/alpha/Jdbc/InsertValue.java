package com.alpha.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValue {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders", "root","root");
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select sname from student where sid=3");
		rs.next();
		System.out.println(rs.getString(2));
	
	}
}
