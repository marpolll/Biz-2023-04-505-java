package com.callor.var;

public class VarD {

	public static void main(String[] args) {
		// 변수에 할당할 값이 정해진 경우
		// 0 이 아닌 값으로 초기화를 하는 것이 좋다
		int num1 = 30;
		int num2 = 40;
		
		int sum1 = 0;
		// int sum1 = num1 + num2; 위에서 int sum1 = 0 ;
		// 으로 선언을 이미 해서 또다시 선언 하면 오류발생
		// 그래서 아래와 같이 선언 안하고 대입(할당, 저장) 해야한다.
		sum1 = num1 + num2;
		
	}
}
