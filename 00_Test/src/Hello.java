import java.util.Iterator;
import java.util.Scanner;

public class Hello {
	
	// 프로그램 실행해주는 메소드 : main
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		
		
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - i - 1; j++) {
			System.out.print(" ");
			}
			for(int k = 0; k < 1 + i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
