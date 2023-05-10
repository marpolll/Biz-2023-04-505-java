package com.marpol.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.marpol.classes.models.StudentDto;
import com.marpol.classes.service.impl.ScoreServiceImplV5;

public class StudentD {

	public static void main(String[] args) {
		List<StudentDto> stdList = new ArrayList<>();
		
		ScoreServiceImplV5 scService = new ScoreServiceImplV5();
		
		scService.loaadStudent();
		scService.printStudent();
		
		StudentDto stDto = scService.getStudent("S0003");
		
		System.out.println(stDto.toString());
	
		// 유전공학과 들만 불러오고 싶은면 어떻게 해야할까 ???????
	  for(StudentDto dto : stdList) {
		StudentDto Dto = scService.getDept("유전공학과");
		System.out.println(Dto.toString());
	  }
	}
}
