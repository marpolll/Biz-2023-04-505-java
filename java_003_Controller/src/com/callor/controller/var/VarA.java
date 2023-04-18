package com.callor.controller.var;

public class VarA {

	public static void main(String[] args) {

		int intKor = 70;
		int intEng = 65;
		int intMath = 80;

		int intTotal = intKor + intEng + intMath;
		// int intTotal = intKor;
		// intTotal += intEng;
		// intTotal += intMath;
		// 이렇게 할수도 있다.

		int intAvg = intTotal / 3;

		System.out.println("=====================");
		System.out.printf("국어 : %3d\n", intKor);      //%3d 는 3번째 거리 생김
		System.out.printf("영어 : %3d\n", intEng);
		System.out.printf("수학 : %3d\n", intMath);
		System.out.println("=====================");
		System.out.printf("총점 : %d 평균 : %d\n", intTotal, intAvg);
		
		intTotal = intKor;
		intTotal += intEng;
		intTotal += intMath;
		
		// 위 식은 정수여서 소수가 짤린다.
		// 그래서 아래와 같이 강제로 실수로 변경하여 소수 까지 표시
		// int는 정수 float는 실수여서 실수로 선언 한다.
		float floAvg = (float)intTotal /3f; //꼭 뒤에 숫자에 f 넣기
		
		System.out.println("=====================");
		System.out.printf("국어 : %3d\n", intKor);
		System.out.printf("영어 : %3d\n", intEng);
		System.out.printf("수학 : %3d\n", intMath);
		System.out.println("=====================");
		System.out.printf("총점 : %d 평균 : %5.2f\n", intTotal, floAvg); //뒤에 %d(정수) 를 %f(실수) 로변경 
		                                 // %5.2f 5번째 자리에서 입력 하고  
										 //	     .2 소수점 2자리까지 표시 3자리에서 반올림
	}

}
