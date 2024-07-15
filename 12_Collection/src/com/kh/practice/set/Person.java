package com.kh.practice.set;

public class Person {

	private String name;
	private int age;
	private double height;
	
	
	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	
	// 모든 필드의 값이 일치하면 동일한 객체로 판단 : equals, hashCode
	
	@Override
	public String toString() {
		
		return name + "/" + age + "/" + height;
	}


	@Override
	public int hashCode() {
		String info = name + age + height;
		return info.hashCode();
	}
	
	// Person객체A.equals(Person객체B) 이런식으로 호출되어 사용될 것임!
	@Override
	public boolean equals(Object obj) {
		// 현재 객체와 전달받은 객체의 각 필드 값을 비교하여 모두 일치하면 true, 그렇지 않으면 false
		// Person	Object
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(this.name.equals(p.name) &&
					this.age == p.age &&
						this.height == p.height) {
				return true;
			}
		}
		
		// 비교대상인 obj 객체가 Peson 타입이 아니거나,
		// 3개의 필드 중 하나라도 값이 다른 경우 false 리턴
		
		
		return false;
	}
	
	
	
	
}
