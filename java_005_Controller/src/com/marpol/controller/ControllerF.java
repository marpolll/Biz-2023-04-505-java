package com.marpol.controller;

public class ControllerF {
	
	/*
	 * prime() method 의 코드를 수정하여
	 * 생성된 랜덤수가 소수인지 아닌지 판별하는 코드로 변경
	 * 
	 * void type 의 prime() method 를
	 * boolean type 의 prime() method 로 변경
	 * 
	 * method 를 선언할때 void type 이외의 type 으로 선언하면
	 * method {  } 내에서 반드시 return 명령문이 있어야 한다.
	 * 
	 */
	
	public static boolean prime() {                  // void   >>> boolean type의 prime method                 
		int rndNum = (int) (Math.random() * 50) + 51;
		int index;
		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
//				break;
				return false; //false 일때 종료 , 좋은 코드는 아니다.
			}
		}
//		if (rndNum <= index) {
//			System.out.println(rndNum + " 는 소수");
//		}else {
//			System.err.println(rndNum + " 는 소수아님");
//		}
//		 reyurn; 생략가능
		
		boolean yesPrime = rndNum <= index;
		
		return yesPrime; // 위에 public static boolean prime() 이면 return 명령 이 필수 void 에서만 생략 이외는 무조건 포함
	}

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {
			if(prime()) {
				System.out.println("소수");
			}else {
				System.err.println("소수아님");
			}
		}
	}
}
