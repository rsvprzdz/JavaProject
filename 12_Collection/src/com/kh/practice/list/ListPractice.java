package com.kh.practice.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ListPractice {
	/*
	 * *List 특징*
	 * : 중복이 가능하고, 순서가 있는 콜렉션이다.
	 * 
	 * 
	 * *ArrayList
	 *  - 배열 구조
	 *  - 데이터 조회가 빠르다 읽기가 빠르다
	 *  - 데이터 추가 삭제가 복잡하여 오래걸린다 , 느리다
	 *  
	 *  ArrayList<E> 참조변수명 = new ArrayList<[E]>();
	 *  List<E> 참조변수명 = new ArrayList<[E]>(); => 다형성 적용
	 *  
	 * *LinkedList
	 *  - 리스트 구조
	 *  - 데이터 추가 삭제가 빠르다.
	 *  - 데이터 조회가 느리다.
	 *   
	 *  
	 *  LinkedList<E> 참조변수명 = new LinkedList<[E]>();
	 *  List<E> 참조변수명 = new LinkedList<[E]>(); => 다형성 적용
	 *  
	 * * List 관련메소드
	 *  - 저장된 데이터 크기 : size()
	 *  - 데이터 추가 : add(데이터)
	 *  - 데이터 삭제 : remove(인덱스)
	 *  - 데이터 조회 : get(인덱스)
	 *  
	 *  
	 *  
	 */
	public static void main(String[] args) {

//		arrayListTest();
//		linkedListTest();
//		stackTest();
		queueTest();
		
	}
	

	public static void queueTest() {
		
		MyQueue mq = new MyQueue();
		
		mq.enQueue("딸기");
		mq.enQueue("사과");
		mq.enQueue("배");
		
		System.out.println(mq.daQueue());
		System.out.println(mq.daQueue());
		System.out.println(mq.daQueue());
		System.out.println(mq.daQueue());
		
		
		
	}
	
	
	public static void stackTest() {
		/*
		 * 스택(Stack) : LIFO(Last In First Out)
		 * 				제일 마지막에 저장된 데이터가 제일 처음으로 꺼내올 수 있는 구조
		 *  - 데이터 추가 : 순서대로 추가(끝에 추가)
		 *  - 데이터 제거 : 마지막 위치부터 제거
		 */
		
		
		/* --------------------
		 * MyStrack
		 * --------------------
		 * - arrStack : ArrayList<String> = new ArrayList<>();
		 * --------------------
		 * + push(data:String):void		// 데이터 추가
		 * + pop(): String				// 데이터 제거
		 * 								// isEmpty() => 데이터가 없을 경우 "리스트가 비었습니다." 반환
		 * 								// remove() => arrStack(리스트)에서 데이터 제거 후 해당 데이터를 반환
		 * --------------------
		 */
		
		MyStack stack = new MyStack();
		
		stack.push("레몬");
		stack.push("아보카도");
		stack.push("파인애플");
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
	
	
	public static void linkedListTest() {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		// 사용자에게 정수값을 입력 받아
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int length = sc.nextInt();
		
		// 그 길이만큼 랜덤값을 저장(랜값 범위 : 1~length)
		for(int i=0; i<length;i++) {
			list.add(i,(int)(Math.random()*length+1));
		}
		
		
		// 저장된 정보 출력 : printItem 메소드 사용
		printItem(list);
		
		
		
		
	}

	public static void arrayListTest() {
		// 문자열 데이터를 관리하는 ArrayList  객체 생성
		
		ArrayList<String> list = new ArrayList<>();
		// 데이터 추가 : add		// 배열에서 데이터를 추가했을 때는..
		list.add("아구찜");		// arr[0] = "아구찜";
		list.add("찜닭");			// arr[1] = "찜닭"; ...
		list.add("갈비찜");
		
		// 데이터 조회 : get
		for(int i = 0;i<list.size();i++) {
			
			System.out.println(i+"번째 : " + list.get(i));
		}
		System.out.println("------------------");
		
		
		list.add(1, "돈가스");
		printItem(list);
		
		list.remove(1);
		printItem(list);

		
		list.set(2, "돈가스");
		printItem(list);
		
						
		swapList(list,1,2);
		printItem(list);
		
		
		Collections.swap(list, 0, 2);
		printItem(list);
	}
	
	public static <E> void swapList(List<E> list, int n1, int n2) {
		// 리스트에서 n1 위치의 값과 n2 위치의 값을 변경
		E a = list.get(n1);
		
		// 1) n1 위치에 있는 데이터를 변수를 저장
		list.set(n1, list.get(n2));
		 
		list.set(n2, a);
	}
	
	public static <E> void printItem(List<E> list) {
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(i+"번째 : "+list.get(i));
		}
		System.out.println("-------------------");
	}
	
}
