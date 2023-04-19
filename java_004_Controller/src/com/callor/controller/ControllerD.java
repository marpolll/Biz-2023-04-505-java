package com.callor.controller;

public class ControllerD {
	public static void main(String[] args) {

		/*
		 * 51 ~ 100 까지 범위의 랜덤수 100개 생성 
		 * 생성된 랜덤수 중에 짝수가 몇개인가 판별
		 * 합계, 평균도 구하자
		 */

		int iCount = 0;
		int iSum = 0;
		for (int i = 0; i < 100; i++) {
			int intS = (int) (Math.random() * 50) + 51;
			if (intS % 2 == 0) {
				iCount++;
				// 누적 : 숫자값을 계속 쌓아서 덧셈
				iSum += intS;
			}
		}
		int iAvg = iSum / iCount;
		System.out.printf("짝수의 개수 : %d \n", iCount);
		System.out.printf("짝수의 합계 : %d \n", iSum);
		System.out.printf("짝수의 평균 : %d \n", iAvg);
	}
}
// 이해하자이해하자!!!