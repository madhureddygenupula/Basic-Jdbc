package com.ty.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.student.Student;

public class StudentDao {

	public void save(Student s) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");
		String sql = "insert into btech_marks values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, s.getId());
		ps.setString(2, s.getName());
		ps.setDouble(3, s.getSemester_1());
		ps.setDouble(4, s.getSemester_2());
		ps.setDouble(5, s.getSemester_3());
		ps.setDouble(6, s.getSemester_4());
		ps.setDouble(7, s.getSemester_5());
		ps.setDouble(8, s.getSemester_6());
		ps.setDouble(9, s.getSemester_7());
		ps.setDouble(10, s.getSemester_8());
		ps.setDouble(11, s.getPercentage());
		ps.setString(12, s.getGrade());
		ps.setString(13, s.getResult());
		ps.executeUpdate();
		System.out.println("Added Sucessfully");
	}

	public Student getStudentByName(String name) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");
		String sql = "select * from btech_marks where name=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();
		Student s = new Student();
		if (rs.next()) {
			s.setId(rs.getString(1));
			s.setName(rs.getString(2));
			s.setSemester_1(rs.getDouble(3));
			s.setSemester_2(rs.getDouble(4));
			s.setSemester_3(rs.getDouble(5));
			s.setSemester_4(rs.getDouble(6));
			s.setSemester_5(rs.getDouble(7));
			s.setSemester_6(rs.getDouble(8));
			s.setSemester_7(rs.getDouble(9));
			s.setSemester_8(rs.getDouble(10));
			s.setPercentage(rs.getDouble(11));
			s.setGrade(rs.getString(12));
			s.setResult(rs.getString(13));
			
			return s;
		}

		return null;
	}
	public void deleteStudent(String id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		String sql="delete from btech_marks where id=?";
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setString(1, id);
		statement.executeUpdate();
		System.out.println("Details Are deleted Successfully");
	}
	public List<Student> getAllStudent() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		String sql="select * from btech_marks";
		PreparedStatement statement=con.prepareStatement(sql);
		ResultSet rs=statement.executeQuery();
		Student s=new Student();
		List<Student> al=new ArrayList<>();
		while(rs.next()) {
			s.setId(rs.getString(1));
			s.setName(rs.getString(2));
			s.setSemester_1(rs.getDouble(3));
			s.setSemester_2(rs.getDouble(4));
			s.setSemester_3(rs.getDouble(5));
			s.setSemester_4(rs.getDouble(6));
			s.setSemester_5(rs.getDouble(7));
			s.setSemester_6(rs.getDouble(8));
			s.setSemester_7(rs.getDouble(9));
			s.setSemester_8(rs.getDouble(10));
			s.setPercentage(rs.getDouble(11));
			s.setGrade(rs.getString(12));
			s.setResult(rs.getString(13));
			System.out.println(s);
			al.add(s);
		
		}
		return al;
		
	}
	public List<Student> TopFiveStudents() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		String sql="select * from btech_marks order by percentage desc limit 5";
		PreparedStatement statement=con.prepareStatement(sql);
		ResultSet rs=statement.executeQuery();
		Student s=new Student();
		List<Student> al=new ArrayList<>();
		while(rs.next()) {
			s.setId(rs.getString(1));
			s.setName(rs.getString(2));
			s.setSemester_1(rs.getDouble(3));
			s.setSemester_2(rs.getDouble(4));
			s.setSemester_3(rs.getDouble(5));
			s.setSemester_4(rs.getDouble(6));
			s.setSemester_5(rs.getDouble(7));
			s.setSemester_6(rs.getDouble(8));
			s.setSemester_7(rs.getDouble(9));
			s.setSemester_8(rs.getDouble(10));
			s.setPercentage(rs.getDouble(11));
			s.setGrade(rs.getString(12));
			s.setResult(rs.getString(13));
			System.out.println(s);
			al.add(s);
		
		}
		return al;
		
	}
	public List<Student> getFailureStudent() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
		String sql="select * from btech_marks where result='fail'";
		PreparedStatement statement=con.prepareStatement(sql);
		ResultSet rs=statement.executeQuery();
		Student s=new Student();
		List<Student> al=new ArrayList<>();
		while(rs.next()) {
			s.setId(rs.getString(1));
			s.setName(rs.getString(2));
			s.setSemester_1(rs.getDouble(3));
			s.setSemester_2(rs.getDouble(4));
			s.setSemester_3(rs.getDouble(5));
			s.setSemester_4(rs.getDouble(6));
			s.setSemester_5(rs.getDouble(7));
			s.setSemester_6(rs.getDouble(8));
			s.setSemester_7(rs.getDouble(9));
			s.setSemester_8(rs.getDouble(10));
			s.setPercentage(rs.getDouble(11));
			s.setGrade(rs.getString(12));
			s.setResult(rs.getString(13));
			System.out.println(s);
			al.add(s);
		
		}
		return al;
		
	}
}
