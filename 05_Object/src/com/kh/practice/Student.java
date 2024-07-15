package com.kh.practice;

public class Student {
	int no;			// 학번
	String name;	// 이름
	int age;		// 나이
	char gender;	// 성별

	
	public Student() {}
	
	public Student(String name) {
		// 이름을 저장할 name 변수에 전달된 값(name)을 대입
		this.name = name;
	}
	
	// 정보 조회
	public void inform() {
		System.out.println("[" + no + "]"
							+ name + ","+age+','+gender);
	}
	

	public String getName() {
		return name;
	}
}
