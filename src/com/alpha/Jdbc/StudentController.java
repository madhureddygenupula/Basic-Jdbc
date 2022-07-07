package com.alpha.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentController {
		public static void main(String[] args) throws Exception {
		Student s=new Student();
	  s.setSid(3050);
		s.setSname("pimple");
		s.setEnglish(14);
		s.setMaths(27);
	   s.setScience(35);
		StudentService ss=new StudentService();
		ss.saveStudent(s);
	
		}
}
