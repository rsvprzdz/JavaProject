package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	
//	각 객체배열에 저장된 객체의 수를
//	정수배열에 담아 주소값을 반환하는 메소드
	public int[] personCount() {
		
		int[] count = new int[2];
		int studentCount=0; //학생객체 배열에 저장된 객체의 수를 반환할 변수
		int employeeCount=0; //사원객체 배열에 저장된 객체의 수를 반환할 변수
		
		
			for(int i=0;i<s.length;i++) {
				if(s[i]!=null) {
					studentCount++;
				}
			}
			for(int j=0;j<e.length;j++) {
				if(e[j]!=null) {
					employeeCount++;
				}
			}
		
		count[0]=studentCount;
		count[1]=employeeCount;
		
		return count;
	}
			
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {		
	}
	
	public Student[] printStudent() {
		return null;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
	}
	
	public Employee[] printEmployee() {
		return null;
	}

	

	
}
