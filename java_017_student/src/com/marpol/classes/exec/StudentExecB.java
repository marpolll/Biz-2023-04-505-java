package com.marpol.classes.exec;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StudentExecB {

	public static void main(String[] args) {
		
		String studentFile = "src/com/marpol/classes/datas/student.csv";
		String saveFile = "src/com/marpol/classes/datas/student-save.csv";
		
		// 객체를 선언만 할때, null 값을 저장하여 초기화를 하면
		// 객체떄문에 발생하는 메모리 관련 문제를 조금 줄일 수 있다.
		Scanner filescan = null;
		
		// InputStream is = new FileInputStream(studentFile); try 안으로 들어가면 밖에서 사용 못하니 따로 선언 초기화 하자
		/*
		 * InputStream 도구
		 * 컴퓨터의 외부(네트워크, 파일 등) 로 부터 데이터를 메모리로 load 하는데
		 * 사용하는 도구들의 부모
		 */
		InputStream is = null;
		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		filescan = new Scanner(is); // system.in
		String line = filescan.nextLine();
		
		System.out.println(line);
		for (int i = 0 ; i < 10-1 ; i++) {
			System.out.println(filescan.nextLine());
		}
		
	}
}

















