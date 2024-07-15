package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	

	
	public void practice1() {
		//	1. 3행 3열짜리 문자열 배열 선언 및 할당
		String[][] arr = new String[3][3];
		
		//	2. 인덱스 0행 0열부터 2행 2열까지 차례대로 "(0, 0)" 형식으로 값을 저장
		// arr.length => 2차원 배열의 길이, 즉, 행의 길이
		for(int i=0;i<arr.length;i++) {	// i: 행의 인덱스로 사용
			
			//	arr[i].length => 1차원 배열의 길이. 즉, 열의 길이
			//	String[] str; strArr과 arr[i]의 자료형은 동일함

			for(int j=0;j<arr[i].length;j++) {	// j: 열의 인덱스로 사용
				// arr[i][j] 는 문자열 데이터다!
				arr[i][j] = "("+i+", "+j+")";
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int num = 1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=num;
				num++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d ",arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
		int[][] arr = new int[4][4];
		int num = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {

		
		int[][] arr = new int[4][4];
		
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				int lastRow = arr.length-1; //행의 인덱스 3 의미
				int lastCol = arr[i].length-1; // 열의 인덱스 3 의미
				
				if(i != lastRow && j != lastCol) {
					arr[i][j] = (int)(Math.random()*10+1);
				}
				
				// 마지막 행의 위치에 현재 값을 더하기
				
				if(i<lastRow) { // i가 0 1 2 일경우
					arr[lastRow][j] += arr[i][j]; // arr[3][0~3]
				}
				
				// 마지막 열의 위치에 현재 값을 더하기
				if(j<lastCol) {
					arr[i][lastCol] += arr[i][j]; // arr[0~3][3] = arr[0~3][3]+arr[0~3][0~2]
				}

				
				
//					arr[i][3]=arr[i][0]+arr[i][1]+arr[i][2];
//					
//				for(int i = 0; i<3; i++) {
//					for(int j=0; j<3; j++) {
//						arr[3][i] += arr[j][i];
//					}
//				}
//					arr[3][j]=arr[0][j]+arr[1][j]+arr[2][j];
				
//				for(int i=0; i<3; i++) {
//					for(int j=0; k<3; j++) {
//						arr[i][3] += arr[i][j];
//					}
//				}
			}
		}
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		System.out.print("열 크기 : ");
		int col = sc.nextInt();

		while(!(row <= 10 && row > 0 && col <= 10 && row >0)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다");
					System.out.print("행 크기 : ");
					row = sc.nextInt();
					System.out.print("열 크기 : ");
					col = sc.nextInt();
		}
		
		int[][] arr = new int[row][col];
		
		for(int i= 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j]=(int)(Math.random()* (90-65+1)+65);
				// 65(A) ~ 90(Z) 까지의 랜덤값 => Math.random()*(최대값 - 최소값 +1) + 최소값
			}
		}
		
		for(int i=0; i<row ; i++) {
			for(int j =0; j<col; j++){
				System.out.print((char)arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		int[][] arr = new int[row][];
		
		for(int i=0;i<row;i++) {
			System.out.printf("%d행의 열 크기 : ",i);
			int col = sc.nextInt();
			arr[i]= new int[col];
		}
		int num = (int)'a';
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				
				arr[i][j]= num++;
			}
		}
		for(int i=0; i<row ; i++) {
			for(int j =0; j<arr[i].length; j++){
				System.out.print((char)arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		String[] arr = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] dv1 = new String[3][2];
		String[][] dv2 = new String[3][2];
		int num = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				dv1[i][j] = arr[num];
				num += 1;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				dv2[i][j] = arr[num];
				num += 1;
			}
		}
		System.out.println("== 1분단 ==");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(dv1[i][j] + "  ");
			}
			System.out.println("");
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(dv2[i][j] + "  ");
			}
			System.out.println("");
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		String[][] dv1 = new String[3][2];
		String[][] dv2 = new String[3][2];
		int num = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
					dv1[i][j]=arr[num];
					num += 1;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
					dv2[i][j]=arr[num];
					num += 1;
			}
		}
		
		System.out.println("== 1분단 ==");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(dv1[i][j] + "  ");
			}
			System.out.println("");
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(dv2[i][j] + "  ");
			}
			System.out.println("");
		}
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String dv = "";
		String line = "";
		String side = "";
		
		for(int i = 0 ; i<3;i++) {
			for(int j = 0 ; j < 2 ; j++) {
				if(name.equals(dv1[i][j])) {
					dv = "1";
					
					if(name.equals(dv1[0][j])){
						line = "첫";
					} else if(name.equals(dv1[1][j])) {
						line = "두";
					} else {
						line = "세";
					}
					
					if(name.equals(dv1[i][0])) {
						side = "왼";
					} else {
						side = "오른";
					}
					break;
					
				} else if(name.equals(dv2[i][j])) {
					dv = "2";
					
					if(name.equals(dv2[0][j])){
						line = "첫";
					} else if(name.equals(dv2[1][j])) {
						line = "두";
					} else {
						line = "세";
					}
					
					if(name.equals(dv2[i][0])) {
						side = "왼";
					} else {
						side = "오른";
					}
					 break;
				}
			}
		}
		System.out.printf("검색하신 %s 학생은 %s분단 %s 번째 줄 %s쪽에 있습니다.",name,dv,line,side);
	}

	public void practice00() {
		int[][] arrSum = new int[4][4];
		
		for(int i =0 ; i < arrSum.length ; i++) {
			for(int j = 0 ; j < arrSum[i].length ; j++) {
				
				if(i<3 && j<3) {
					arrSum[i][j] = (int)(Math.random()*10+1);
				}
				
				if(i<3) { //i = 0 1 2) j = 0 1 2 3)
					arrSum[3][j] += arrSum[i][j];
				}
				
				if(j<3) { //i = 0 1 2 3) j = 0 1 2)
					arrSum[i][3] += arrSum[i][j];
				}
			}
		}
				
		for(int i = 0 ; i < arrSum.length ; i++) {
			for(int j = 0 ; j < arrSum[i].length ; j++) {
				System.out.printf("%3d  ",arrSum[i][j]);
			}
			System.out.println("");
		}
	}

}

