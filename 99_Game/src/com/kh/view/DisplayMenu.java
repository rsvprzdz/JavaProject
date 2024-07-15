package com.kh.view;

import java.util.Scanner;

import com.kh.controller.PlayController;

public class DisplayMenu {

	private Scanner sc = new Scanner(System.in);
	private PlayController pc = new PlayController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("======Console Game======");
			System.out.println("1. Up & Down");
			System.out.println("2. 가위바위보");
			System.out.println("3. 숫자 야구");
			System.out.println("9. 점수 조회");
			System.out.println("0. 게임 종료");
			System.out.println("========================");
			System.out.print("메뉴를 선택하세요 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 :
				pc.game01();
				break;
			case 9 :
				System.out.println(pc.getUserInfo()); 
				break;
			case 0 :
				System.out.println("게임이 종료 되었습니다.");
				return;
			default :
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
		
	}
	
	
	
}
