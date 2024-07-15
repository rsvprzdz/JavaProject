package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("입력 메뉴입니다");
		} else if (menu == 2) {
			System.out.println("수정 메뉴입니다");
		} else if (menu == 3) {
			System.out.println("조회 메뉴입니다");
		} else if (menu == 4) {
			System.out.println("삭제 메뉴입니다");
		} else {
			System.out.println("종료 메뉴입니다");
		}
	}
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
				
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			}
			else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}		
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int ko = sc.nextInt();
		System.out.print("수학점수 : ");
		int ma = sc.nextInt();
		System.out.print("영어점수 : ");
		int en = sc.nextInt();
		
		int to = ko + ma + en;
		double ev = to/3;
		
		if(ev>=60 && ko>=40 && ma>=40 && en>=40) {
			System.out.println("국어 : " + ko);
			System.out.println("수학 : " + ma);
			System.out.println("영어 : " + en);
			System.out.println("합계 : " + to);
			System.out.println("평균 : " + ev);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String season = "";
		switch(month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;
		
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
			
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
			
		default:
			System.out.println("해당하는 계절이 없습니다.");
		}
		if(month >= 1 && month <= 12) {
			System.out.println(month + "월은 " + season + "입니다.");
		}
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pass = sc.next();
		
		// String은 동등비교가 불가능함, 따라서 equals라는 연산자 사용 
		if(id.equals("myId")) {
			if(pass.equals("myPassword12")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		/*
		if(id.equals("myId") && pass.equals("myPassword12")){
			System.out.println("로그인성공");
		} else if (!id.equals("myId")){
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}	
		*/
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String lv = sc.next();
		
		switch(lv) {
		case "관리자" :
			System.out.println("회원관리, 게시글관리, 게시글작성, 댓글작성, 게시글조회");
			break;
		case "회원" :
			System.out.println("게시글작성, 댓글작성, 게시글조회");
			break;
		case "비회원" :
			System.out.println("게시글조회");
			break;
		default :
			System.out.println("관리자, 회원, 비회원 중에서 입력해주세요.");
		}
				
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
		System.out.println("초고도비만");
		}
	}
	
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int n2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String cal = sc.next();

		
		if(n1 > 0 && n2 > 0) {
			double result = 0;
			switch(cal) {
			case "+" :
				result = n1 + n2;
				System.out.printf("%d %s %d = %.0f", n1, cal, n2, result);
				break;
			case "-" :
				result = n1 - n2;
				System.out.printf("%d %s %d = %.0f", n1, cal, n2, result);
				break;
			case "*" :
				result = n1 * n2;
				System.out.printf("%d %s %d = %.0f", n1, cal, n2, result);
				break;
			case "/" :
				result = n1 / n2;
				System.out.printf("%d %s %d = %.6f", n1, cal, n2, result);
				break;
			case "%" :
				result = n1 % n2;
				System.out.printf("%d %s %d = %.6f", n1, cal, n2, result);
				break;
			} 
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
		}		
	}
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		System.out.print("출석 회수 : ");
		int att = sc.nextInt();
		
		double midS = mid*0.2;
		double finS = fin*0.3;
		double hwS = hw*0.3;
		double attS = (double)att;
		
		double total = midS+finS+hwS+attS;

		System.out.println("================= 결과 =================");
		
		if(total >= 70 && att > 14 ) {
			System.out.println("중간 고사 점수(20) : " + midS);
			System.out.println("기말 고사 점수(30) : " + finS);
			System.out.println("과제 점수(30) : " + hwS);
			System.out.println("출석 점수(20) : " + attS);
			System.out.println("총점 : " + total);
			System.out.println("PASS");
		} else if(total < 70 && att > 14 ) {
			System.out.println("중간 고사 점수(20) : " + midS);
			System.out.println("기말 고사 점수(30) : " + finS);
			System.out.println("과제 점수(30) : " + hwS);
			System.out.println("출석 점수(20) : " + attS);
			System.out.println("총점 : " + total);
			System.out.println("Fail [점수 미달]");
		} else {
			System.out.println("Fail [출석 회수 부족 (" + att + "/20)]");
		}
		
		// 아래와 같이 쓰면 print 중복구문을 줄일 수 있다)
		/*
		if(attS < 20*0.7) {
			System.out.println("Fail [출석 회수 부족 (" + att + "/20)]");
		} else {
			System.out.println("중간 고사 점수(20) : " + midS);
			System.out.println("기말 고사 점수(30) : " + finS);
			System.out.println("과제 점수(30) : " + hwS);
			System.out.println("출석 점수(20) : " + attS);
			System.out.println("총점 : " + total);
			
			if(total >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		}
		*/
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. P/F");
		System.out.print("선택 : ");
		int select = sc.nextInt();
		
		switch(select) {
			case 1 :
				practice1();
				break;
			case 2 :
				practice2();
				break;
			case 3 :
				practice3();
				break;
			case 4 :
				practice4();
				break;
			case 5 :
				practice5();
				break;
			case 6 :
				practice6();
				break;
			case 7 :
				practice7();
				break;
			case 8 :
				practice8();
				break;
			case 9 :
				practice9();
				break;
			default :
				System.out.println("1 ~ 9 숫자로 입력해주세요.");
		}
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pwd = sc.nextInt();
		int n1 = pwd/1000;
		int n2 = (pwd%1000)/100;
		int n3 = ((pwd%1000)%100)/10;
		int n4 = ((pwd%1000)%100)%10;
		
		if(pwd >= 1000 && pwd <= 9999) {
			if(n1 != n2 && n2 != n3 && n3 != n4 && n4 != n1) {
				System.out.println("성공");
				
			} else {
				System.out.println("중복 값 있음");
			}
		} else {
			System.out.println("자리수 안맞음");
		}
		
	}
	
}