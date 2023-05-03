package com.marpol.scanner.service;

import java.util.Scanner;

import com.marpol.scanner.models.StudentDto;

public class StudentServiceV2 {

	public void inputStudents() {
		StudentDto[] stList = new StudentDto[5];
		StudentDto student = new StudentDto();
		Scanner scan = new Scanner(System.in);

		System.out.println("학생정보를 입력하세요");
		for (int i = 0; i < stList.length; i++) {
			System.out.print("학번 >>  ");
			String strNum = scan.nextLine();
			stList[i].setStNum(strNum);

			System.out.print("이름 >>  ");
			String strName = scan.nextLine();
			stList[i].setStName(strName);

			System.out.print("학과 >>  ");
			String strDept = scan.nextLine();
			stList[i].setStDept(strDept);

			int inGrade = 0;

			while (true) {
				System.out.print("학년 >>  ");
				int intGrade = scan.nextInt();
				stList[i].setScGrade(intGrade);

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
			stList[i].setStTel(strTel);
		}
		System.out.println(student.toString());
		scan.close();
	}

}
