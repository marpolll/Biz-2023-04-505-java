package com.callor.system.var;

public class VarAC {
	public static void main(String[] args) {
		// int 는 = 이후 (0) 를 무시한다. int num1 = 0;
		// int num1;       (= 0;) 없어도 된다
		// int num1; 나는 정수형 변수만 선언(예약)한다.
		// int num1 = 0.0; 이라는 식은 오류가 난다 실수형 변수여서
		/*
		 * 정수형 변수 num1 을 선언(예약)만 해라 (값을 읽을수 없다)
		 * 예약만 한 변수는 쓰기(write, 할당, 저장, 대입) 전용이다
		 * System.out.println(num1); 하면 오류난다 num1 = 0; 라도
		 * 써서 오류 막을수 있지만 별로 안좋다
		 * 그래서 아래 num2 방식으로 한다
		 */
		int num1;
		num1 = 0;
		System.out.println(num1);
		num1 = 100;
		num1 = 200;
		num1 = 0;
		
		/*
		 * 정수형 변수 num2 를 선언하고,
		 * 0으로 초기화 하여라
		 */
		
		int num2 = 0;
		num2 = 100;
		System.out.println(num2);
		
		// 변수는 사용전에 반드시 선언(과 초기화)를
		// 수행해야 한다.
		// 			변수에서 값 할당, 저장, 대입하기
		//			변수에서 값 읽어 오기
		int num3 = 0;
		num3 = 100;
		System.out.println(num3);
	}

}
