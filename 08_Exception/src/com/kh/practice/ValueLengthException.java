package com.kh.practice;

public class ValueLengthException extends Exception{

	String msg;

	public ValueLengthException() {
		super();
	}

	public ValueLengthException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	
	
}
