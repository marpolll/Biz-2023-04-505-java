package com.marpol.system.exec;

import com.marpol.scanner.service.StudentServiceV2;

public class StudentD {

	public static void main(String[] args) {

		StudentServiceV2 stService = new StudentServiceV2();
		stService.inputStudents();
		stService.printStudents();
	}
}
