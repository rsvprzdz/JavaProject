package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		
		return lottery.add(l);
		
	}
	
	public boolean deleteObject(Lottery l) {
		
		
		if(!(win.isEmpty())&&lottery.remove(l)) {
			win.remove(l);
			lottery.remove(l);
			return true;
		} else {
			return lottery.remove(l);
		}
	}
	
	// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
	// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,
	// 인덱스를 이용해 win에 당첨자 저장
	// 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함
	// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
	// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움
	public HashSet winObject() {
		
		if(lottery.size()<4) {
			return null;
		}
		
		List<Lottery> list = new ArrayList<>(lottery);
		// 아래처럼 for문 돌릴필요없이 lottery 객체를 그냥 괄호안에 매개변수로 넣으면됨
//		for(Lottery l : lottery) {
//			list.add(l); 
//		}
		
		while(win.size() < 4) {
			win.add(list.get((int)(Math.random()*(list.size()) )));	
		}
		
		return win;
	}
	
	public TreeSet sortedWinObject() {
		// 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는
		// 정렬기준을 가지고 정렬된 결과를 반환
		
		// *TreeSet 생성자에게 정렬 기준을 정의한 SortedLottery 객체의 인스턴스 전달
		TreeSet<Lottery> sortedWin = new TreeSet<>(new SortedLottery());
		sortedWin.addAll(win);
		
		// 이 때, 미리 만들어진 win을 가지고 정렬하기 때문에
		// 당첨 대상 확인을 꼭 먼저 해야함
		
		return sortedWin;
	}
	
	public boolean searchWinner(Lottery l) {
		// 전달받은 객체 (Lottery l)를 win 객체에서 찾고
		// 찾은 결과인 boolean 값 반환
		
		return win.contains(l);
	}
}
