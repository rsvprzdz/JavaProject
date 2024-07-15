package com.kh.practice.list;

import java.util.ArrayList;

public class MyStack {

	private ArrayList<String> arrStack = new ArrayList<>();
	
	public void push(String data) {
		arrStack.add(data);
	}
	
	public String pop() {
		
		if(arrStack.isEmpty()) {
			return "리스트가 비었습니다.";
		} 
		 
		return arrStack.remove(arrStack.size()-1);
	}
	
	
}
