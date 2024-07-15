package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {

	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			Scanner sc = new Scanner(System.in);
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			
			case 1 :
				insertEmp();
				break;
			case 2 :
				updateEmp();
				break;
			case 3 :
				deleteEmp();
				break;
			case 4 :
				listUp();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void insertEmp() {
		System.out.print("사원 번호 : ");
		int empNum = sc.nextInt();
		System.out.print("사원 이름 : ");
		String empName = sc.next();
		System.out.print("사원 성별 : ");
		char empGender = sc.next().charAt(0);
		System.out.print("전화 번호 : ");
		String empPhone = sc.next();
		System.out.print("추가 정보를 더 입력하시겠습니까? : ");
		char answer = sc.next().charAt(0);
		
		// 입력받은 값 대문자로 바꾼 뒤 비교하는법
		//if(answer.toUpperCase().equals("Y')){}
		//to.UpperCase() : 문자열의 값을 모두 대문자로 변경
		if(answer == 'y' || answer == 'Y') {
			System.out.print("사원 부서 : ");
			String empDept = sc.next();
			System.out.print("사원 연봉 : ");
			int empSalary = sc.nextInt();
			System.out.print("보너스율 : ");
			double empBonus = sc.nextDouble();
			
			ec.add(empNum, empName, empGender, empPhone, empDept, empSalary, empBonus);
			
		} else {
			ec.add(empNum, empName, empGender, empPhone);
		}
	}
	
	public void updateEmp() {
		int empNum =listUp();
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		
		case 1 : 
			System.out.print("수정할 전화번호 : ");
			String newPhone = sc.next();
			ec.modify(empNum, newPhone);
			break;
		case 2 :
			System.out.print("수정할 사원 연봉 : ");
			int newSalary = sc.nextInt();
			ec.modify(empNum, newSalary);
			break;
		case 3 : 
			System.out.print("수정할 보너스율 : ");
			double newBonus = sc.nextDouble();
			ec.modify(empNum, newBonus);
			break;	
		case 9 :
			return;
		default :
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
	}
	
	public void deleteEmp() {

		int empNum = listUp(); 
		System.out.print("정말 삭제하시겠습니까(y/n)?");
		char answer = sc.next().charAt(0);
		
		if(answer == 'y' || answer == 'Y') {
			ec.remove(empNum);
			System.out.println("데이터 삭제에 성공하였습니다.");
		} else {
			System.out.println("데이터 삭제에 실패하였습니다.");
		}
	}
	
	public void printEmp(int num) {
		String info = ec.inform(num);
		if (info== null) {
			System.out.println("저장된 사원 정보가 없습니다.");
		} else {
			System.out.println(info);	
		}
	}
	
	// 사원 목록을 호출하고 입력한 사원의 정보를 호출하는 메서드
	public int listUp() {
		System.out.println("====전체 사원 목록====");
		System.out.println(ec.listUp());
		System.out.println("선택할 사원의 번호를 입력하세요 : ");
		int selectNum = sc.nextInt();
		
		switch(selectNum) {
		
		case 1 : 
			printEmp(0);
			break;
		case 2 :
			printEmp(1);
			break;
		case 3 :
			printEmp(2);
			break;
		case 4 : 
			printEmp(3);
			break;
		case 5 : 
			printEmp(4);
			break;
		default :
			System.out.println("번호좀 똑바로 입력하세요");
			break;
		}
		
		return selectNum-1;
	}
	
		
}
