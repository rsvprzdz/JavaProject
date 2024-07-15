package com.kh.phone.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{

	private String name;
	private String phoneNumber;
	private String dept;
	private String email;
	private String note;
	
	public Phone()  {
		
	}

	
	public Phone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	
	public Phone(String dept, String email, String note) {
		super();
		this.dept = dept;
		this.email = email;
		this.note = note;
	}


	public Phone(String name, String phoneNumber, String dept, String email, String note) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dept = dept;
		this.email = email;
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public String toString() {
		
		return String.format("이름: %s \t 연락처: %s \t 소속: %s \t 메일: %s \t 메모: %s", name, phoneNumber, dept, email, note);
	}
	
}
