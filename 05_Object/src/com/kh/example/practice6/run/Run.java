package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setAuthor("허완");
		b1.setPrice(3000);
		b1.setPublisher("교육부");
		b1.setDiscountRate(0.2);
		b1.setTitle("수학책");
		b1.inform();
		
		Book b2 = new Book("수학익힘책","교육부","허완");
		b2.inform();
		
		Book b3 = new Book("국어책","교육부","조건웅",4000,0.5);
		b3.inform();
	
	}

}
