package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {

	private Book[] bArr = new Book[10]; // Book 타입의 객체배열

	public void fileSave(Book[] bArr) {
		// 객체를 저장하는 스트림인 ObjectOutputStream을 가지고 book.txt에
		// 매개변수로 받은 bArr을 저장, 단 null이 아닌 것만 저장함

		// 1. 스트림 객체 생성
		// 2. 입력받을 떄 (read), 출력할 때(write)에 필요한 메소드 사용하여 입출력 작업 진행
		// 3. 스트림 사용 완료(close) => try~with~resource문 사용 시 생략가능
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"))) {

			// 향상된 for문 => for(배열아이템타입(자료형) 변수명 : 배열명)
			for (Book b : bArr) {
				if (b != null) {
					oos.writeObject(b);
				} else {
					break;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Book[] fileRead() {
		// 저장된 객체를 읽어오는 스트림인 ObjectInputStream을 가지고
		// readObject() : Object => Object 타입으로 반환
		// book.txt에 저장된 객체를 필드 bArr에 저장하여 반환

		// 더 이상 파일에 읽을 게 없을 때 뜨는 예외인 EOFException이 발생하면
		// 예외만 잡아주고 안에는 아무 처리도 하지 않음

		/** 트라이리소스문이 뭐지? 아래가 트라이리소스문이라는데 공부해야함 = 생성자를 괄호안에 넣으면
		 * 따로 close()를 안해주어도 자동으로 해줌**/
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"))) {
			
			int index = 0;
			while (true) {

				Book b = (Book) ois.readObject();

				bArr[index++] = b;
				/*
				 * } catch (EOFException e){ 
				 * 		System.out.println("-----------1"); 
				 * 		break; //EOFException 예외 발생 시 반복문 종료  
				 * } catch (ClassNotFoundException e) { 
				 *  	System.out.println("-----------2"); 
				 *  	e.printStackTrace(); 
				 * }
				 * 
				 */

			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("--------------1");
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("--------------2");
		} catch (IOException e) {
			System.out.println("--------------3");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("--------------4");
			e.printStackTrace();
		}

		return bArr;
	}

}
