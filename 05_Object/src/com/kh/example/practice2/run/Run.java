package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {

		Product p = new Product();
		p.setBrand("남양유업");

		p.setName("프로바이오틱");
		
		p.setPrice(600);

		p.information();
	
		
	}

}
