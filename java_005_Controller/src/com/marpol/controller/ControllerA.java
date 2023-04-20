package com.marpol.controller;

public class ControllerA {

	public static void main(String[] args) {
		/*
		 * 큰 실수형(double) douNum 변수를 선언하고
		 * Math.random() 가 만들어준 값으로 초기화 한다. ( 0 이 들어가면 0으로 초기화 한거)
		 */
		double douNum = Math.random();
		// douNum = douNum * 50;
		douNum *= 50;
		/*
		 * 정수형 intNum 변수를 선언하고
		 * douNum 변수의 값을 정수형으로 변환 한 후
		 * 결과 값으로 intNum 변수를 초기화 하였다
		 */
		int intNum = (int) douNum;
		intNum += 51;
		
		/*
		 * int type(정수형) rndNum 변수를 선언하고
		 * 51 ~ 100 까지 임의로 생성된 랜덤수로
		 * radNum 변수를 초기화 하였다.
		 */
		
		int rndNum = (int) (Math.random() * 50) + 51; // 위 코드를 한번에 풀어쓴거                         
												      // 변수의 초기화 코드
		// ranNUm 변수에 저장된 값을 읽어서
		// Console 에 출력하라
		System.out.println(rndNum);
	}

}
