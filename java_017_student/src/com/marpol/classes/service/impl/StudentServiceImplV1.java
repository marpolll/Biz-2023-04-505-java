package com.marpol.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.marpol.classes.config.Line;
import com.marpol.classes.datas.DataIndex;
import com.marpol.classes.datas.DataSource;
import com.marpol.classes.models.StudentDto;
import com.marpol.classes.service.StudentService;

public class StudentServiceImplV1 implements StudentService{

	// 클래스 영역에 필드 변수로 StudentDto List type 으로
	// stdList 객체 선언
	protected List<StudentDto> stdList; // = new ArrayList<>(); 

	// stdList 객체는 Service 생성자 에서 초기화 한다.
	public StudentServiceImplV1() {
	//  기본 생성자에서 객체를 초기화(사용할수 있도록 생성)
		stdList = new ArrayList<>();
	}
	
	@Override
	public void loadStudent() {
		// STUDENT 문자열 배열 데이터를 forEach(확장 for) 를
		// 분해하여 개별 문자열을 str 담고 for() {} 에 전달하기
		for(String str : DataSource.student) {
			
			// str 문자열 변수에 저장된 문자열을 컴마(,)기준으로 다시 분해
			// student 배열에 저장하기
			String[] student = str.split(",");
			
			// StudentDto class type 의 stDto 객체를 생성하고
			// StudentDto type 의 객체를 생성하고
			StudentDto stDto = new StudentDto();
			
			// student 배열의 각 요소를 StudentDto type 객체 요소(변수)에
			// 저장하기
			stDto.stNum = student[DataIndex.STUDENT.St_Num];
			stDto.stName = student[DataIndex.STUDENT.St_Name];
			stDto.stDept = student[DataIndex.STUDENT.St_Dept];
			stDto.stGrade = Integer.valueOf(student[DataIndex.STUDENT.St_Grade]);
			stDto.stTel = student[DataIndex.STUDENT.St_Tel];
			stDto.stAdd = student[DataIndex.STUDENT.St_Add];
			
			// List<StudentDto> type 의 리스트에 추가하기
			stdList.add(stDto);
		}
	}

	@Override
	public void printStudent() {
		System.out.println(Line.dLine(100));
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		System.out.println(Line.sLine(100));
		for(StudentDto dto : stdList) {
			System.out.printf("%s\t",dto.stNum);
			System.out.printf("%s\t",dto.stName);
			System.out.printf("%s\t",dto.stDept);
			System.out.printf("%d\t",dto.stGrade);
			System.out.printf("%s\t",dto.stTel);
			System.out.printf("%s\n",dto.stAdd);
		}
		System.out.println(Line.dLine(100));
	}

	/*
	 * stdList 에서 stNum 학번의 학생데이터를 찾아서
	 * 학생데이터를 return
	 */
	@Override
	public StudentDto getStudent(String stNum) {
		for(StudentDto dto : stdList) {
			if(dto.stNum.equals(stNum)) {
				return dto;
			}
		}
		return null;
	}

}