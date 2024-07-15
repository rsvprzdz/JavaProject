package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {

	private List<Book> list = new ArrayList<>();
	
	public BookController() {
		
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	
	// 해당 list의 주소 값 반환
	public ArrayList selectList() {
		
		return (ArrayList) list;
	}
	
	public ArrayList searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			Book bk = list.get(i);
			String title = bk.getTitle();
			if(title.contains(keyword)) {
				searchList.add(list.get(i));	
			}
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
				
		Book removeBook = new Book();
		
		for(int i=0;i<list.size();i++) {
			Book bk = list.get(i);
			String getTitle = bk.getTitle();
			String getAuthor = bk.getAuthor();
			
			if(getTitle.equals(title) && getAuthor.equals(author)) {
				list.remove(i);
				
				removeBook.setTitle(getTitle);
				break;
			}
		}
		
		return removeBook;
	}
	
	public int ascBook2() {
		/*
		 *  sortList에 list의 title만 순차적으로저장
		 *  sortList를 sort()메서드로 오름차순정렬
		 */
		ArrayList<String> sortList = new ArrayList<>();
		Book bk = new Book();
		for(int i=0;i<list.size();i++) {
			bk = list.get(i);
			String title = bk.getTitle();
			sortList.add(title);
		}
		Collections.sort(sortList);
		
		for(int i=0;i<sortList.size();i++) {
			//i는 sortList의 title을 순차적으로 꺼내오는 순서
			//j는 list(j)의 bk객체의 title을 순차적으로 꺼내오는 순서
			//i번째 sortList와 j번째 list의 title을 각각비교
			//같아지면 list의 i번째와 j번째를 스왑
			for(int j=0;j<list.size();j++) {
				bk = list.get(j);
				String title = bk.getTitle();
				if(sortList.get(i)==title) {
					Collections.swap(list, i, j);
				}
			}
		}
		
		return 1;
		// 배열 정렬에 실패하는 경우가 있나..?????
	}
	
	public int ascBook() {
		// 책 이름으로 오름차순 정렬 후 1 반환
		// ArrayList에 담긴 객체인 Book 클래스에 compareTo 메소드 재정의하여 정렬
		Collections.sort(list);
		
		
		return 1;
	}
}
