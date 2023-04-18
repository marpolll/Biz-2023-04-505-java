package com.callor.controller.var;

public class VarD {
	
	public static void main(String[] args) {
		
		/*
		 * String 은 일반적인 변수를 생성하는 키워드가 아니다
		 * String 은 특이하게 class 이다.
		 * class 를 사용하여 만든 변수를 
		 *          인스턴스, object 라고 부른다.
		 *          num. 하면 노반응 하지만 str. 하면 목록이 나온다
		 *          이를 인스턴스, object 라 한다
		 */
		String str1 = "Republic";
		String str2 = "of";
		String str3 = "Korea";
		
		int num1 = 30;
		//num1. 반응xxx
		//str1. 반응ooo
		
		System.out.printf("%s %s %s\n", str1, str2, str3); // %s 는 문자열 폼 
													     //	%d는 정수?
		System.out.println(str1.toUpperCase()); // toUpperCase 대문자 변환
											    // String 이라는 태생(class)때문에 이런 도구가 생긴다 
		System.out.println(str1.toLowerCase()); // toLowerCase 소문자 변환
		
	}

}
