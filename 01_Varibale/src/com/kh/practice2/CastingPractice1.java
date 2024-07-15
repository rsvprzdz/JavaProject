package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice1 {

	
	public static void main(String[] args) {
		
		System.out.print("문자 : ");
		
		Scanner sc = new Scanner(System.in);		
		String str = sc.next();
		
		char ch = str.charAt(0);
		
		System.out.println(ch + " unicode : " + (int)ch);
		

		
		
	}
}
