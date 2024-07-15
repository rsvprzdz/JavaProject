package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product{

	private boolean allInOne;

	
	
	public Desktop() {
		super();
	}

	
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		// 부모 클래스의 매개변수가 4개인 생성자 호출
		super(brand, code, name, price);
		
		this.allInOne = allInOne;
	}
	
	
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String information() {
		return super.information()+", allInone="+allInOne;
	}
}
