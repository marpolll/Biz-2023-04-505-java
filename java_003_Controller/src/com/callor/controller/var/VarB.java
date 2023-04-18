package com.callor.controller.var;

public class VarB {
	
	public static void main(String[] args) {
		// 문자형(character type) 변수
		// 문자형 변수는 영문자, 숫자(문자화된), 한글 한글자만 저장할수 있는
		// 조금 독특한 변수
		char cVar = 'A';
		System.out.println(cVar);
		System.out.println(cVar + 0);
		// 아스키 코드 ascii 코드
		
		for(char c = 'A' ; c <= 'Z' + 1 ; c++) {
			System.out.print(c);  // c + 0 하면 아스키 코드 코드번호가 나온다 아스키 순서대로
			System.out.print("\t");
		}
	}

}
