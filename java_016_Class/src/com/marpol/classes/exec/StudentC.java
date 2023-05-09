package com.marpol.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.marpol.classes.models.StdData;
import com.marpol.classes.models.StudentDto;

public class StudentC {

	public static void main(String[] args) {

		StudentDto studentDto = new StudentDto();
		List<StudentDto> stdList = new ArrayList<>();
		
		for (int index = 0; index < StdData.student.length; index++) {
			String[] student = StdData.student[index].split(",");

			studentDto.stNum = student[StdData.St_Num];
			studentDto.stName = student[StdData.St_Name];
			studentDto.stDept = student[StdData.St_Dept];
			studentDto.stGrade = Integer.valueOf(student[StdData.St_Grade]);
			studentDto.stTel = student[StdData.St_Tel];
			studentDto.stAdd = student[StdData.St_Add];

			stdList.add(studentDto);
			
			System.out.println(studentDto);
		}
	}
}
