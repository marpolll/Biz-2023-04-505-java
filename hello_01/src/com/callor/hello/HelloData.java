package com.callor.hello;

public class HelloData {

	public static void main(String[] args) {
		System.out.println("Hello Korea");
		System.out.println("Hello" + "Korea");
		System.out.println("Hello       Korea");
		System.out.println("Hello"    +    "Korea");
		
		System.out.println(30 + 40);
		System.out.println("30" + "40");
		System.out.println("30 + 40");
		
		// 30 + 40 = 70 하고싶다면
		System.out.println("30 + 40 = 70"); //의미 없다 계산이 아닌 적혀있는 수로 콘솔에 나옴
		System.out.println("30 + 40 = " + 30 + 40); //뒤에 숫자도 문자열로 적용 시켜버림
		
		// "30 + 40" + 30 을 연산하려고 시도
		// 이 연산은 문자열 + 숫자 의 연산이다
		// 이럴때는 숫자 데이터인 30을 문자열 30으로
		// 바꿔 버린다 그래서
		System.out.println("30 + 40 = " + "30" + 40);
		System.out.println("30 + 40 =  + 30" + 40);
		System.out.println("30 + 40 = " + "30" + "40");
		// 괄호를 통하여 숫자를 먼저 계산 하면 된다.
		System.out.println("30 + 40 = " + (30 + 40));
		System.out.println(30 + 40 + " = 30 + 40 ");
		// 곱하기는 상관이 없다 () 안에 처럼 먼저 계산 되므로
		System.out.println("30 x 40 = " + 30 * 40);
		
		// 문자열에서는 +은 우리가 아는 더하기 가 아닌 연결이다 고로 아래 식은 성립이 안된다 오류됨
		// System.out.println("30 - 40 = " + 30 - 40);
		// System.out.println("30" - "40");
		// System.out.println("30" * "40");
		// System.out.println("30" / "40");
		
		// 아래는 그냥 30 과 40 을 +(연결) +(더하기) 아님 30 + 40 = 70 XX 
		System.out.println("30" + "40");
		
		
		
	}

}
