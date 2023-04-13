package com.callor.hello;
/*
 * 두개의 숫자 30과 40의 4칙연산을 수행하여
 * 결과를 Console 에 출력하시오
 */
public class NumberOp {
	public static void main(String[] args) {
		System.out.println(30 + 40);
		System.out.println(30 - 40);
		System.out.println(30 * 40);

		// 정수의 나눗셈은 몫을 구하는 연산
		System.out.println(30 / 40);
		// 정수의 나머지 연산
		System.out.println(30 % 40);
		
		// 실수와 실수를 나눗셈 연산
		// 연산결과도 실수로 나타난다
		System.out.println(30.0 / 40.0);
		// 소수점이하 17번째(16번째 자리까지 나타난다) 
		// 자리에서 버림현상이 나타난다
		System.out.println(4.0 / 3.0);
		System.out.println(4.0f / 3.0f);
		
		/*
		 * 코드에서 사용하는 숫자는
		 * 정수와 실수가 있고
		 * 큰 정수(Long)와 작은 정수(int, Integer)
		 * 배정도 실수(double), 단정도 실수(float) 가 있다
		 * f가 있으면 단정도(짧다) 없으면 배정도(길다)
		 */
		
		System.out.println(999_999_999);
		System.out.println(999_999_999_999_999_999L);
	}

}
