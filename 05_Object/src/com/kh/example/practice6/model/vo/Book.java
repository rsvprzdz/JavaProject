package com.kh.example.practice6.model.vo;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {}
	
	public Book(String title, String publisher, String author) {
		this.title=title;
		this.publisher=publisher;
		this.author=author;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title=title;
		this.publisher=publisher;
		this.author=author;
		this.price=price;
		this.discountRate=discountRate;
		}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void inform() {
		
//		String none = "-";
//		int 
//		if(title!=null && publisher!=null && author!=null && price != 0 && discountRate!=0) {
			System.out.printf("%5s %5s %5s %5d %5f\n",title, publisher, author, price, discountRate);
//		} else {
				
		
	}
}
