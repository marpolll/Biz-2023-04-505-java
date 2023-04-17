package com.callor.var.controller;

public class ContorlA {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 43;
		
		boolean bEven1 = num1 % 2 == 0;
		boolean bEven2 = num2 % 2 == 0;

		/*
		 * if(조건 연산식) {   }
		 * 만약 "조건 연산식"의 결과가 true 이면
		 * {  } block 내부의 코드를 실행하라
		 * 
		 * if(boolean type 변수) {   }
		 * 만약 "boolean type 변수" 값이 true 이면
		 * {   } block 내부의 코드를 실행하라
		 * 
		 */

		// bEven1 변수의 값이 true 이면?
		if(bEven1) {
			System.out.println(num1 + "은(는) 짝수야!!!!");
		}
		
		// bEven2 변수의 값이 true 이면? 
		// true 가 아니면(false) 출력이 안된다 
		if(bEven2) {
			System.out.println(num2 + "은(는) 짝수야!!!!");
		}
		
		// bEven2 값이 ture 가 아니면?(false)
		if(!bEven2) {
			System.out.println(num2 + "은(는) 짝수가 아니야!!!");
		}
		
		// bEven2 값이 ture 가 아니면?(false) 
		// true 가 맞으면 출력이 안된다.
		if(!bEven1) {
			System.out.println(num1 + "은(는) 짝수가 아니야!!!");
		}
		
		/*
		 * Control keyword
		 * 어떤 조건에 따라 코드 실행 순서를 변경하는 명령문
		 * if() 명령문은 () 의 조건이 true, false 에 따라 
		 * 코드의 실행 순서를 변경한다
		 * 
		 * if() 명령문에서 
		 *   () 조건이 true 일때는 ~~ 한다. 라고 표현
		 *   () 조건이 !true 일때는 ~~~가 아니다. 라고 읽는다
		 *             !=not
		 *   () 조건이 false 일떄는 ~~~가 아니다. 라고 읽는다
		 *   
		 */
		
	}

}
