package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double k = sc.nextDouble();
				
		System.out.print("영어 : ");
		double e = sc.nextDouble();
		
		System.out.print("수학 : ");
		double m = sc.nextDouble();
		
		int t = (int)(k + e + m);
		int ev = (int)(k + e + m)/3;
		
		System.out.println("총점 : " + t);
		System.out.println("평균 : " + ev);
		
		String 한글 = "가나다라";
		
		System.out.println(한글);
		
		
		
	}
}
