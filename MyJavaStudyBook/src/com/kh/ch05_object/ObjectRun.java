package com.kh.ch05_object;

public class ObjectRun {

	public static void main(String[] args) {
		/*
		 * * 객체 : 현실 세계에 독립적으로 존재하는 것들 ( 목적/가치/의미가 있는 유형/무형/개념 등 )
		 * 
		 * * 객체 지향 프로그램 : 현실세계의 객체들간의 상호작용을 프로그래밍을 통해
		 * 					 가상세계로 구현하는 과정(플오그램잉)
		 * 
		 * 	 => 프로그램 상에 필요한 객체들을 만들기 위해 "클래스"라는 틀을 먼저 만들어야 함!
		 * 		* 클래스 : 객체들의 속성(정보)들을 담고 있는 틀
		 * 
		 * 
		 * 	 - 추상화 과정 : 대상 객체에 대하여 정리하는 작업
		 * 	 	[1] 프로그램에서 필요한 대상 객체 선정
		 * 		[2] 객체들이 가지고 있는 공통적인 속성, 기능들을 모두 추출
		 * 		[3] 추출된 내용들을 가지고 구현할 프로그램에 "목적"에 맞게 필요한 속성, 기능을 추려낼 것
		 * 		[4] 최종적으로 추출된 속성들을 어떤 자료형, 어떤 변수명을 사용할 것인지 정리
		 */
		
		/*
		  	* 클래스 구조
		  	
		  	public class 클래스형 {
		  		// 필드부 --> 데이터를 저장할 변수들을 정의하는 부분
		  		
		  		// 생성자부 --> 객체 생성 시 사용되는 특이한 메소드
		  		 
		  		// 메소드부 --> 객체의 어떤 기능들을 정의하는 부분  
		  		 
		  
		 */
		// 객체 생성
		// 클래스명 참조변수명 = new 클래스명();	// new 생성자;
		
		Student s1 = new Student();
		s1.name="기다운";
		
		System.out.println(s1/*.toString()*/);
		System.out.println("학생이름: "+s1.name);
		
		Student s2 = new Student();
		s2.name = "이주원";
		
		//------------------------------------
		/*
		 * 객체 지향 원칙 : 외부에서 값을 직접적으로 접근하지 못하게 하는 것
		 * * 캡슐화 :외부로부터 "데이터의 직접 접근"을 막고,
		 * 			"데이터에 간접적으로" 처리 하는 마소드를 클래스 내부에 작성하는 것
		 * 							--> 값을 대입/반환
		 * [1] 정보 은닉 : private 제한자 사용
		 * [2] getter/setter 메소드 : private 으로 제한된 필드(변수)에 간접적으로 접근할 수 있도록
		 * 							기능을 제공하는 메소드
		 * 		+ getter 메소드 : 해당 필드에 담긴 값을 반환해주는 메소드
		 * 		+ setter 메소드 : 해당 필드에 값을 대입하고자 할 때, 저장할 값ㅇ르 전달받아 대입시켜주는 메소드
		 * 
		 *  
		 *  
		 * 
		 */
		
		Animal animal1 = new Animal();
		animal1.setName("도치");
		animal1.setType("고슴도치");
		animal1.setGender('M');
		animal1.setMasterName("주원님");
		animal1.setAge(2);
		
		System.out.println(animal1);
		
		Animal animal2 = new Animal("초롱이", 5, 'M', "민욱님", "고양이");
		System.out.println(animal2);
		
				
	}

}
