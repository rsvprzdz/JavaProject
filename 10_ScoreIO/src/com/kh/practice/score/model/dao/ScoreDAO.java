package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {

	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		
		
			try {
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.txt", true));
				
				dos.writeChars(name);
				dos.writeInt(kor);
				dos.writeInt(eng);
				dos.writeInt(math);
				dos.writeInt(sum);
				dos.writeDouble(avg);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		
		
		
	}
	
	public DataInputStream readScore() throws FileNotFoundException {
		
		return ;
		
	}
	
}
