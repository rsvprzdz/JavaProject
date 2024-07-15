package com.kh.ch13_generics;

public class GenericRun {

	/*
	 * 제네릭 : 클래스 또는 메소드에서 사용되는 다양한 데이터 타입을 일반화하여 정의하는 것
	 * 
	 * - 특징 
	 * 		* 코드 재사용성이 증가
	 * 		* 타입 안정성 제공
	 * 		* 불필요한 형변환 감소
	 * 
	 * - 제네릭 클래스
	 * 
	 *		[접근제한자] [예약어] class 클래스명 <T> { // T: 타입매개변수
	 *			// [1] 필드의 데이터 타입
	 *				T value;
	 *
	 *			// [2] 메소드의 매개변수 타입
	 *				public void method(T data){}
	 *
	 *			// [3] 메소드의 반환타입
	 *				public T method2(){}
	 *		}
	 *
	 * 	=>	제네릭 클래스 객체 생성 시 데이터 타입을 결정 -> 명시하지 않으면 Object로 처리됨
	 * 		데이터 타입으로 기본자료형은 사용할 수없음 => Wrapper 클래스를 사용해야 함
	 *
	 *  - 제네릭 메소드
	 *  		
	 *  		[접근제한자] [예약어] <T> 반환타입 메소드명([매개변수]){}
	 *  		// 타입 매개변수 적용 범위 : 매개변수 타입 / 반환타입 / 지역변수 타입
	 *  
	 *  - 제네릭 타입 제한
	 *  	* <T> : 제한없이 어떤 타입이든지 허용
	 *  	* <T extends 클래스A> : 클래스A 또는 클래스A를 상속받은 클래스만 허용
	 *  	* <T extends 인터페이스A> : 인터페이스A를 구현한 클래스만 허용
	 *  	* <T extends 클래스A & 인터페이스A> : 클래스A를 상속받고, 인터페이스A를 구현한 클래스만 허용
	 *  
	 */
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();
		
		Integer[] iArr = new Integer[10];
		iBox.setList(iArr);
		iBox.setSize(iArr.length);
		
		iBox.getList()[0] = 603;
		System.out.println(iBox.getList()[0]);
		
		Box<String> sBox = new Box<>();
		
		sBox.setList(new String[3]);
		sBox.setSize(3);
		
		for(String s : sBox.getList()) {
			System.out.println(s);
		}
	}
}
