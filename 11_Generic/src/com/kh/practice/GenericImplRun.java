package com.kh.practice;

interface Inter1<T>{
	/*public abstract*/ void method1(T data);
}

interface Inter2<F>{
	void method2(F data);
}

class DataClass04<E> implements Inter1<E>, Inter2<E>{
	//void method1(E data);
	public void method1(E data) {
		System.out.println(data);
	}
	//void method2(E data); ---> 오버라이딩하셈
	public void method2(E data) {
		System.out.println(data);
	}
	
}

public class GenericImplRun {

	public static void main(String[] args) {
	// DataClass04 객체를 생성해서, 
//		"좋아하는 색은"--> method1사용, "xxx다"---> method2 사용
		
		DataClass04<String> dc4 = new DataClass04<>();
		
		dc4.method1("좋아하는 색은");
		dc4.method2("연두색이다");
		
		DataClass04<Integer> dc5 = new DataClass04<>();
		
		dc5.method1(1231231);
		dc5.method2(1111111);
	}

}




