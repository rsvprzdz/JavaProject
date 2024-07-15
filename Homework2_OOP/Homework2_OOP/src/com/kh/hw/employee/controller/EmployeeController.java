package com.kh.hw.employee.controller;

import java.util.Scanner;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {

	Scanner sc = new Scanner(System.in);
	
	private Employee[] e = new Employee[5];
	
	//인덱스 0번부터 차례대로 비었는지 확인 후 사원 입력
	public void add(int empNp, String name, char gender, String phone) {
		
		for(int i=0;i<5;i++) {
			int empty;
			if(e[i]==null) {
			 empty = i;
			 e[empty] = new Employee(empNp, name, gender, phone);
			 return;
			}
		}
	}
	public void add(int empNp, String name, char gender, String phone, String dept, int salary, double bonus) {
		for(int i=0;i<5;i++) {
			int empty;
			if(e[i]==null) {
			 empty = i;
			 e[empty] = new Employee(empNp, name, gender, phone, dept, salary, bonus);
			 return;
			}
		}
	}	
	
	//TODO modify 메서드를 사용자가 선택한 번호의 인덱스 객체만 수정하도록 변경해야함
	//	구조는 사용자로부터 수정할 객체 번호 받기 - 무엇을 수정할것인지 번호 받기 - 해당객체의 수정할요소 셋메서드 호출
	public void modify(int empNum, String phone) {
		e[empNum].setPhone(phone);
	}
	
	public void modify(int empNum, int salary) {
		e[empNum].setSalary(salary);
	}
	public void modify(int empNum, double bonus) {
		e[empNum].setBonus(bonus);
	}

	//TODO remove 메서드를 사용자가 선택한 번호의 인덱스 객체만 삭제하도록 변경해야함
	// 구조는 사용자로부터 삭제할 객체 번호 받기 - 해당 객체의 주소값 null로 반환
	// 삭제 후 배열의 중간 인덱스가 비었을 경우, 사원출력메서드와 사원추가메서드에 이상없는지 체크해야함
	
	public Employee remove(int empNum) {
		// 객체 e[0]에 null을 저장하여 객체 삭제
		e[empNum] = null;
		
		return e[empNum];
	}
	
	public String inform(int num) {
		if(e[num]==null) {
			return null;
		} else {
		return e[num].printEmployee();
		}
	}
	
	// 전체 사원의 이름 목록을 반환하는 메서드
	// 객체가 생성된 배열만 반환하는 방법이 있나?
	// 삭제된 중간 배열의 객체가 null 일경우로 잘 반환되는지 확인해야함

	
	public String listUp() {
		
//		배열 전체를 순서대로 스캔, 해당 인덱스가 null값인경우
//		"공란입니다". 값이 있는경우 겟네임을 namelist에 추가, namelist 반환
		
		String nameList="";
		
		for(int i=0;i<5;i++) {
			
			if(e[i]==null) {
				nameList += (i+1)+"."+"공란입니다.\n";
			} else {
				nameList += (i+1)+"."+e[i].getName()+"\n";
			}
		}
		
		
		return nameList;
	}
}
