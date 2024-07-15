package com.kh.practice.file.controller;

import com.kh.practice.file.dao.FileDAO;

public class FileController {

	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		
		return fd.checkName(file);
		
		// return fd.chectName(file);		// 호출한 결과를 그대로 return
	}
	
	public void fileSave(String file, StringBuilder sb) {
	
		fd.fileSave(file, sb.toString());
		// String content = sb.toString();
		// fd.fileSave(file, content); 와 동일함
	}
	
	public StringBuilder fileOpen(String file) {
			
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		fd.fileEdit(file, sb.toString());
	}
	
	
	
}
