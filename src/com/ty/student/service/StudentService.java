package com.ty.student.service;


import java.util.Scanner;

import com.ty.student.Student;
import com.ty.student.dao.StudentDao;

public class StudentService {
Scanner sc=new Scanner(System.in);
	public void saveStudent(Student s) throws Exception
	{
		String grade;
	  String result;

		double per = ((s.getSemester_1()+ s.getSemester_2()+ s.getSemester_3()+s.getSemester_4()+s.getSemester_5()+s.getSemester_6()+s.getSemester_7()+s.getSemester_8()) / 8.0) ;
		s.setPercentage(per);
		if (per >= 7) {
			grade = "A";
	        result="pass";
		} else if (per >= 6) {
			grade = "B";
		   result="pass";
		} else if (per >= 5) {
			grade = "C";
	result="pass";
		} else {
			grade = "D";
	result="fail";
		}
	s.setGrade(grade);
	s.setResult(result);

	
	}
}
