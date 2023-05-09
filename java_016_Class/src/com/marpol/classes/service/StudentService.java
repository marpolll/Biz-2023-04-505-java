package com.marpol.classes.service;

import com.marpol.classes.models.StudentDto;

public interface StudentService {
	
	public void loaadStudent();
	public void printStudent();

	// 학번울 매개변수로 전달받아서
	// stList 에서 학번이 일치하는 학생정보를 찾아서 return
	public StudentDto getStudent(String stNum);
		
}
