package com.hanul.student;

public class StudentDTO {
	private String name, major;
	private int num;
	private double cpp, java, sum, avg;
	
	public StudentDTO() {}

	public StudentDTO(String name, String major, int num, double cpp, double java) {
		super();
		this.name = name;
		this.major = major;
		this.num = num;
		this.cpp = cpp;
		this.java = java;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getCpp() {
		return cpp;
	}

	public void setCpp(double cpp) {
		this.cpp = cpp;
	}

	public double getJava() {
		return java;
	}

	public void setJava(double java) {
		this.java = java;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}


	
	
	
}//class
