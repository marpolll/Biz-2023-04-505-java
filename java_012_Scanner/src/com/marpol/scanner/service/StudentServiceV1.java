package com.marpol.scanner.service;

import java.util.Scanner;

import com.marpol.scanner.models.StudentDto;

public class StudentServiceV1 {

	public void inputStudent() {
		StudentDto student = new StudentDto();
		Scanner scan = new Scanner(System.in);

		System.out.println("학생정보를 입력하세요");

		System.out.print("학번 >>  ");
		String strNum = scan.nextLine();
		student.setStNum(strNum);

		System.out.print("이름 >>  ");
		String strName = scan.nextLine();
		student.setStName(strName);

		System.out.print("학과 >>  ");
		String strDept = scan.nextLine();
		student.setStDept(strDept);

		int inGrade = 0;

		while (true) {
			System.out.print("학년 >>  ");
			int intGrade = scan.nextInt();
			student.setScGrade(intGrade);

			try {
				inGrade = Integer.valueOf(intGrade);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("학년은 정수로 입력하세요");
				continue;
			}
			if (inGrade < 1 || inGrade > 4) {
				System.out.println("학년은 1 ~ 4 범위로 입력하세요");
				continue;
			}
			break;
		}

		System.out.print("전화번호 >>  ");
		String strTel = scan.nextLine();
		student.setStTel(strTel);
		
		System.out.println(student.toString());
		scan.close();
	}
	

}
