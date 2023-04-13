package com.callor.hello.algebra;

public class BooleanC {

	public static void main(String[] args) {
		// /나누기(몫), %나누기(나머지) 아래식은 나머지가
		// 1 이여서 false
		System.out.println(33 % 2 == 0);
		// ? 상항연산자
		// ? 왼쪽의 연산 결과가 true 이면 "응"을 출력하고
		//                      false 이면 "아니"를 출력
		// 아래식은 당연히 "아니" 출력
		// ?는 정말 물어보는거 A의(33%2) 결과0(B)가 맞냐??
		// ? 는 무조건 다음에 : 가 와야한다.
		// 앞이 true : 뒤가 false
		// ? 다음 식에 따라 출력은 달라진다.
		System.out.println(33 % 2 == 0 ? "응" : "아니");
		System.out.println(33 % 2 == 0 ? 33 / 2 : 33 * 2);
		System.out.println(33 % 2 ==0 ? "짝수" : "홀수");
		
		// 연산식은 결과를 알수 있는 명령문
		// 연산식의 결과는 메모리에 저장된다,결과가 메모리에 저장되는거는 연산식
		
	}

}
