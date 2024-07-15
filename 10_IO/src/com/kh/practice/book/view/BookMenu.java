package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu() {
		
		bc.makeFile();
		bArr = bc.fileRead();
		
	}
	
	public void mainMenu() {

		
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			
			case 1 :
				fileSave();
				break;
			case 2 :
				fileRead();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void fileSave() {
		System.out.print("도서 명 : ");
		String name = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String[] date = sc.nextLine().split("-");
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		sc.nextLine();

		Calendar calendar = Calendar.getInstance();
		
		int year = Integer.parseInt(date[0]);		
		int month = Integer.parseInt(date[1])-1;	//	=> Calendar 클래스도 월(month) 데이터 0부터 시작 
		int day = Integer.parseInt(date[2]);
		
		calendar.set(year, month, day);
		
		Book b = new Book(name, author, price, calendar, discount);
		
		for(int i=0;i<bArr.length;i++) {
			if(bArr[i]==null) {
				bArr[i]= b;
				break;
			}
		}
		
		bc.fileSave(bArr);
		
		// 입력 받은 출판날짜를 split()를 통해 년, 월, 일로 나누고 Calendar에 담음
		/*	=> String 클래스의 split() 사용 --> [출판 날짜] 데이터는 문자열 형태로 입력 받기!
		 * => Calendar 클래스 객체 생성 후 set(int year, int month, int date) 메소드 사용하기
		 * 
		 * 각 요소와 새로 만든 Calendar를 Book 객체에 담고
		 * 비어있는 Book 객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달 --> null 체크 후 저장
		 * 
		 */
		// 각 요소와 새로 만든 Calendar를 Book 객체에 담고
		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달

	}
	
	public void fileRead() {
		Book[] bList = bc.fileRead();
		
		for(Book b : bList) {
			if(b != null) {
				System.out.println(b);
			}
		}
		// bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력

		
	}
	
	public void fileDelete() {
		
	}
	
}
