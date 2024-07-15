package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.model.vo.User;

public class PlayController {

	private Scanner sc = new Scanner(System.in);
	private User user = new User("허완");
	
	public void game01() {
//		1~50 사이의 랜덤값을 추출해서 저장하고 사용자로부터 전수를 입력받은 뒤
//		랜덤값보다 크면 "Down" 출력, 작으면 "UP"출력
//		같은 값이면 "Catch" 출력 후 User에 점수 10점 추가(단, 5번 기회안에 성공해야 점수 획득)
		int count = 0;
		int randNum = (int)(Math.random()*50+1);
		for(int i = 0; i<5; i++) {
			System.out.print("숫자를 맞춰보세요(남은기회 "+(5-i)+"번) :");
			try {
				int inputNum = sc.nextInt();
				if(inputNum>50 || inputNum<1) {
					System.out.println("1~50 사이의 숫자만 입력하세요. 바보임?");
					count--;
				} else {
					if(inputNum > randNum) {
						System.out.println("Down");
						count++;
					} else if(inputNum < randNum) {
						System.out.println("Up");
						count++;
					} else if(randNum==inputNum) {
						System.out.println("Catch");
						System.out.println("점수 10점 추가!");
						user.setScore(user.getScore()+10);
						return;
					}
				}
			} catch(InputMismatchException e){
				System.out.println("[이상한거좀 입력하지마세요]오류 발생");
				sc.next();
				i--;
			} 
		}
	}
//	
//	public void game02() {
//		int count = 0;
//		int randNum = (int)(Math.random()*3+1);
//		String rsp="";
//		
//		switch(randNum) {
//		case 0 : 
//			rsp = "가위";
//			break;
//		case 1 :
//			rsp = "바위";
//			break;
//		case 2:
//			rsp = "보";
//			break;
//		}
//		
//		System.out.print("뭐낼래?(가위 / 바위 / 보) : ");
//		String inputRsp = sc.nextLine();
//		
//		if(inputRsp.equals(rsp)) {
//			System.out.println("비겼다!");
//		} else {			
//			switch(inputRsp) {
//			
//			case "가위" :
//				
//			
//			}
//		
//			
//		}
//	}
	
	public String getUserInfo() {
		return user.toString();
	}
			
}
