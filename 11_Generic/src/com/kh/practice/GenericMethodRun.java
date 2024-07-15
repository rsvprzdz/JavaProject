package com.kh.practice;


class DataClass02 {
	
	public <T> void test(Integer num) {
		T data;	// 메소드 지역 변수에 제네릭 적용(사용)
		
		data = (T)num;
		
		System.out.println(data);
	}
	
	public <T> T test2(T data) { // 제네릭을 반환타입, 매개변수 타입에 적용
		T t;
		t= data;
		return data; 
	}
}

class DataClass02_1<T>{
	public <K> void test(T data, K data2) {
		
	}
}

public class GenericMethodRun {

	public static void main(String[] args) {

		DataClass02 d1 = new DataClass02();
		
		d1.test(123456);		// 타입을 지정하지 않으면, T(타입매개변수) ---> Object로 변환
		d1.<Double>test(777);	// 타입매개변수 T가 Double로 변경
		
		d1.test2("Orange");		// 타입을 지정하지 않으면, T가 매개변수 값으로 넣은 타입으로 자동으로 지정됨
		d1.<Integer>test2(999999);
		
		//--------
		DataClass02_1<String> d2 = new DataClass02_1<>();
		
		d2.<Integer>test("Test", 100);	// 첫번째 매개변수 타입은 객체 생성 시점에 정해짐!	
		d2.<Double>test("Test2", 3.14);	// 두번째 매개변수타입은 메소드 호출 시점에 정해짐!
		d2.<String>test("Test3", "zzz");
		
	}

}
