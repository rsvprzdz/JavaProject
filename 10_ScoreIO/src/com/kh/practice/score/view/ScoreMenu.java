package com.kh.practice.score.view;

import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {

	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			
			switch(menu){
			
			case 1 :
				saveScore();
				break;
			case 2 :
				readScore();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");		
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
		
	}
	
	public void saveScore() {
		int num = 0;
				
		while(true) {
			System.out.println("N번 째 학생 정보 기록");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math;
			double avg = sum/3;
			scr.saveScore(name, kor, eng, math, sum, avg);
			
			System.out.print("그만 입력하시려면 N또는 n입력, 계속하시려면 아무 키나 입력하세요 : ");
			char yn = sc.next().toUpperCase().charAt(0);
			
			if(yn=='N') {
				return;
			}
		
		}
	}
	
	public void readScore() {
		
	}
	
}
