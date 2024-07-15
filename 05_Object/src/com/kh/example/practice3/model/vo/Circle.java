package com.kh.example.practice3.model.vo;

public class Circle {

	private static double Pi = 3.14;
	private static int radius = 1;
	
	public Circle() {}
	
	public void incrementRadius() {
		radius++;
	}

	
	public void getAreaOfCircle() {
		double areaOfCircle = Pi*radius*radius;
		System.out.println("원의 넓이 : " + areaOfCircle);
	}
	

	
	public void getSizeOfCircle() {
		double sizeOfCircle = 2*Pi*radius;
		System.out.println("원의 둘레 : " + sizeOfCircle);
		
	}
}
