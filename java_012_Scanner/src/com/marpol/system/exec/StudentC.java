package com.marpol.system.exec;

import com.marpol.scanner.service.StudentServiceV1;

public class StudentC {
	
	public static void main(String[] args) {
		
		StudentServiceV1 stService = new StudentServiceV1();
		
		stService.inputStudent();
	}


}
