package com.marpol.system.exec;

import com.marpol.scanner.models.StudentDto;

public class StudentA {
	
	public static void main(String[] args) {
		StudentDto 홍길동 = new StudentDto();
		// StudentDto 클래스의 속성의 접근 제한자를 모두 private로 하여
		// 각 속성에 접근할수 없게 되었다.

//		홍길동.stNum = "0001"; //홍길동 객체의 stNum 속성에 값 저장
//		System.out.println(홍길동.stNum); // 홍길동 객체의 stNum 속성 값 읽기
//		
//		홍길동 객체의 stNum 속성값을 읽어서 stNum 변수에 복사하기
//		String stNum = 홍길동.stNum;
	}

}
