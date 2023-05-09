package com.marpol.classes.exec;

import com.marpol.classes.models.StdData;

public class StudentB {
	
	public static void main(String[] args) {
		
		for(int index = 0 ; index < StdData.student.length; index++) {
			String[] student = StdData.student[index].split(",");
			
			System.out.print(student[StdData.St_Num] + "\t");
			System.out.print(student[StdData.St_Name] + "\t");
			System.out.print(student[StdData.St_Dept] + "\t");
			System.out.print(student[StdData.St_Grade] + "\t");
			System.out.print(student[StdData.St_Prof] + "\t");
			System.out.print(student[StdData.St_Tel] + "\t");
			System.out.print(student[StdData.St_Add] + "\n");
			
		}
	}

}
