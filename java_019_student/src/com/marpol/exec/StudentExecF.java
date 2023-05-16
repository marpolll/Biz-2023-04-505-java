package com.marpol.exec;

import com.marpol.service.StudentService;
import com.marpol.service.impl.StudentServiceImplV2;

public class StudentExecF {

	public static void main(String[] args) {
		
		StudentService st = new StudentServiceImplV2();
		
		st.loadStudent();
		st.printStudent();
		st.insertStudent();
		
	}
}
