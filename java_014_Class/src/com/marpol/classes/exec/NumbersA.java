package com.marpol.classes.exec;

public class NumbersA {
	
	public static void main(String[] args) {
		// 기본자료형(primitive type) 변수 생성 키워드
		// 값을 저장하는 용도만 사용하는 키워드
		int num1 = 0;
		float num2 = 0.0f;
		long num3 = 0l;
		double num4 = 0.0;
		boolean bYes = true;
		char cVar = 'A';
		
		// 참조자료형(class type) 변수 생성 키워드
		// 기본자료형 변수에 특별한 기능을 부가하여 
		// 여러용도로 사용하기 위한 키워드
		// 기본변수와 성질이 유사한 클래스들
		// wrapper(랩퍼,감싸다) class
		// 기본 변수 성질을 가지면서, 확장된 기능을 갖도록 하는 클래스
		Integer intnum1 = 0;
		Float floatnum2 = 0.0f;
		Long longnum3 = 0l;
		Double dounum4 = 0.0;
		Boolean bYes1 = true;
		String str = "Republic Of Korea";
		Character cVar1 = 'A';
		
		// 기본적으로 데이터를 저장하는 변수의 성질을 갖는다.
		// int 형 정수와 integer 형 정수는 기본 정수값을 저장하는
		// 변수의 성질을 갖는다.
		num1 = intnum1;  // integer type 의 데이터를 int type 의 변수에 저장  unboxing 언박싱
		intnum1 = num1;  // int type 의 데이터를 integer type 의 변수에 저장  boxing 박싱
		
		/*
		 * primitive(기본형) 변수에 저장된 데이터를
		 * wrapper(참조형) 변수에 저장하는 순간 확장된 기능을 사용할수있다.
		 * 기본형 변수에 저장된 데이터를 참조형 변수에 저장하는 것
		 * box 에 기본형 변수를 담는 것과 유사해서 boxing 이라고 한다.
		 * 
		 * wrapper 클래스에 저장된 데이터를 기본형 변수에 저장하는 것을
		 * unboxing(박스해체) 이라고 한다.
		 */
		
		
		
	}

}
