package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		String[] arr = new String[11];
		
		StringTokenizer st = new StringTokenizer(str);
		
		for(int i = 0 ; i<arr.length;i++) {
				arr[i]=st.nextToken();
		}
		
		String afterToken = "";
		
		for(int i=0;i<arr.length;i++) {
			afterToken += arr[i]; 
		}
			

		return afterToken;
		
		/*StringBuilder 사용방법 예제
		 * 
		 * StringTokenizer st = new StringTokenizer(str, " ");
		 * StingBuilder sb = new StringBuilder();
		 * 
		 * while(st.hasMoreTokens()){
		 * 			String token = st.nextToken();
		 * 			sb.append(token);
		 * 		}
		 * return sb.toString();
		 */
	}
	
	public String firstCap(String input) {
		
		String firstLetter = input.substring(0,1).toUpperCase();
		String remainLetter = input.substring(1).toLowerCase();
		
		String result = firstLetter + remainLetter;
		
		
		return result;
		
	}
	
	public int findChar(String input, char one) {

		//substring이랑 indexof 사용해서 해보기
		
		int count = 0;
		
		while(input.indexOf(one)>=0) {
				count++;
				input = input.substring(input.indexOf(one)+1);
		}
		return count;
		
		
		
//		int count = 0;
//		
//		for(int i = 0 ; i<input.length();i++) {
//			if(input.charAt(i)==one) {
//				count++;
//			}
//		}
//			
//		return count;
	}
}
