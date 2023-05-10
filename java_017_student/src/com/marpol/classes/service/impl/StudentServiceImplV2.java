package com.marpol.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.marpol.classes.config.Line;
import com.marpol.classes.datas.DataIndex;
import com.marpol.classes.datas.DataSource;
import com.marpol.classes.models.StudentDto;
import com.marpol.classes.service.StudentService;

public class StudentServiceImplV2 implements StudentService {

	protected List<StudentDto> sdtList;

	public StudentServiceImplV2() {

		sdtList = new ArrayList<>();

	}

	@Override
	public void loadStudent() {

		String studentFile = "src/com/marpol/classes/datas/student.csv";
		Scanner filescan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(studentFile + "이 없습니다 확인하세요");
			return;
		}
		filescan = new Scanner(is); // system.in

		while (filescan.hasNext()) {

			String[] student = filescan.nextLine().split(",");
			StudentDto stDto = new StudentDto();
			
			//stDto.stNum = student[DataIndex.student.SC_NUM]; 해도된다.
			stDto.stNum = student[0];
			stDto.stName = student[1];
			stDto.stDept = student[2];
			stDto.stGrade = Integer.valueOf(student[3]);
			stDto.stTel = student[5];
			stDto.stAdd = student[6];

			sdtList.add(stDto);
		}
		filescan.close();
	}

	@Override
	public void printStudent() {
		System.out.println(Line.dLine(100));
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		System.out.println(Line.sLine(100));
		int i = 0;
		for (StudentDto dto : sdtList) {
			System.out.printf("%s\t", dto.stNum);
			System.out.printf("%s\t", dto.stName);
			System.out.printf("%s\t", dto.stDept);
			System.out.printf("%d\t", dto.stGrade);
			System.out.printf("%s\t", dto.stTel);
			System.out.printf("%s\n", dto.stAdd);
			// 5줄 마다 구분선을 출력
			// 다만 구분선 출력 위치가 리스트의 끝보다 적을때만
			if (++i % 5 ==0 && i < sdtList.size()) {
				System.out.println(Line.sLine(100));
			}
			
//			i++;
//			if (i % 5 == 0) {
//				System.out.println(Line.sLine(100));
//
//			}
		}
		System.out.println(Line.dLine(100));
	}

	@Override
	public StudentDto getStudent(String stNum) {
		for(StudentDto dto : sdtList) {
			if(dto.stNum.equals(stNum)) {
				return dto;
			}
		}
		return null;
	}

}
