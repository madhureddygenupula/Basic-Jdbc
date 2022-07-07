package com.alpha.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadUser {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders","root","root");
PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
System.out.println("enter the details of the student");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	System.out.println("Enter your sid");
	int sid=sc.nextInt();
	System.out.println("Enter your sname");
	String sname=sc.next();
	System.out.println("Enter your contact number");
	long cno=sc.nextLong();
	System.out.println("Enter your Email_id");
	String mail=sc.next();
	ps.setInt(1, sid);
	ps.setString(2, sname);
	ps.setLong(3, cno);
	ps.setString(4, mail);
	ps.executeUpdate();
}
	}

}
