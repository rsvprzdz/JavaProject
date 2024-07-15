package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		try {
			boolean tf = nc.checkDouble(num1, num2);
			if(tf) {
				System.out.println(num1+"은(는) "+num2+"의 배수인가 ? "+tf);
			} else {
				System.out.println(num1+"은(는) "+num2+"의 배수인가 ? "+tf);
			}
		}
		catch(NumRangeException n){
			n.printStackTrace();
		}
		
		System.out.println("end");
		
	}
}
