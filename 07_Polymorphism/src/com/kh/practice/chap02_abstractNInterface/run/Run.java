package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {

		PhoneController pc = new PhoneController();
		
		String[] print=pc.method();
		
		for(int i = 0 ; i < print.length ; i++) {
			System.out.println(print[i]);
		}
		
		for(String s : print) {
			System.out.println(s);
		}
	}
}
					