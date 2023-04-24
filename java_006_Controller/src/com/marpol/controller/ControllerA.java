package com.marpol.controller;

public class ControllerA {
	/*
	 * java.exe 도구가 ContorollerA.class 파일을 읽어서 메모리에 load하고 제일먼저 호출하는 method() 시작점
	 * method, 진입점 method
	 */
	public static void main(String[] args) {
		
		// return type 이 void 이므ㅏ로 단독으로만
		// 호출하여 명령을 실행할수 있다.
		prime();

		// prime() method 는 return type 이 void 이기 때문에
		// 다른 명령문에 포함되거나
		// if(prime()) {  } 
		
		// 변수의 값을 생성할수 없다
		// boolean yesPrime = prime();
		
		// 변수에 대입하는 값도 생성할수 없다
		// boolean yesprime = 0;
//		if(prime()) {
	} // end main

	/*
	 * 매개변수도 없고 , return type 이 void(없다라고 표현)인 prime() method 선언
	 */

	public static void prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		int index = 0;
		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				break;
			}
		}
		if (index >= rndNum) {
			System.out.println(rndNum + " 는 소수");
		} else {
			System.out.println(rndNum + " 는 소수아님");
		}
	}
}
