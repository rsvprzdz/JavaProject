package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// 기본 생성자를 통해 Member 타입의 객체를 생성
		
		Member m = new Member();
		
		// changeName()을 이용해 값 변경
		
		m.changeName("허완");
		
		// printName()을 이용해 출력
		//System.out.println(m.memberName); 이건 안됨 private이라 직접 접근 막음
		m.printName();
	}
}
