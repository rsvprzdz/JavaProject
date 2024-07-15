package com.kh.practice.chap01;

import java.util.Scanner;

public class PNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(입력형식 000000-0000000) : ");
		String pNum = sc.next();
		
	
		int leng = pNum.length();
		char geN = pNum.charAt(7);
	
		
				
		if(leng != 14) {
			System.out.println("잘못 입력되었습니다.");

		} else {
				switch(geN) {
				case '1' : 
					System.out.println("남자");
					break;
				case '2' :
					System.out.println("여자");
				default :
					System.out.println("몰라");
				}
			
		}
		
	}
	
}
