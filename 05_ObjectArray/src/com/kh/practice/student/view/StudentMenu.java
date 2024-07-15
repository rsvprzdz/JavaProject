package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	
	 
	public StudentMenu() {
		
		// ��ȯ���� �ּҰ� ���ο� ��ü�迭 ���� �����ϸ�ɵ�? ���������ΰ�? ��������´µ�
		Student[] sArr = ssm.printStudent();
		
		System.out.println("========== �л� ���� ��� ========== ");
		for(int i=0;i<sArr.length;i++) {
			System.out.println(sArr[i].inform());
		}

		//향상된 for문으로 사용해보기
//		for(Student s : sArr) {
//			System.out.println(s);
//		}
	
		double[] avg = ssm.avgScore();
		System.out.println("========== �л� ���� ��� ========== ");
		System.out.println("���� �հ� : " + ssm.sumScore()+ " / ���� ��� : "+avg[1]);
		
		
		System.out.println("========== ���� ��� ��� ========== ");
		
		String result;
		
		for(int i = 0 ; i<sArr.length;i++) {
			if(sArr[i].getScore() > ssm.CUT_LINE) {
				result = "���";
			} else {
				result = "����� ���";
			}
			System.out.println(sArr[i].getName()+"�л���"+result+"�Դϴ�.");
	
			}
		}
	
}
