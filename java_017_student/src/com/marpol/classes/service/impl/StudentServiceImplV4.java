package com.marpol.classes.service.impl;

import java.util.ArrayList;

import com.marpol.classes.config.Line;
import com.marpol.classes.models.StudentDto;

public class StudentServiceImplV4 extends StudentServiceImplV2 {

	public StudentServiceImplV4() {

		// sdtList 객체는 V2 클래스에서 protected 로 선언한 객체이다.
		// 이 객체는 V3 클래스를 상속(extends) 받은 클래스에서 접근 가능하다
		sdtList = new ArrayList<>();

	}

	@Override
	public void printStudent() {

		System.out.println(Line.dLine(100));
		System.out.print("학번\t 이름\t 학년\t 학과\t 전화\t 주소\n");
		System.out.println(Line.sLine(100));

		int i = 0;
		for (StudentDto dto : sdtList) {
			System.out.printf("%s\t", dto.stNum);
			System.out.printf("%s\t", dto.stName.substring(0, 3));
			System.out.printf("%s\t", dto.stDept);
			System.out.printf("%d\t", dto.stGrade);
			System.out.printf("%s\t", dto.stTel);
			System.out.printf("%s\n", dto.stAdd);
			if (++i % 5 == 0 && i < sdtList.size()) {
				System.out.println(Line.sLine(100));
			}
			
		}
		System.out.println(Line.dLine(100));
	}
}
