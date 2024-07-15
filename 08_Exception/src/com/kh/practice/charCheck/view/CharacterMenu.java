package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {

	Scanner sc = new Scanner(System.in);
	
	CharacterController cc= new CharacterController(); 
	
	public void menu() {
		
		try {
		System.out.print("문자열 : ");
		String msg = sc.nextLine();
		
		System.out.println("'"+msg+"'에 포함된 영문자 개수 : "+cc.countAlpha(msg));

		} catch(CharCheckException e) {
			e.printStackTrace();
		}
	}
}
