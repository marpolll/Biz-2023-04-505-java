package com.marpol.classes.module;

public class ServiceA {
	public void score(int intKor, int intEng,int intMath , int intHis, int intMuc, int intArt, int intSpo) {
		
		int total = intKor + intEng + intMath + intHis + intMuc + intArt + intSpo ;
		float avg = (float) total / 7 ;
		
		System.out.println("국어\t영어\t수학\t국사\t음악\t미술\t체육\t총점\t평균\n");
		System.out.println("----------------------------------------------------------------------\n");
		System.out.printf("%d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t %.5f\t", intKor,intEng,intMath,intHis,intMuc,intArt,intSpo,total,avg);  


	}

}
