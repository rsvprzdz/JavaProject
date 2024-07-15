package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE=60;
	
	
	//5개의 객체배열을 위의 샘플 데이터의 값으로 초기화 해주는 기본 생성자
	public StudentController() {
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("박길동","디비",50);
		sArr[2] = new Student("이길동","화면",85);
		sArr[3] = new Student("정길동","서버",60);
		sArr[4] = new Student("홍길동","자바",20);
		
	}
	
	//객체 배열에 있는 데이터 반환(데이터를 가르키는 주소값을 반환하면 될듯)
	public Student[] printStudent() {
		return sArr;
	}

	public int sumScore() {
		int sum= 0;
		for(int i=0 ; i<sArr.length;i++) {
			sum = sum + sArr[i].getScore();
		}
				
		return sum;
	}

	public double[] avgScore() {
		double[] avg = new double[2];
		
		avg[0] = sumScore();
		avg[1] = sumScore()/5;
		
		return avg;
	}
	
}