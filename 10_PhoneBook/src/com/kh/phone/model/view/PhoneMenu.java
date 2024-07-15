package com.kh.phone.model.view;

import java.util.Scanner;

import com.kh.phone.model.controller.PhoneController;
import com.kh.phone.model.vo.Phone;

public class PhoneMenu {

	private Scanner sc = new Scanner(System.in);
	private PhoneController pc = new PhoneController();
	private Phone[] pArr;
	
	
	public PhoneMenu() {
		pc.makeFile();
		pArr = pc.fileRead();
	}
	
	public void mainMenu(){
		
		while(true) {
			System.out.println("1. 연락처 저장");
			System.out.println("2. 연락처 목록 출력");
			System.out.println("3. 연락처 수정");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시입력하세요.");
				break;
			}
		}
	}
	
	public void fileSave() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("연락처 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("정보를 추가하시겠습니까? y/n : ");
		String yn = sc.next();
		sc.nextLine();
		if(yn.toUpperCase().charAt(0)=='Y') {
			
			System.out.print("소속 : ");
			String dept = sc.nextLine();
			System.out.print("메일 : ");
			String email = sc.nextLine();
			System.out.print("메모 : ");
			String note = sc.nextLine();
			sc.nextLine();
			
			Phone p = new Phone(name, phoneNumber,dept,email,note);
			
			for(int i=0;i<pArr.length;i++) {
				if(pArr[i]==null) {
					pArr[i]= p;
					break;
				}
			}
		} else if(yn.toUpperCase().charAt(0)=='N') {
			Phone p = new Phone(name, phoneNumber);
			
			for(int i=0;i<pArr.length;i++) {
				if(pArr[i]==null) {
					pArr[i]= p;
					break;
				}
			}
		}
		
		pc.fileSave(pArr);
	}
	
	public void fileRead() {
		Phone[] pList = pc.fileRead();
		
		for(int i=0;i<pList.length;i++) {
			System.out.println((i+1)+". "+pList[i]);
		}
	}
	
	public void fileEdit() {
		System.out.println("-----연락처 목록-----");
		
		fileRead();
		
		System.out.print("수정할 연락처를 선택하세요 : ");
		int selectNum = sc.nextInt();
		System.out.println("-----수정할 정보 입력-----");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		sc.nextLine();

		System.out.print("연락처 : ");
		String phoneNumber = sc.nextLine();
		System.out.print("소속 : ");
		String dept = sc.nextLine();
		System.out.print("메일 : ");
		String email = sc.nextLine();
		System.out.print("메모 : ");
		String note = sc.nextLine();
		
		Phone p = new Phone(name, phoneNumber, dept, email, note);
		
		pArr[selectNum]=p;

		
		pc.fileEdit(pArr);
	}
}
