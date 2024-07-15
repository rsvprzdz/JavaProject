package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {

	Scanner sc = new Scanner(System.in);
	
	PersonController pc = new PersonController();
	
	
	public void mainMenu() {
		while(true) {
			
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.printf("현재 저장된 학생은 %d명입니다.\n",pc.personCount());
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.printf("현재 저장된 사원은 %d명입니다.\n\n",pc.personCount());
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 :
				studentMenu();
				break;
			case 2 : 
				employeeMenu();
				break;
			case 9 :
				System.out.println("종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void studentMenu() {
		
		int[] count = new int[2];
		count = pc.personCount();
		
		if(count[0]==3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 2 : 
				printStudent();
				break;
			case 9 :
				System.out.println("메인으로 돌아갑니다");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} else {
			while(true) {
				System.out.println("1. 학생 추가");
				System.out.println("2. 학생 보기");
				System.out.println("9. 메인으로");
				System.out.print("메뉴 번호 : ");
				int menu = sc.nextInt();
				
				switch(menu) {
				
				case 1 : 
					insertStudent();
					break;
				case 2 : 
					printStudent();
					break;
				case 9 :
					System.out.println("메인으로 돌아갑니다");
					return;
				default : 
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}	
					
					// 만일 학생 객체 배열에 담긴 데이터의 수가 3개 일 때
					// “학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상
					// 활성화 되지 않습니다.”를 출력 후 메뉴 번호를 담음
					// 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
					// 학생 객체 배열에 담긴 데이터의 수가 3개가 아닐 때는
					// 위에 출력한 메뉴 모두 받을 수 있게 함
					
					// 잘못 입력했을 경우, “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
			}
		}
	}
	
	public void employeeMenu() {
		
	}
	
	public void insertStudent() {
		
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
	
}
