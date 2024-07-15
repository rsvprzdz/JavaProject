package com.kh.practice.chap02.loop;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		//입력된 값이 1보다 작을 때 "1 이상의 숫자를 입력해주세요." 출력
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i=1;i<=num;i++) {
				System.out.print(i);
				if(i!=num) {
					System.out.print(" ");
				}
			}
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		/*while(true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				for(int i=1;i<=num;i++) {
					System.out.print(i);
					if(i!=num) {
						System.out.print(" ");
					}
				}
				break;
			}
		}
		*/
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		do {
			if (num>=1) {
				for(int i=1; i<=num; i++) {
					System.out.print(i);
					if (i != num) {
						System.out.print(" ");
					}
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				System.out.print("1이상의 숫자를 입력하세요 : ");
				num = sc.nextInt();
			}
		} while(true);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int total = 0;
		
		for(int i=1;i<=num;i++) {
			total = total + i;
			System.out.print(i);
			if(i != num) {
				System.out.print(" + ");
			} else {
				System.out.print(" = " + total);
			}
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1<1 || num2 <1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if(num1<num2){
			for(int i=num1;i<=num2;i++) {
				System.out.print(i);
				if(i!=num2) {
					System.out.print(" ");
				}
			}
		} else {
			for(int i=num2;i<=num1;i++) {
				System.out.print(i);
				if(i!=num1) {
					System.out.print(" ");
				}
			}
		}
	}
	/* 삼항연산자를 사용해보면 아래와 같다.
	 * Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1<1 || num2 <1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
		int min = num1 < num2 ? num1 : num2;
		int max = nu,1 > num2 ? num2 : num1;
		for(int i=min,i<=max;i++){
			System.out.print(i);
			if(i!=max){
				System.out.print(" ");
				}
			}
		}	
	 * 
	 */

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i);
					if (i != num2) {
						System.out.print(" ");
					}
				} break;
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("==== "+num+"단 ====");
		
		for(int i=1;i<10;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>=10) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else {
			for(int i=num;i<10;i++) {
				System.out.println("==== "+i+"단 ====");

				for(int j=1;j<10;j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num>=10) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			} else {
				for(int i=num;i<10;i++) {
					System.out.println("==== "+i+"단 ====");
					for(int j=1;j<10;j++) {
						System.out.println(i+" * "+j+" = "+(i*j));
					}
				} break;
			} 
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1=sc.nextInt();
		System.out.print("공차 : ");
		int num2=sc.nextInt();
	
		for(int i=1;i<=10;i++) {
			System.out.print(num1+(num2*(i-1)));
			if(i!=10) {
				System.out.print(" ");
			}
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자(+, -, *, /, %) : ");
		String op = sc.next();

		while(!op.equals("exit")) {
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			switch(op) {
			case "+" : 
				System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1+num2));
				break;
			case "-" : 
				System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1-num2));
				break;
			case "*" : 
				System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1*num2));
				break;
			case "/" : 
				if(num2==0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else
					System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1/num2));
				break;
			case "%" : 
				System.out.printf("%d %s %d = %d\n",num1,op,num2,(num1%num2));
				break;
			default :
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
			System.out.print("연산자(+, -, *, /, %) : ");
			op = sc.next();
		}
		System.out.print("프로그램을 종료합니다.");
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		String star= "*";
		int leng = star.length();
		
		for(;leng<=(num);leng++) {
			System.out.println(star);
			star += "*";
			
		}
	}
//	
//	public void practice14() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		for()
//		
//	}
}
