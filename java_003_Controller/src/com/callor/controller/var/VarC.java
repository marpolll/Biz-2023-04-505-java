package com.callor.controller.var;

public class VarC {
	
	public static void main(String[] args) {
		// 문자열 변수 선언 
		// 첫번째 S 대문자라서 클래스 
		// 그이유는 다른거와 다르게 나중에 만들어졌다
		// int intdex = 0; 정수를 선언하는것 처럼 
		// String str = ""; 선언하고 만들고 아무것도 없는상태
		String str = "ABC";
		System.out.println(str);
		// 클래스는 저장되는게 값(ABC)이(가) 저장되는게 아닌
		// 주소가 저장된다 100 주소에 있는 ABC
		str = "Korea"; // 보통은 100주소에 있는 ABC를 버리고 Korea 가 들어가야하나
					   // 문자열은 그렇게 하기 복잡하여
					   // 새로운 200주소에 Korea를 담는다
		               // 그리고 100주소에 있는 ABC는 java 가비지컬랙션 GC 에서 알아서 버려준다
		str = "대한민국";
		str = "우리나라";
		// 3개의 문자열을 연결하여 str 변수에 저장
		str = "Republic" + "of" + "Korea";
		System.out.println(str);
		
		
		
	}

}
