package com.alpha.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	public void save(Student s) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		PreparedStatement ps= con.prepareStatement("Insert into smarks values(?,?,?,?,?,?,?,?)");
		ps.setInt(1, s.getSid());
		ps.setString(2, s.getSname());
		ps.setInt(3,s.getScience());
		ps.setInt(4, s.getMaths());
		ps.setInt(5, s.getEnglish());
		ps.setString(6,s.getPer()+"");
		ps.setString(7,s.getGrade()+"");
		ps.setString(8, s.getResult());
		ps.executeUpdate();
		System.out.println("Added Successfully");
		
	}
	public void delete(int sid) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from smarks where sid=?");
		ps.setInt(1, sid);
		ps.executeUpdate();
		System.out.println("Student details is deleted");
	}

	public Student getStudent(int sid) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from smarks where sid=?");
		ps.setInt(1, sid);
		ResultSet ts = ps.executeQuery();
		Student s = new Student();
		if (ts.next()) {
//			System.out.println("student id is :" + ts.getInt(1));
//			System.out.println("Student name is :" + ts.getString(2));
//			System.out.println("Student English marks is :" + ts.getInt(3));
//			System.out.println("Student Maths marks is :" + ts.getInt(4));
//			System.out.println("Student science marks is:"+ts.getInt(5));
//			System.out.println("Student per is:"+ts.getDouble(6));
//			System.out.println("Student Grade is:"+ts.getString(7));
//			System.out.println("Student result is :"+ts.getString(8));
//			
//			return s;
		
		}
		return null;
	}

public List<Student> getStudentDetais() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from smarks");
		ResultSet rs = ps.executeQuery();
		List<Student> list = new ArrayList();
		while (rs.next()) {
			Student s = new Student();
//			s.setSid(rs.getInt(1));
//			s.setSname(rs.getString(2));
//			s.setMaths(rs.getInt(3));
//			s.setEnglish(rs.getInt(4));
//			s.setScience(rs.getInt(5));
			
			System.out.println("student id is :" + rs.getInt(1));
			System.out.println("Student name is :" + rs.getString(2));
			System.out.println("Student English marks is :" + rs.getInt(3));
			System.out.println("Student Maths marks is :" + rs.getInt(4));
			System.out.println("Student science marks is:"+rs.getInt(5));
			System.out.println("Student per is:"+rs.getDouble(6));
			System.out.println("Student Grade is:"+rs.getString(7));
			System.out.println("Student result is :"+rs.getString(8));
			System.out.println("------------------------------------------------");
			list.add(s);
		}
		return list;

	}

public List<Student> getTopFiveStudents() throws Exception{
	List<Student> list= new ArrayList<Student>();
	 Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	PreparedStatement stmt = con.prepareStatement("Select *from smarks order by per desc limit 5");
	ResultSet rs = stmt.executeQuery();
	while(rs.next()) {
		Student s = new Student();
//		s.setSid(rs.getInt(1));
//		s.setSname(rs.getString(2));
		
		System.out.println("student id is :" + rs.getInt(1));
		System.out.println("Student name is :" + rs.getString(2));
		System.out.println("Student English marks is :" + rs.getInt(3));
		System.out.println("Student Maths marks is :" + rs.getInt(4));
		System.out.println("Student science marks is:"+rs.getInt(5));
		System.out.println("Student per is:"+rs.getDouble(6));
		System.out.println("Student Grade is:"+rs.getString(7));
		System.out.println("Student result is :"+rs.getString(8));
		System.out.println("------------------------------------------------");
		
		list.add(s);
	}
	return list;
}
public List<Student> getFailedStudent()throws Exception{
	List<Student> list= new ArrayList<Student>();
	 Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	PreparedStatement stmt = con.prepareStatement("Select * from smarks where result='fail'");
	ResultSet rs = stmt.executeQuery();
	while(rs.next()) {
		Student s = new Student();
//		s.setSid(rs.getInt(1));
//		s.setSname(rs.getString(2));
		
		System.out.println("student id is :" + rs.getInt(1));
		System.out.println("Student name is :" + rs.getString(2));
		System.out.println("Student English marks is :" + rs.getInt(3));
		System.out.println("Student Maths marks is :" + rs.getInt(4));
		System.out.println("Student science marks is:"+rs.getInt(5));
		System.out.println("Student per is:"+rs.getDouble(6));
		System.out.println("Student Grade is:"+rs.getString(7));
		System.out.println("Student result is :"+rs.getString(8));
		System.out.println("------------------------------------------------");

		list.add(s);
	}
	return list;
}
}




