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
		
	}
}
