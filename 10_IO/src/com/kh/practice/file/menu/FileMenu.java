package com.kh.practice.file.menu;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void maniMenu() {
		
		while(true) {
			System.out.println("***** My Note*****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			
			case 1 :
				fileSave();
				break;
			case 2 : 
				fileOpen();
				break;
			case 3 : 
				fileEdit();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.\n" + "ex끝it 이라고 입력하면 종료됩니다");
			System.out.print("내용 : ");
			
			String content = sc.nextLine();
			
			if(!content.equals("ex끝it")) { // 입력값이 "ex끝it" 가 아닌경우
				sb.append(content);
				
			} else {
				break;
			}
		
		}
		
		// 사용자 입력이 끝난 후 ("ex끝it" 입력 후)
		System.out.println("저장할 파일 명을 입력해주세요 (ex. myFile.txt : ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName)) {	// 이미 파일이 존재하는 경우
			System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
			String answer = sc.next().toUpperCase();
			
			if(answer.equals('Y')) {
				fc.fileSave(fileName,sb);
				return;
			}
			// 덮어씌우지 않을 경우는 다시 파일명을 입력받도록..
		} else {		//동일한 파일이 존재하지 않을 경우
			fc.fileSave(fileName, sb);
			return;
		}
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName)) {
			// 파일이 존재하는 경우 (true) => fileOpen 메소드의 매개변수로 넘겨 반환 값 출력
			System.out.println(fc.fileOpen(fileName)); 
		} else {
			// 파일이 존재하지 않을 경우 (false) => 없는 파일입니다 출력 후 mainMenu로 돌아가라
			System.out.println("없는 파일입니다.");
			return;
		}
	}
	
	public void fileEdit() {
		StringBuilder sb = new StringBuilder();
		System.out.println("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName)) {
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.\n" + "ex끝it 이라고 입력하면 종료됩니다");
				System.out.print("내용 : ");
				
				String content = sc.nextLine();
				
				if(!content.equals("ex끝it")) { // 입력값이 "ex끝it" 가 아닌경우
					sb.append(content);
				} else {
					fc.fileEdit(fileName, sb);
					break;
				}
			}
		} else {
			System.out.println("없는 파일입니다.");
			return;
		}
	}
}
