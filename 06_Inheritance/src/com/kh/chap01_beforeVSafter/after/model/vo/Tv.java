package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product{

	private int inch;

	
	public Tv() {
		super();
	}
	
	
	public Tv(String brand, String code, String name, int price, int inch) {
		
		super(brand, code, name, price);
		this.inch=inch;
		
	}
	
	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	//@Override가 생략된상태임, 어노테이션(annotation)
	public String information() {
		return super.information()+", inch="+inch;
	}
}