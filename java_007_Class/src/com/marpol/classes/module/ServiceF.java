package com.marpol.classes.module;

public class ServiceF {
	public void score(int intKor, int intEng, int intMath, int intHis, int intMuc, int intArt, int intSpo) {
		int total = intKor + intEng + intMath + intHis + intMuc + intArt + intSpo;
		float avg = (float) total / 7;

		System.out.println("총점\t평균");
		System.out.println("-------------");
		System.out.printf("%d\t %.5f\n", total, avg);

	}
}