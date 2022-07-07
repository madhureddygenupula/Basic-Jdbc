package com.alpha.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.sql.RowSet;

public class FindName {
public static void main(String[] args)throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders","root","root");
	Statement smt=con.createStatement();
	System.out.println("Enter sid to get name");
	int sid=sc.nextInt();
	String query="select sname from student where sid="+sid;
	ResultSet rs=smt.executeQuery(query);
	rs.next();
	System.out.println(rs.getString(1));
}
}
