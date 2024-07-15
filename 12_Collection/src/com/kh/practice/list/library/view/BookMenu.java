package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);

	private BookController bc = new BookController();

	public void mainMenu() {
		System.out.println("== Welcome KH Library==");
		try {
			while (true) {
				System.out.println("====******* 메인 메뉴 *******====");
				System.out.println("1. 새 도서 추가");
				System.out.println("2. 도서 전체 조회");
				System.out.println("3. 도서 검색 조회");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 도서 명 오름차순 정렬");
				System.out.println("9. 종료");
				System.out.print("메뉴 번호 선택 : ");

				int menu = sc.nextInt();
				sc.nextLine();

				switch (menu) {

				case 1:
					insertBook();
					break;
				case 2:
					selectList();
					break;
				case 3:
					searchBook();
					break;
				case 4:
					deleteBook();
					break;
				case 5:
					ascBook();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("번호를 입력하세요 이상한거말고... / 프로그램 종료");
		}
	}

	public void insertBook() {
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int category = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		String selectCategory = "";
		switch (category) {
		case 1:
			selectCategory = "인문";
			break;
		case 2:
			selectCategory = "과학";
			break;
		case 3:
			selectCategory = "외국어";
			break;
		case 4:
			selectCategory = "기타";
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 번호를 입력하셔야해요.");
			return;
		}

		// * 배열을 사용한다면..
		/*
		 * String[] categories = {"인문", "자연과학", "의료", "기타"};
		 * Book b2 = new Book(title, author, categories[category-1], price);
		 * 
		 */
		
		//* 문자열 split() 사용한다면..
		/*
		String categories = "인문,자연과학,의료,기타";
		Book b3 = new Book(title, author, categories.split(",")[category-1],price);
		*/
		
		Book bk = new Book(title, author, selectCategory, price);

		bc.insertBook(bk);
	}

//	1. bc(BookController)의 selectList() 메소드를 호출 후
//	 --> 결과 값을 임의의 리스트(ArrayList<Book> bookList)에 대입
//	2. 조건식 이용해서
//	 2_1. bookList가 "비어있는 경우" --> "존재하는 도서가 없습니다." 라는 알람 문구 출력
//	 2_2. bookList가 "비어있지 않은 경우" --> 반복문을 통해 bookList 안의 Book 객체들 출력
	public void selectList() {
		ArrayList<Book> bookList = new ArrayList<>();

		bookList = bc.selectList();

		System.out.println("==== 도서 전체 조회 ====");

		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
		System.out.println("");

	}

	public void searchBook() {
		ArrayList<Book> searchList = new ArrayList<>();

		System.out.println("==== 도서 검색 ====");
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		searchList = bc.searchBook(keyword);

		if (searchList.size() == 0) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}

	public void deleteBook() {

		System.out.println("==== 도서삭제 ====");
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();

		Book removeBook = bc.deleteBook(title, author);

		if (removeBook == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		} else if (removeBook != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		}
		System.out.println();

	}

	public void ascBook() {
		//	배열 정렬이 실패하는경우..? 데이터가 없을때?
		//	아니면 이미 정렬이 되어있을때??
		//	둘다 굳이 실패라고 할 이유는 없어보임 
		if (bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}

}
