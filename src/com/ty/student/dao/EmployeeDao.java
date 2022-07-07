package com.ty.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.student.Employee;

public class EmployeeDao {

	public void saveEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "root");
		String sql = "insert into employee values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, employee.getId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getEmail());
		ps.setDouble(4, employee.getSal());
		ps.setLong(5, employee.getPhone());
		ps.setInt(6,employee.getAge());
		ps.executeUpdate();
		System.out.println("Created Successfully");
	}
		
	}

