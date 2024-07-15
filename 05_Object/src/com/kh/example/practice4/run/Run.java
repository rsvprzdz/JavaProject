package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student s = new Student();
		
		s.information();
		s.setClassroom(6);
		s.setGrade(3);
		s.setHeight(166.6);
		s.setGender('남');
		s.setName("허완");
		s.information();
	}

}
