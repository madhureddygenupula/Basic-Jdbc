package com.ty.student.controller;

import java.util.Scanner;

import com.ty.student.Student;
import com.ty.student.dao.StudentDao;
import com.ty.student.service.StudentService;

public class StudentController {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StudentDao dao=new StudentDao();
		Student s = new Student();
		while (true) {
			System.out.println("Enter your choice \n 1 for save student \n 2 for get Student By name\n 3 for delete student  \n 4 for get All Students  \n 5 for top five students \n 6 for failure students \n 7 for eixt");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("Enter your Id");
				String id=sc.next();
				s.setId(id);
				System.out.println("Enter your Name");
				String name = sc.next();
				s.setName(name);
				System.out.println("Enter your semester 1 marks");
				double sem_1 = sc.nextDouble();
				s.setSemester_1(sem_1);
				System.out.println("Enter your semester 2 marks");
				double sem_2 = sc.nextDouble();
				s.setSemester_2(sem_2);
				System.out.println("Enter your semester 3 marks");
				double sem_3 = sc.nextDouble();
				s.setSemester_3(sem_3);
				System.out.println("Enter your semester 4 marks");
				double sem_4 = sc.nextDouble();
				s.setSemester_4(sem_4);
				System.out.println("Enter your semester 5 marks");
				double sem_5 = sc.nextDouble();
				s.setSemester_5(sem_5);
				System.out.println("Enter your semester 6 marks");
				double sem_6 = sc.nextDouble();
				s.setSemester_6(sem_6);
				System.out.println("Enter your semester 7 marks");
				double sem_7 = sc.nextDouble();
				s.setSemester_7(sem_7);
				System.out.println("Enter your semester 8 marks");
				double sem_8 = sc.nextDouble();
				s.setSemester_8(sem_8);
				
				StudentService ss=new StudentService();
				ss.saveStudent(s);
				dao.save(s);
				System.out.println("created successfully");
			}
			break;
			case 2:
			{
				System.out.println("Enter the student name");
				String name=sc.next();
				Student marks=dao.getStudentByName(name);
				System.out.println(marks);
			}
				break;
			case 3:
			{
				System.out.println("Enter the Student Id");
				String id=sc.next();
				dao.deleteStudent(id);
			}
			break;
			case 4:
				dao.getAllStudent();
			     break;
			case 5:
				dao.TopFiveStudents();
				break;
			case 6:
				dao.getFailureStudent();
				break;
			case 7:
				System.exit(0);
			}
		}
	}
}
