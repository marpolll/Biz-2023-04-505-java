package com.marpol.classes.exec;

import com.marpol.classes.service.StudentService;
import com.marpol.classes.service.impl.StudentServiceImplV4;

public class StudentExecD {

	public static void main(String[] args) {
		
		StudentService scService = new StudentServiceImplV4();
		
		scService.loadStudent();
		scService.printStudent();
	
		
	}
}

















