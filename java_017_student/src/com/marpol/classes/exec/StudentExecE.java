package com.marpol.classes.exec;

import com.marpol.classes.service.StudentService;
import com.marpol.classes.service.impl.StudentServiceImplV3;


public class StudentExecE {

	public static void main(String[] args) {
		
		StudentService scService = new StudentServiceImplV3();
		
		scService.loadStudent();
		scService.printStudent();
	
		
	}
}

















