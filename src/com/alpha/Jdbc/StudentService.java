package com.alpha.Jdbc;

public class StudentService {

	public void saveStudent(Student s) throws Exception
	{
		char grade;
	  String result;

		double per = ((s.getEnglish() + s.getScience() + s.getMaths()) / 300.00) * 100;
		s.setPer(per);
		if (per >= 70) {
			grade = 'A';
	result="pass";
		} else if (per >= 60) {
			grade = 'B';
		result="pass";
		} else if (per >= 50) {
			grade = 'C';
	result="pass";
		} else {
			grade = 'D';
	result="fail";
		}
		s.setGrade(grade);
	s.setResult(result);

		StudentDao dao = new StudentDao();
//	dao.save(s);
		//dao.getStudent(3035);
		//dao.delete(3031);
	//	dao.getStudentDetais();
	//	dao.getTopFiveStudents();
		dao.getFailedStudent();
	}
}
