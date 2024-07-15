package com.kh.hw.shape.view;

import java.util.Scanner;
import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {

		while (true) {

			System.out.println("==== 도형 프로그램 ====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 3:
				triangleMenu();
				break;

			case 4:
				squareMenu();
				break;

			case 9:
				System.out.println("프로그램 종료");
				return;

			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void triangleMenu() {

		while (true) {
			System.out.println("==== 삼각형 ====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {

			case 1:
				inputSize(3, 1);
				break;

			case 2:
				inputSize(3, 2);
				break;

			case 3:
				printInformation(3);
				break;

			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;

			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");

			}
		}
	}

	public void squareMenu() {

		while (true) {

			System.out.println("==== 시각형 ====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {

			case 1:
				inputSize(4, 1);
				break;

			case 2:
				inputSize(4, 2);
				break;

			case 3:
				inputSize(4, 3);
				break;

			case 4:
				printInformation(4);
				break;

			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;

			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");

			}
		}

	}

	public void inputSize(int type, int menuNum) {

		switch (type) {

		case 3:
			switch (menuNum) {

			case 1:
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("넓이 : ");
				int width = sc.nextInt();

				double area = tc.calcArea(height, width);
				System.out.println(area);

				break;

			case 2:
				System.out.println("색깔을 입력하세요 : ");
				String color = sc.next();
				System.out.println("색이 수정되었습니다");
				tc.paintColor(color);

				break;
			}

			break;

		case 4:
			switch (menuNum) {

			case 1:
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("넓이 : ");
				int width = sc.nextInt();

				double perimeter = scr.calcPerimeter(height, width);
				System.out.println(perimeter);

				break;

			case 2:
				System.out.print("높이 : ");
				int height2 = sc.nextInt();
				System.out.print("넓이 : ");
				int width2 = sc.nextInt();

				double area = scr.calcArea(height2, width2);
				System.out.println(area);

				break;

			case 3:
				System.out.println("색깔을 입력하세요 : ");
				String color = sc.next();
				System.out.println("색이 수정되었습니다");
				tc.paintColor(color);

				break;

			}
			break;
		}
	}

	public void printInformation(int type) {
		switch (type) {
		case 3:
			tc.print();
			break;
		case 4:
			scr.print();
			break;

		}
	}
}



	/*
	public void squareMenu() {
		for(;;) {
			System.out.println("==== 시각형 ====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			if(menuNum == 1) {
				
				inputSize(4,1);
				break;
				
			} else if(menuNum==2) {
				
				inputSize(4,2);
				break;
				
			}  else if(menuNum==3) {
				
				inputSize(4,3);
				break;
				
			} else if(menuNum==4) {
				
				inputSize(4,4);
				break;
				
			}else if(menuNum==9) {
				System.out.println("메인으로 돌아갑니다");
				inputMenu();
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void inputSize(int type, int menuNum) {
			if(type==3 && menuNum==1) {
				System.out.print("높이 : ");
				double height = sc.nextInt();
				System.out.print("넓이 : ");
				double width = sc.nextInt();
				double area = tc.calcArea(height, width);
				System.out.println("삼각형 면적 : " + area);
				triangleMenu();
			} else if(type==3 && menuNum==2) {
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				//sc.nextLine(); 으로 받으려니까 안받아짐.. why?????
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다");
				triangleMenu();
			} else if(type==3 && menuNum==3) {
				System.out.println(tc.print()); 
				triangleMenu();
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				triangleMenu();
			}
				
		for(;;) {
			 if(type==4 && menuNum==1) {
				System.out.print("높이 : ");
				double height = sc.nextInt();
				System.out.print("넓이 : ");
				double width = sc.nextInt();
				double area = scr.calcPerimeter(height, width);
				System.out.println("사각형 둘레 : " + area);
				squareMenu();
			} else if(type==4 && menuNum==1) {
				System.out.print("높이 : ");
				double height = sc.nextInt();
				System.out.print("넓이 : ");
				double width = sc.nextInt();
				double area = scr.calcArea(height, width);
				System.out.println("사각형 넓이 : " + area);
				squareMenu();
			} else if(type==4 && menuNum==3) {
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				//sc.nextLine(); 으로 받으려니까 안받아짐.. why?????
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다");
				squareMenu();
			} else if(type==4 && menuNum==4) {
				printInformation(2);
				squareMenu();
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				squareMenu();
			}
		}
	}
	*/
	
	

