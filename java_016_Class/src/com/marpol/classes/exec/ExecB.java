package com.marpol.classes.exec;

import com.marpol.classes.models.StudentDto;

public class ExecB {
	
	public static void main(String[] args) {
		
		// StudentDto 클래스를 사용하여 stDto 객체변수 생성하기
		StudentDto stDto = new StudentDto();
		
		// stDto 객체에 Dot(.) 연산자를 사용하여 stNum 변수에 접근하여
		// 0001 이라는 문자열 `저장하기`
		stDto.stNum = "0001";

		// stDto 객체에 dot(.) 연산자를 사용하여 stNum 변수에 접근하여
		// "값을 읽고" stNum 변수에 "값을 복사"
		String stNum = stDto.stNum;
		// stDto 객체에 dot(.) 연산자를 사용하여 stNum 변수에 접근하여
		// "값을 읽고" Console 에 출력하기
		System.out.println(stDto.stNum);
		
		// StudentDto 클래스를 사용하여 생성한 홍,이,성, 객체변수는
		// 서로간에 데이터 간섭이 없는 완전 독립된 변수이다.
		StudentDto 홍길동 = new StudentDto();
		홍길동.stName = "홍길동";
		
		StudentDto 이몽룡 = new StudentDto();
		StudentDto 성춘향 = new StudentDto();
		
	}

}
