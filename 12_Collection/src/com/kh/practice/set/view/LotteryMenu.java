package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {

	LotteryController lc = new LotteryController();
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertObject(); break;
			case 2: deleteObject(); break;
			case 3: winObject(); break;
			case 4: sortedWinObject(); break;
			case 5: searchWinner(); break;
			case 9: System.out.println("프로그램 종료."); return;
			default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
			}
		}	
	}
	
	public void insertObject() {
		System.out.print("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<num;i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("핸드폰 번호 ('-'빼고) : ");
			String phone = sc.nextLine();
			System.out.println();

			Lottery l = new Lottery(name, phone);
			
			if(!lc.insertObject(l)) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}
		}
		
		System.out.println(num+"명 추가 완료되었습니다.");
		
	}
	
	public void deleteObject() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호 ('-'빼고) : ");
		String phone = sc.nextLine();
		System.out.println();
		
		Lottery l = new Lottery(name, phone);
		
		if(lc.deleteObject(l)) {
			System.out.println("삭제 완료 되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
		
		
	}
	
	public void winObject() {
		//HashSet<Lottery> l = lc.winObject();
		//System.out.println(l);
		System.out.println(lc.winObject());
	}
	
	
	/**
	 * 정렬된 당첨 대상 확인
	 */
	public void sortedWinObject() {
		// lc에서 받아온 Set객체를 Iterator를 통해 출력
		TreeSet<Lottery> lSet = lc.sortedWinObject();
		// 1) Iterator 객체 생성(by, Set 객체)
		Iterator<Lottery> it = lSet.iterator();
		
		// 2) 데이터 유/무 확인 (by Iterator객체)
		while(it.hasNext()) {
			// 3) 데이터 조회(by Iterator객체)
			Lottery l = it.next();
			System.out.println(l);
		}
	}
	
	public void searchWinner() {
//		검색할 대상의 이름과 핸드폰 번호를 받고 매개변수 있는 Lottery 생성자를 이용해
//		객체에 정보를 담아 lc에 객체를 보냄.
//		받은 결과에 따라 true면 “축하합니다. 당첨 목록에 존재합니다.”,
//		false면 “안타깝지만 당첨 목록에 존재하지 않습니다.” 출력
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호 ('-'빼고) : ");
		String phone = sc.nextLine();
		System.out.println();
		
		Lottery l = new Lottery(name, phone);
		
		if(lc.searchWinner(l)) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
		
	}
}
