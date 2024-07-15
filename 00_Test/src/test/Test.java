package test;

class MyUtils{
	
	public void add(int a, int b){
		System.out.printf("%d + %d = %d\n",a,b,a+b);
	}

	public void minus(int a, int b){
		System.out.printf("%d - %d = %d\n",a,b,a-b);
	}
}  
public class Test {

	 public static void main(String[] args) {
		 // 다음 코드가 정상 동작될 수 있도록 작성해주세요.
		
		 

	 
}

public static int solution(int a, int b) {
    String cal1 = ""+a+b;
    int cal2 = 2*a*b;
        
    int answer = Integer.parseInt(cal1) >=cal2 ? Integer.parseInt(cal1) : cal2;
    return answer;
}
