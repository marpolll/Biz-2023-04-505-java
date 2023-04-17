package com.callor.var;

public class VarB {
	public static void main(String[] args) {
		
		int Num1 = 0;
		int Num2 = 0;
		
		Num1 = 30;
		Num2 = 40;
		
		// 변수에 어떤 값을 저장, 할당, 대입하려면
		// 반드시 먼저 선언되어야 한다
		
		// Sum1 선언 하고, 두 변수에 덧셈 결과 저장
		int Sum1 = 0;
		Sum1 = Num1 + Num2;
		
		// Sum2 선언과 동시에 두 변수의 덧셈 결과 저장
		int Sum2 = Num1 + Num2;
		
		Num1 = 30;
		Num2 = 40;
		
		Sum1 = Num1 + Num2;
		
	}

}
