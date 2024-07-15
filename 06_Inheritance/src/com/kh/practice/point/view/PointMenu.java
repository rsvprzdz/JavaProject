package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {

	private Scanner sc = new Scanner(System.in);
	
	private CircleController cc = new CircleController();
	
	private RectangleController rc = new RectangleController();
	
	//메인메뉴 출력, 잘못 입력했을 시 다시 받도록 반복
	public void mainMenu() {
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 : 
				circleMenu();
				break;
			case 2 :
				rectagleMenu();
				break;
			case 9 :
				System.out.println("종료합니다.");
				return;
			default :
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
	}
	
	//원 메뉴 출력, 잘못 입력했을 시 메인메뉴로 돌아감
	public void circleMenu() {
		
			System.out.println("==== 원 메뉴 ====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 : 
				calcCircum();
				break;
			case 2 :
				calcCircleArea();
				break;
			default : 
				System.out.println("메인으로 돌아갑니다.");
				//return; // 현재 메서드에서는 반복문이 실행되니 않으므로 굳이 사용하지 않다도 됨! 
		}
	}
	
	//사각형 메뉴 출력, 잘못 입력했을 시 메인메뉴로 돌아감
	public void rectagleMenu() {
		
			System.out.println("==== 사각형 메뉴 ====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1 : 
				calcPerimeter();
				break;
			case 2 :
				calcRectArea();
				break;
			default : 
				System.out.println("메인으로 돌아갑니다.");
				//return; // 현재 메서드에서는 반복문이 실행되니 않으므로 굳이 사용하지 않다도 됨!
		}
	}
	
	//X, y 좌표와 반지름을 받아 원의 정보와 원 둘레 출력
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		String circum=cc.calcCircum(x, y, radius);
		System.out.println(circum);
	}
	
	//X, y 좌표와 반지름을 받아 원의 정보와 원 넓이 출력
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		String cArea=cc.calcArea(x, y, radius);
		System.out.println(cArea);
	}
	
	//X, y 좌표와 높이, 너비를 받아 사각형의 정보와 사각형 둘레 출력
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		String perimeter = rc.calcPerimeter(x, y, height, width);
		System.out.println(perimeter);
	}
	
	//X, y 좌표와 높이, 너비를 받아 사각형의 정보와 사각형 넓이 출력
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		String rArea = rc.calcArea(x, y, height, width);
		System.out.println(rArea);
	}
}
