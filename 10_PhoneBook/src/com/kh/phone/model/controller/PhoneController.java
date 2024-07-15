package com.kh.phone.model.controller;

import java.io.File;
import java.io.IOException;

import com.kh.phone.model.dao.PhoneDAO;
import com.kh.phone.model.vo.Phone;

public class PhoneController {

	private PhoneDAO pd = new PhoneDAO();
	
	public void makeFile() {
		File f = new File("phone.txt");
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
	
	public void fileSave(Phone[] pArr) {
		pd.fileSave(pArr);
	}
	
	public Phone[] fileRead() {
		return pd.fileRead();
	}
	
	public void fileEdit(Phone[] pArr) {
		pd.fileEdit(pArr);
	}
}
