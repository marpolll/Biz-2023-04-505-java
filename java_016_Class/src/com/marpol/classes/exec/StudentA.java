package com.marpol.classes.exec;

import com.marpol.classes.models.StdData;

public class StudentA {
	
	public static void main(String[] args) {
		
		System.out.println(StdData.student[0]);
		
		// 문자열 변수(문자열데이터).split("구분자");
		// 문자열 변수에 저장된 문자열을 "구분자"로 분해하여
		// 문자열 배열로 생성해주는 method
		String[] student = StdData.student[0].split(",");
		
		System.out.println("학번 : " + student[0]);
		System.out.println("이름 : " + student[1]);
		System.out.println("학과 : " + student[2]);
		System.out.println("학년 : " + student[3]);
		System.out.println("담임 : " + student[4]);
		System.out.println("전화 : " + student[5]);
		System.out.println("주소 : " + student[6]);
		
		
	}

}
