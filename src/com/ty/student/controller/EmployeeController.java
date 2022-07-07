package com.ty.student.controller;

import java.sql.SQLException;

import com.ty.student.Employee;
import com.ty.student.dao.EmployeeDao;

public class EmployeeController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("madhu");
		employee.setEmail("madhu@mail.com");
		employee.setPhone(86544);
		employee.setSal(20000);
		employee.setAge(24);
		
		EmployeeDao dao=new EmployeeDao();
		dao.saveEmployee(employee);
	}
}
