package com.alpha.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class EstablishConnection {
public static void main(String[] args)throws ClassNotFoundException ,SQLException{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspiders","root","root");
	Statement smt=con.createStatement();
}
}
