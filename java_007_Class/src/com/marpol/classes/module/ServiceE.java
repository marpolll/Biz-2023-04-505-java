package com.marpol.classes.module;

public class ServiceE {

	public void score(int intKor, int intEng, int intMath) {
		int total = intKor + intEng + intMath;
		float avg = (float) total / 3;

		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------");
		System.out.printf("%d\t %d\t %d\t %d\t %2.5f\n", intKor, intEng, intMath, total, avg);
	}
}
