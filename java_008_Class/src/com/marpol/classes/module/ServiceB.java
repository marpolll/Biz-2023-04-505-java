package com.marpol.classes.module;

import com.marpol.classes.model.ScoreDto_EcecBC_ServiceB;

public class ServiceB {
	
	public void score(ScoreDto_EcecBC_ServiceB score) {
		
		System.out.println("학번 : " + score.stNum);
		System.out.println("이름 : " + score.stName);
		System.out.println("국어 : " + score.intKor);
		System.out.println("영어 : " + score.intEng);
		System.out.println("수학 : " + score.intMath);
		System.out.println("국사 : " + score.intHis);
		System.out.println("음악 : " + score.intMuc);
		System.out.println("미술 : " + score.intArt);
		System.out.println("체육 : " + score.intSpo);
		
//		int intTotal = score.intKor;
//		intTotal += score.intEng;
//	    intTotal += score.intMath;
//	    intTotal += score.intHis;
//	    intTotal += score.intMuc;
//	    intTotal += score.intArt;
//	    intTotal += score.intSpo;
		
		int intTotal = score.getTotal();
//	    float floatAvg = (float)intTotal /7;
		float floatAvg = score.getAvg();

	    System.out.println("총점 : " + intTotal);
		System.out.println("평균 : " + floatAvg);
	}

}
