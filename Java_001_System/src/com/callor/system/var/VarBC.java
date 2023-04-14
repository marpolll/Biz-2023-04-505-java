package com.callor.system.var;

public class VarBC {
	
	public static void main(String[] args) {
		int intNum1 = 0;
		int intNum2 = 0;
		
		intNum1 = 30;
		intNum2 = 40;
		// 두 변수에 저장된 값의 크기를 비교하는 연산
		System.out.println(intNum1 > intNum2);
		System.out.println(intNum1 < intNum2);
		System.out.println(intNum1 == intNum2);
		
		System.out.println(intNum1 >= intNum2);
		System.out.println(intNum1 <= intNum2);
		System.out.println(intNum1 != intNum2);
		
		// 각 변수에 저장된 값이 짝수이냐?
		System.out.println(intNum1 % 2 == 0);
		System.out.println(intNum2 % 2 == 0);
		
		// 두 변수에 저장된 값이 모두 짝수인가?  and
		System.out.println(intNum1 % 2 == 0 && intNum2 % 2 == 0);
		
		// 두 변수에 저장된 값중에 한개라도 짝수인가? or
		System.out.println(intNum1 % 2 == 0 || intNum2 % 2 == 0);
		
		// 부울대수 연산을 통하여 결과를 만든 코드
		
		/*
		 *  Y1   Y2   +   *
		 *  0    0    0   0            0 = 짝수
		 *  0    1    1   0            1 = 홀수
		 *  1    0    1   0
		 *  1    1    2   1
		 */ 
		 
		int intYes1 = intNum1 % 2;
		int intYes2 = intNum2 % 2;
		
		System.out.println(intYes1 * intYes2 > 0);
		System.out.println(intYes1 + intYes2 > 0);
		
	}

}
