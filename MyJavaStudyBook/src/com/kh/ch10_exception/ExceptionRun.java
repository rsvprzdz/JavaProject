package com.kh.ch10_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionRun {

	
		/*
		 * * 예외 : 프로그램 실행 중 비정상적으로 종료 상황이 발생하는 것. (프로그램 오류)
		 * 
		 *  - 종류
		 *  	[1] 시스템오류 : 컴퓨터의 오작동으로 발생하는 오류 => 코드로 해결할 수 없다.
		 *  	[2] 컴파일오류 : 소스코드 문법상의 오류 => 컴파일 시 오류 발생되므로 발견이 쉬움(개발자의 실수)
		 *  	[3] 런타임오류 : 코드 상 문제는 없으나 실행 중 발생되는 오류
		 *  		=> RuntimeException 
		 *  			- ClassCastException : 참조하지 않은 타입으로 변환하려 할 때 발생하는 예외
		 *  			- ArithmeticException : 산술 예외 (ex. 나누기 연산 시 0으로 나누려고 할 때 발생)
		 *  			- IndexOutOfBoundsException : 인덱스 범위를 벗어나서 접근하려 할 때 발생
		 *  			- NullPointerException : 참조변수가 null인 경우 특정 변수나 메소드에 접근하려 할 때 발생 
		 *  
		 *  * 예외 처리 : 예외들이 발생되었을 때 해결하는 방법 -> 정상적으로 프로그램이 실행될 수 있도록 하는 것
		 *  
		 *  * 방법
		 *  	[1] 직접 처리 : try ~ catch
		 *  	[2] 위임(떠넘기기) : throw
		 */
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		method01();
		try {
		method02();
		} catch(IOException e){
			System.out.println("오류발생!오류발생! mani에서 처리!" + e.getMessage());
		}
		System.out.println("---- main 끝! ----");
	}
	
	public static void method01() {
		// Unchecked Exception : 예외처리가 필수는 아니나, 데이터에 따라 예외가 발생할 수 있음!
		
		System.out.println("배열 크기 : ");
		try {		
			int size = sc.nextInt();
			int[] arr = new int[size];
			
			System.out.println("100번째 인덱스 값 : " + arr[100]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열 범위를 벗어났슴다.");
		} catch (NegativeArraySizeException e) {
			System.out.println("배열 길이는 음수일리가 없슴다.");
		}
		
	}
	
	public static void method02() throws IOException{
		// CheckedException : 반드시 예외처리를 해야하는 예외들
		//						--> 보통 외부매체와의 입출력 작업 시 예외처리가 필수!
		
		// System.in : InputStream --> BufferedReader 변환 시 InputStreamReader의 도움을 받음!
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
		
		// 1. 직접 처리 (try ~ catch)
		
		String data;
		
		/*
		try {
			data = reader.readLine();
			System.out.println("입력된 값 : " + data);
		} catch (IOException e) {
			System.out.println("입출력 오류 발생!! " + e.getMessage());
		}
		*/
		
		// 2. 위임(떠넘기기) : 
		//			throws : 현재위치에서 예외처리하지 않고 메소드를 호출한 위치로 예외를 떠넘긴다.
		
		
		data = reader.readLine();
		System.out.println("입력된 값 : " + data);
		
		
		
	}
	
}