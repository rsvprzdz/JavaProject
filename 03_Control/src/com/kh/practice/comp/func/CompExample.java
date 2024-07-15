package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("양수가 아닙니다.");
		}
		
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				System.out.print("박");
			} else {
				System.out.print("수");
			}
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		while(true) {
			if(num<1) {
				System.out.println("양수가 아닙니다.");
				System.out.print("정수 : ");
				num = sc.nextInt();
			
			} else {
				for(int i=1;i<=num;i++) {
					if(i%2!=0) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
				}
				break;
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 : ");
		char cha = sc.next().charAt(0);
		
		
	}
}
