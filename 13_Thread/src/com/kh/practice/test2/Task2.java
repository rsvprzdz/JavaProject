package com.kh.practice.test2;

public class Task2 extends Thread{

	@Override
	public void run() {
		// 1 ~ 30 사이의 홀수만 출력
		for(int i = 1 ; i <= 30 ; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%2!=0) {System.out.println(Thread.currentThread().getName()+":"+i);}
		}
		// 출력 후 0.1초 재우기

	}

	
}