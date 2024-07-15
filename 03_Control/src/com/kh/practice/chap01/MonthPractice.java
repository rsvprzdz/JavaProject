package com.kh.practice.chap01;

import java.util.Scanner;

public class MonthPractice {

	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			
			System.out.println("31일");
			break;
		
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			
			System.out.println("30일");
			break;
			
		case 2 :
			
			System.out.println("29일");
			break;
			
		default :
			
			System.out.println("잘못 입력함");
			
		}
	}
}
