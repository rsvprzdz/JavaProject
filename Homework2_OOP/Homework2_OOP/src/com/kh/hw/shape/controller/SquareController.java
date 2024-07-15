package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width);
		return 2*(s.getHeight()+s.getWidth()); //높이 넓이를 어떻게 한 값 반환
	}
	
	public double calcArea(double height, double width) {
		s = new Shape(4, height, width);
		return s.getHeight()*s.getWidth(); // 가로변 넓이 높이를 곱한 면적 반환
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형" + s.information();
	}
			
}
