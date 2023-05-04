package com.marpol.scanner.service;

import java.util.Scanner;

import com.marpol.scanner.models.StudentDto;

public class StudentServiceV1 {

	public void inputStudent() {
		StudentDto student = new StudentDto();
		Scanner scan = new Scanner(System.in);

		System.out.println("학생정보를 입력하세요");
		System.out.print("학번 >>  ");
		String stNum = scan.nextLine();
		
		System.out.print("이름 >>  ");
		String stName = scan.nextLine();
		
		System.out.print("학과 >>  ");
		String stDept = scan.nextLine();
		
		int inGrade = 0;
		while(true) {
			System.out.print("학년 >>  ");
			int intGrade  = scan.nextInt();
			try {
				inGrade = Integer.valueOf(intGrade);
			} catch (Exception e) {
				System.out.println("학년은 정수로만 입력하세요");
				continue;
			}
			break;
		}
		
		System.out.print("전화번호 >>  ");
		String stTel = scan.nextLine();

		student.setStNum(stNum);
		student.setStName(stName);
		student.setStDept(stDept);
		student.setScGrade(inGrade);
		student.setStTel(stTel);
		
		System.out.println(toString());
		
		scan.close();
	}
}

