package com.callor.system.var;

public class VarBB {
	
	public static void main(String[] args) {
		
		int intNum1 = 0;
		float floatNum1 = 0.0f;
		
		intNum1 = 10;
		floatNum1 = intNum1 + 10; // 20.0f
		
		floatNum1 = floatNum1 + 1.2f; 
		System.out.println(floatNum1); // 21.2f
		
		floatNum1 = floatNum1 + 0.5f;
		System.out.println(floatNum1); // 21.7f
		
		// java는
		// float 를 int 로 강제형 변환 할때
		// 소수점 이하를 무조건 버린다.
		
		intNum1 = (int)floatNum1;
		System.out.println(intNum1); // 21 , 반올림이 안되고 0.7 이 짤려버린다
		                             // 22 값을 얻고 싶으면 코드를 바꿔야한다
									 // 반올림 되는 코드로
		
	}

}
