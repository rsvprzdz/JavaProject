package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
	
	private int[] lotto ;
	
	{
		lotto = new int[6];
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			
			for(int j = 0 ; j < i ; j++) {
				if(lotto[i]==j) {
					i--;
					break;
				}
			}
		}
	}
	
	
	public Lotto() {
	}

	public void information() {
		// 방법 1
		//System.out.println(Arrays.toString(lotto));
		
		//방법2
		/*for(int i = 0 ; i < lotto.length ; i++) {
			System.out.print(lotto[i] + " ");
			*/
		
		//방법3 : 향상된 for문(foreach문): 배열의 첫번째 위치부터 마지막위치까지 순서대로 데이터에 접근
		//for(자료형 변수명 : 배열명){} ---> 자료형은 배열의 자료형과 일치해야함
		
		for(int num: lotto) {
			System.out.print(num+ ", ");
		}
	}
	
}
