package com.marpol.classes.exec;

import com.marpol.classes.model.ScoreDto_EcecBC_ServiceB;

public class ExecC {
	
	public static void main(String[] args) {
		ScoreDto_EcecBC_ServiceB 홍길동 = new ScoreDto_EcecBC_ServiceB();
		ScoreDto_EcecBC_ServiceB 이몽룡 = new ScoreDto_EcecBC_ServiceB();
		ScoreDto_EcecBC_ServiceB 성춘향 = new ScoreDto_EcecBC_ServiceB();
		
		홍길동.stName ="홍길동";
		홍길동.intKor = 100;
		
		이몽룡.stName = "이몽룡";
		이몽룡.intKor = 88;
		이몽룡.intEng = 32;
		이몽룡.intMath = 59;
		이몽룡.intMuc = 77;
		이몽룡.intSpo = 81;
		이몽룡.intHis = 98;
		이몽룡.intArt = 99;
		
		성춘향.stName = "성춘향";
		성춘향.intKor = 99;
		성춘향.intEng = 97;
		성춘향.intMath = 89;
		성춘향.intMuc = 70;
		성춘향.intSpo = 85;
		성춘향.intHis = 94;
		성춘향.intArt = 92;
		
		System.out.println("성춘향 국어점수 : " + 성춘향.intKor);
		System.out.println("성춘향 총점 : " + 성춘향.getTotal());
		System.out.println();
		System.out.println("홍길동 국어점수 : " + 홍길동.intKor);
		System.out.println();
		System.out.println("이몽룡 국어점수 : " + 이몽룡.intKor);
		System.out.println("이몽룡 총점 : " + 이몽룡.getTotal());
	}
}
