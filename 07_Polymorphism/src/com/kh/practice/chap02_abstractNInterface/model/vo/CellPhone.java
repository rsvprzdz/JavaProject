package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface CellPhone extends Phone, Camera{
	// 상수 : 1개 (Phone.NUMBERPAD)
	
	
	// 추상메소드 : 4개 (Phone - 2(makeCall/takeCall)
	//				, Camera - 1(picture)
	//				, CellPhone - 1(charge))
	public abstract String charge();		// 충전 방식
}
