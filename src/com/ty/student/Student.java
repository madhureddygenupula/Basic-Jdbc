package com.ty.student;

public class Student {

	private String id;
	private String name;
	private double semester_1;
	private double semester_2;
	private double semester_3;
	private double semester_4;
	private double semester_5;
	private double semester_6;
	private double semester_7;
	private double semester_8;
	private double percentage;
	private String grade;
	private String result;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSemester_1() {
		return semester_1;
	}

	public void setSemester_1(double semester_1) {
		this.semester_1 = semester_1;
	}

	public double getSemester_2() {
		return semester_2;
	}

	public void setSemester_2(double semester_2) {
		this.semester_2 = semester_2;
	}

	public double getSemester_3() {
		return semester_3;
	}

	public void setSemester_3(double semester_3) {
		this.semester_3 = semester_3;
	}

	public double getSemester_4() {
		return semester_4;
	}

	public void setSemester_4(double semester_4) {
		this.semester_4 = semester_4;
	}

	public double getSemester_5() {
		return semester_5;
	}

	public void setSemester_5(double semester_5) {
		this.semester_5 = semester_5;
	}

	public double getSemester_6() {
		return semester_6;
	}

	public void setSemester_6(double semester_6) {
		this.semester_6 = semester_6;
	}

	public double getSemester_7() {
		return semester_7;
	}

	public void setSemester_7(double semester_7) {
		this.semester_7 = semester_7;
	}

	public double getSemester_8() {
		return semester_8;
	}

	public void setSemester_8(double semester_8) {
		this.semester_8 = semester_8;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	

	public Student(String id, String name, double semester_1, double semester_2, double semester_3, double semester_4,
			double semester_5, double semester_6, double semester_7, double semester_8, double percentage, String grade,
			String result) {
		super();
		this.id = id;
		this.name = name;
		this.semester_1 = semester_1;
		this.semester_2 = semester_2;
		this.semester_3 = semester_3;
		this.semester_4 = semester_4;
		this.semester_5 = semester_5;
		this.semester_6 = semester_6;
		this.semester_7 = semester_7;
		this.semester_8 = semester_8;
		this.percentage = percentage;
		this.grade = grade;
		this.result = result;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", semester_1=" + semester_1 + ", semester_2=" + semester_2
				+ ", semester_3=" + semester_3 + ", semester_4=" + semester_4 + ", semester_5=" + semester_5
				+ ", semester_6=" + semester_6 + ", semester_7=" + semester_7 + ", semester_8=" + semester_8
				+ ", percentage=" + percentage + ", grade=" + grade + ", result=" + result + "]";
	}

	

}
