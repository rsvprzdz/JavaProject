package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	
	private String maker;		// 제조사 정보
	
	public SmartPhone() {
		
	}
	
	// 추상메서드 : 6개 (Cellphone - 4개, TouchDisplay - 1개, 본인거 - 1개)
	public abstract String printInformation();

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
	
}
