package com.kh.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionRun {

	public static void main(String[] args) {

		
		System.out.println("----- (1) -----");
		try {
			exceptionTest3();
			
		} catch (ValueLengthException e) {
			System.out.println("----- (5) -----");
			e.printStackTrace();
		}
		System.out.println("----- (6) -----");
	}

	
	/*
	 * 1.	ArithmethicException, InputMismatchException
	 * 		사용자로부터 2개의 정수를 입력받고,
	 * 		첫번째 입력된 값이 두번째 입력된 값의 배수인지 확인하여
	 * 		배수인 경우에는 "x은 x의 배수입니다." 출력
	 * 		배수가 아닌 경우에는 "x는 x의 배수가 아닙니다." 출력
	 * 		(프로그램이 정상적으로 종료될 수 있도록 시작지점에 "----- start -----"
	 * 									 마지막 지점에 "----- end -----" 출력)
	 */
	
	public static void exceptionTest1() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			

				System.out.println("----- start -----");
			try {
				System.out.print("정수 x를 입력하세요 : ");
				int x = sc.nextInt();
				System.out.print("정수 y를 입력하세요 : ");
				int y = sc.nextInt();

				if (x % y == 0) {
					System.out.println(x + "는 " + y + "의 배수입니다.");
				} else {
					System.out.println(x + "는 " + y + "의 배수가 아닙니다.");
				}
			}

			catch (ArithmeticException e) {
				System.out.println("0으로 어떻게 나눌거야 이양반아");
				e.printStackTrace();
			}

			catch (InputMismatchException f) {
				System.out.println("숫자를 입력하라고 이양반아");
				sc.nextLine();
				f.printStackTrace();
				
			}
			System.out.println("----- end -----\n");
			
		}
	}
		
		/*
		 * NegativeArraySizeException, ArrayIndexOutOfBoundsException
		 * -5 ~ 5 사이의 난수를 발생시켜 해당 난수크기로 배열을 생성한 후에
		 * 1부터 배열 크기만큼 1씩 증가시키면서 값을 저장한 후 출력
		 * (프로그램이 정상적으로 종료되는것을 확인하기 위해 처음과 끝이 "start", "end" 출력)
		 */
	public static void exceptionTest2() {
		System.out.println("start");
		
		try {
			int a = (int)(Math.random()*11-5);
			int[] ar = new int[a];
			
			for(int i = 0 ; i<ar.length ;i++) {
				ar[i]=1+i;
				System.out.println(ar[i]);
			}
		}
		catch(NegativeArraySizeException n){
			n.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}
		
		System.out.println("end");
	}	

	/*[사용자 정의 예외 클래스 만들기]
	 * - Exception 클래스 상속
	 * - 생성자 (기본/매개변수1개 ->msg:String)
	 * 
	 * 사용자에게 입력받은 값의 길이가 3 이하인 경우 예외를 발생시키기
	 * - ValueLengthException
	 * - main 메서드에서 예외처리
	 * 
	 * 
	 * * throw new 예외클래스명(); // 예외클래스 객체 생성
	 * * 발생 시킨 메서드 헤드부분에 throws 예외클래스명 추가
	 */
	public static void exceptionTest3() throws ValueLengthException{
		Scanner sc = new Scanner(System.in);
		System.out.println("----- (2) -----");

		ValueLengthException v = new ValueLengthException();
		
		System.out.println("아무거나입력하셈");
		String msg = sc.next();
		
		if(msg.length()<=3) {
			
			System.out.println("----- (3) -----");

			throw new ValueLengthException("입력된 길이가 3 이하입니다. 4글자 이상 입력하세요.");
		}
		
		System.out.println(msg);
		System.out.println("----- (4) -----");

	}

}

