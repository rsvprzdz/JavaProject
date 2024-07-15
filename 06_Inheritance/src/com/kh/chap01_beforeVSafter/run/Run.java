package com.kh.chap01_beforeVSafter.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		System.out.println(d.information());
	
		Desktop d2 = new Desktop("삼성", "SS-01", "삼성데스크탑", 200, true);
		System.out.println(d2.information());
				
		
		SmartPhone s = new SmartPhone();
		System.out.println(s.information());
		
		SmartPhone s2 = new SmartPhone("삼성", "S22", "삼성갤럭시S22", 120, "sk");
		System.out.println(s2.information());
		
		
		Tv t = new Tv();
		System.out.println(t.information());
		
		Tv t2 = new Tv("LG", "NEO", "LG NEO Q LED", 1400, 90);
		System.out.println(t2.information());
		
	}
}
