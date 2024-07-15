package com.kh.practice.map.controller;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {

	private HashMap map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		
		boolean result = map.containsKey(id);
		if(!result) {
		map.put(id, m);
		return true;
		}
		
		return false;
	}
	
	public String logIn(String id, String password) {
		//boolean result = map.containsKey(id);// 오답인듯 > 왜 오답인지 분석해보셈
		Member m = (Member) map.get(id);
		if(m != null) {		// 데이터가 있다면.. 
			if(m.getPassword().equals(password)) {		// 저장된 비밀번호와 전달된 비밀번호를 비
			return m.getName();		// 같다면, 해당 객체의 이름 데이터를 반환
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		
//		boolean result = map.containsKey(id); <= 이걸 할 필요가 없는듯(id의 m null 여부 판단으로 조회 가능)
		
		Member m = (Member) map.get(id);
		if(m != null) {		// 데이터가 있다면
			if(m.getPassword().equals(oldPw)) {		// 저장된 비밀번호와 입력된 기존 비밀번호가 같다면
				m.setPassword(newPw);	// 새로운 비밀번호로 변경, map에 저장된 객체의 주소를 m 참조변수가 가리키고 있으므로 setter로 변경
			return true;
			}
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		Member m = (Member) map.get(id);
		String name = m.getName();
		map.replace(id, name, newName);
	}
	
	public TreeMap sameName(String name) {
		TreeMap tMap = new TreeMap(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		
		// (HashMap)map 의 키 목록 조회 : keySet()
		for(Object k : map.keySet()) {
			Member m = (Member) map.get(k);
			if(m.getName().equals(name)) {
				tMap.put(k, name);	// k: 아이디
			}
		}
		
		return tMap;
		
	}
}
