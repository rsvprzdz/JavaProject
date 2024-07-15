package com.kh.ch09_interface;

public class Monstera extends Plant{

	public Monstera(String name) {
		this.name=name;
	}
	
	@Override
	public void sprinkleWater() {
		// nutrients의 값을 10 증가
		int nutrients = getNutrients();
		setNutrients(nutrients+10);
	}
	
	@Override
	public void baskSun() {
		// nutrients의 값을 20 증가
		int nutrients = getNutrients();
		setNutrients(nutrients+20);
	}
	
	//toString() 재정의 : 모든 필드 정보 반환
	
	@Override
	public String toString() {
		return "name = "+ name + ", nutrients = "+ getNutrients();
	}
}
