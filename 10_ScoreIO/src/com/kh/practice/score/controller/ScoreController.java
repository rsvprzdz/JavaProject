package com.kh.practice.score.controller;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.kh.practice.score.model.dao.ScoreDAO;

public class ScoreController {

	private ScoreDAO sd = new ScoreDAO();
	
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		File f = new File("student.txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		sd.saveScore(name, kor, eng, math, sum, avg);
	}
	
	public DataInputStream readScore() throws FileNotFoundException{
	
		return ;
	}
}
