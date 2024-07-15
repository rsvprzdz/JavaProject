package com.kh.model.vo;

public class User {

	private String nickName;
	private int score;
	
	
	public User() {
		super();
	}
	
	
	public User(String nickName) {
		super();
		this.nickName = nickName;
	}
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	public String toString() {
		return nickName+"의 현재 점수는 "+ score+"점 입니다.";
	}
}
