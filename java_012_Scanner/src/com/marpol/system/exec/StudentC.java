package com.marpol.system.exec;

import com.marpol.scanner.service.StudentServiceV1;

public class StudentC {
	
	public static void main(String[] args) {
		
		StudentServiceV1 student = new StudentServiceV1();
		
		student.inputStudent();
	}


}
