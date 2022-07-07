
package com.alpha.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateDatabase {
public static void main(String[] args)throws ClassNotFoundException ,SQLException{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	Statement smt=con.createStatement();
	smt.executeUpdate("create database Qspiders");
	System.out.println("Database is created Successfully");
}
}
