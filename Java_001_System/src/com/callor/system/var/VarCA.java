package com.callor.system.var;

public class VarCA {
	
	public static void main(String[] args) {
		
		boolean byes = true;
		int intNum1 = 30;
		int intYes1 = 0;
		
		/*
		 * = 오른쪽의 연산식 결과에 따라서
		 * 왼쪽의 변수를 맞는 타입으로 지정해야 한다
		 * 왼쪽의 변수 타입은 미리 지정되어 있고
		 * 지정된 타입에 맞는 결과를 저장해야 한다
		 * 
		 *  intNum1 % 2 의 연산 최종 결과가 정수 0 또는 1 이므로
		 *  그 결과는 정수형으로 미리 선언된 intYes1에만
		 *  저장할수 있다
		 *  
		 *  ~~~ == 0 의 연산 최종결과는 boolean type 의
		 *  true, false 이므로
		 *  그 결과는 미리 선언된 bYes 에만
		 *  저장할수 있다
		 */
		
		// 명시적 언어 
		// 타입에 따라 결과가 다르다
		intYes1 = intNum1 % 2;    // intNum1를 모른다는 가정에 0이나1 이라는 정수(int intYes1) 타입 결과
		byes = intNum1 % 2 == 0;  // intNum1를 true 나 false 라는 블린(boolean byes) 타입 결과
		// 답은 각각 0 과 true
		
	}

}
