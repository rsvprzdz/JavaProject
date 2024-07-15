package com.kh.practice.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test {

		public static void main(String[] args) {
			lotto();
		}
		
		
		/** lotto 메소드
		*   : 1 ~ 45 정수를 중복되지 않게 6개 생성
		*     생성된 6개의 정수를 int[] 로 변환 후 출력
		*/

		public static void lotto(){
			Set<Integer> num = new HashSet<>();
			int[] arr = new int[6];
			while(num.size()<6){
				num.add( (int)(Math.random()*45+1) );
			}
			
			Iterator<Integer> it = num.iterator();
			
			for(int i=0;it.hasNext();i++) {
				int n = it.next();
				arr[i]=n;
			}
			
			for(int a : arr) {
				System.out.println(a);
			}

		}
	

}