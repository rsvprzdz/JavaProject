package com.kh.practice;

import java.io.*;

public class IO07_ObjectInputStream {

	public static void main(String[] args) {

		// 파일 객체 선언
		File f = new File("./resources", "ObjectTest.txt");
		
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream( 
					new BufferedInputStream ( 
							new FileInputStream(f) 
							)
					);
			
			Object obj1 = ois.readObject();
			Student obj2 = (Student)ois.readObject();
			Student obj3 = (Student)ois.readObject();
			
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
				try {
					if(ois != null) ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
