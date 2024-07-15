package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
		// 길이가 10인 배열을 선언
		int[] arr = new int[10];
		
		//2. 반복문을 사용하여 인덱스에 그 값을 저장
		/* for(int i =1;i <= 10; i++) {
			//인덱스 시작번호 : 0
			arr[i-1] = i;
		}
		*/
		
		
		for(int i = 0 ; i < 10 ; i++) {
			arr[i] = i+1;
		}
		
		// 3. 반복문을 사용하여 각 인덱스의 값을 출력
		
		for(int i=0; i<10; i++) {
			System.out.print(arr[i]);
			if(i != 9) {
				System.out.print(" ");
			}
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		//	값을 저장
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = arr.length-i;
		}
		
		//	출력
		//	배열명.length : 배열의 길이
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length-1) {
				System.out.print(" ");
			}
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			
			if(i != arr.length-1) {
				System.out.print(" ");
			}
		}
	}
	
	public void practice4() {
		String[] str = new String[5];
		str[0] = "사과";
		str[1] = "귤";
		str[2] = "포도";
		str[3] = "복숭아";
		str[4] = "참외";
		
		
//		System.out.print(str[1]);
		for(int i=0; i<str.length;i++) {
			if(str[i].equals("귤")) {
				System.out.print(str[i]);
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 문자열의 길이 : 문자열_변수/값.length();
		// 배열 길이 : 배열_변수/값.length;
		char[] strArr = new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			strArr[i]=str.charAt(i);
		}
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",str,ch);
		for(int i=0;i<str.length();i++) {
			if(strArr[i]==ch) {
				System.out.print(i);
				if(i != str.length()) {
					System.out.print(" ");
				}
			}
		}
		
		int num=0;
		System.out.printf("\n%c 개수 : ",ch);
		for(int i=0;i<str.length();i++) {
			
			if(strArr[i]==ch) {
				
				num++;
			}
		}
		System.out.print(num);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String[] day = {"월","화","수","목","금","토","일"};
		
			
		if(num<day.length && num>=0) {
				System.out.printf("%s요일",day[num]);
		} else {System.out.print("잘못 입력하셨습니다.");
		}	
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int arrLeng = sc.nextInt();
		int[] arr = new int[arrLeng];
		int total = 0;

		for(int i=0;i<arrLeng;i++) {
			total += arr[i];
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int inum = sc.nextInt();
			arr[i] = inum;
		}
		for(int i=0;i<arrLeng;i++) {
			System.out.print(arr[i]);
			if(i != arrLeng) {
				System.out.print(" ");
			}
		}
		System.out.printf("\n총 합 : %d",total);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
		

		for (;;) {
			if (n < 3 || n % 2 == 0) {
				System.out.println("다시 입력하세요");
				System.out.print("정수 : ");
				n = sc.nextInt();
			} else {
				break;
			}
		}
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			if (i <= arr.length / 2) {
				arr[i] = i + 1;
			} else {
				arr[i] = arr[i - 1] - 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length) {
				System.out.print(", ");
			}
		}
	}
	/*public void practice8() {
		Scanner sc = new Scanner(System.in);
		

		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			
			if(num >=3 && num%2 != 0) {
				int[] arr = new int[num];
				int value = 1;
				
				for (int i=0; i<num; i++) {
					
					if(i<num/2) {
						arr[i] = value++;
					} else {
						arr[i] = value--;
					}
				}
				
				for (int i=0; i<arr.length; i++) {
					if(i < arr.length-1) {
						System.out.print(arr[i]+", ");
					} else {
						System.out.print(arr[i]);
					}
				}	
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	}	*/
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();
		String[] arr = {"후라이드", "양념", "간장"};
		
		int t=0;
			
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(str)) {
				System.out.printf("%s치킨 배달 가능",str);
				t = 1;
			}
		}
		
		if(t != 1) {
			System.out.printf("%s치킨은 없는 메뉴입니다.",str);
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		char[] idn = new char[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=str.charAt(i);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i<8) {
				idn[i]=arr[i];
			} else {
				idn[i]='*';
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(idn[i]);
		}
//		[참고] Array.toString(배열명) : 배열의 데이터를 출력 ([값0, 값1, 값2, ...] 형식)
//		System.out.println(Arrays.toString(copy));
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice12() {
		int[] arr = new int[10];
		int max = 0;
		int low = 10;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
				if(arr[i]<low) {
					low=arr[i];
				}
				if(arr[i]>max) {
					max=arr[i];
				}
		}
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + low);
	}
	
	public void practice13() {
		int[] numbers = new int[10];
			//	1 ~ 10까지 랜덤값을 저장
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=(int)(Math.random()*10+1);
			
			// i-1 위치 (현재 위치의 직전 위치)까지 중복값이 있는 지 확인
			for(int j=0;j<i;j++) {
				// i번째 위치의 값과 j번째 위치의 값을 비교
				// 같으면 다시 랜덤값을 저장 --> 현재 위치의 값을 다시 저장할 수 있도록
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
			
		}

		
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}
	public void practice14() {
		int a=89;
		int b=9;
		
		int lenA = String.valueOf(a).length();
		System.out.println(lenA);
		
		int cal1 = (int) ((a*Math.pow(10, lenA) ) + b);
		System.out.println(cal1);
	}
}
