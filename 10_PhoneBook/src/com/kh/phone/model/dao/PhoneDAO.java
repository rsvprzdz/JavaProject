package com.kh.phone.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.phone.model.vo.Phone;

public class PhoneDAO {
//파일에 저장/조회
	
	private Phone[] pArr = new Phone[10];
	
	public void fileSave(Phone[] pArr) {
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("phone.txt"))){
			
			for(int i=0;i<pArr.length;i++) {
				if(pArr[i]!=null) {
					oos.writeObject(pArr[i]);
				} else {
					break;
				}
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
				
	}
	
	public Phone[] fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream( new FileInputStream("phone.txt"))){
		
			int index = 0;
			while(true) {
				
				Phone p = (Phone)ois.readObject();
				
				pArr[index++] = p;
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(EOFException e) {
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return pArr;
	}
	
	public void fileEdit(Phone[] pArr2) {
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("phone.txt", true))){
			
			for(int i=0;i<pArr.length;i++) {
				if(pArr[i] != null) {
					oos.writeObject(pArr[i]);
				} else {
					break;
				}
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileDelete() {
		
	}
}
