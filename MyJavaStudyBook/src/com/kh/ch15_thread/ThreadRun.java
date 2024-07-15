package com.kh.ch15_thread;

public class ThreadRun {
	/*
	 * * 스레드 (Thread) : 프로그램 내에서 실행 흐름을 가지고 있는 최소 작업단위
	 * 					 main 메소드 실행 시 메인스레드 실행되는 것임
	 * 	 - 프로세스 : 실행 중인 프로그램
	 * 
	 * 	* 싱글 스레드 : 한 프로세스 내에서 한 개의 스레드가 실행되는 것
	 * 	* 멀티 스레드 : 한 프로세스 내에서 여러 개의 스레드가 실행되는 것
	 * 
	 */
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		
		Runnable task = new MyThread2();
		
		Thread t2 = new Thread(task);
		
		// 스레드들을 실행대기 상태로 변경
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName()+" : END");
	}
}
