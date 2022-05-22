package com.hanul.student;

import java.text.DecimalFormat;

import com.hanul.fruit.FruitDTO;

public class StudentDAO {
	
	//생성자 메소드
	public StudentDAO() {}

	private StudentDTO[] student;	//멤버변수로 전환

	public StudentDAO(StudentDTO[] student) {
		this.student=student;
	}

	
	public void getSum() {
		for (int i = 0; i < student.length; i++) {
			student[i].setSum(student[i].getJava() + student[i].getCpp());
		}
	}

	public void getAvg() {
		for (int i = 0; i < student.length; i++) {
			student[i].setAvg(student[i].getSum() / 2);
		}
		
	}

	public void avgDescSort() {
		for (int i = 0; i < student.length; i++){
			for(int j = i+1; j<student.length; j++) {
				if(student[i].getAvg() < student[j].getAvg()) {
					StudentDTO temp = student[i];
					student[i] = student[j];
					student[j]=temp;
				}//if
			}//for j
		}//for i
		
	}//avgDescSort()

	public void display() {
		DecimalFormat df = new DecimalFormat("#####.0");
		System.out.println("=============================================================");
		System.out.println("학생명\t학번\t\t학과\t C++ \t JAVA \t 총점 \t 평균");
		System.out.println("=============================================================");
		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i].getName()+"\t");
			System.out.print(student[i].getNum()+"\t");
			System.out.print(student[i].getMajor()+"\t");
			System.out.print(df.format(student[i].getCpp())+"\t ");
			System.out.print(df.format(student[i].getJava())+"\t ");
			System.out.print(df.format(student[i].getSum())+"\t ");
			System.out.println(df.format(student[i].getAvg())+"\t ");
		}//for
		System.out.println("=============================================================");
	}//display()

}
