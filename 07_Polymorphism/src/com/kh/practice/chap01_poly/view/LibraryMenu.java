package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private Scanner sc = new Scanner(System.in);
	private LibraryController lc = new LibraryController();
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴번호 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				Member mInfo = lc.myInfo();
				System.out.println(mInfo/*.toString*/);
				break;
			case 2 : 
				selectAll();
				break;
			case 3 :
				searchBook();
				break;
			case 4 : 
				rentBook();
				break;
			case 9 : 
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시입력하세요.");
			}
		}
	}
	

	public void selectAll() {
		Book[] bList = lc.selectAll();
		
		for(int i = 0 ; i < bList.length ; i++) {
			System.out.println(i+"번 도서 : "+bList[i]/*.toString*/);
		}
	}
	
	// 검색 결과를 담아줄 새로운 Book 객체 배열 생성
	// 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
	// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
	// 전달받은 keyword를 포함하고 있으면 → HINT : String 클래스의 contains() 참고
	// 검색결과의 도서목록에 담기 → HINT : count 이용
	// 해당 검색결과의 도서목록 주소 값 리턴
	public void searchBook(){
		Book[] sList = new Book[5];
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		sList=lc.searchBook(keyword);
		
		
		for(int i=0;i<sList.length;i++) {
			if(sList[i]==null) {
				return;
			} else {
				System.out.println(sList[i].toString());
			}
		}
	}
	
	
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result=lc.rentBook(index);
		
		switch(result) {
		case 0 :
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1 :
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2 :
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
	}
}
