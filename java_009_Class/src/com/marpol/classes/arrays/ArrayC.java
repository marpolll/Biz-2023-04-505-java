package com.marpol.classes.arrays;

import com.marpol.classes.model.ScoreDto;
import com.marpol.classes.service.ScoreServiceA;

public class ArrayC {
	
	public static void main(String[] args) {
		
		// 3명의 학생의 성적정보를 저장할 객체변수 생성
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();
		
		// ScoreServiceA 클래스에 선언된 method 를 사용하기 위해
		// 객체변수 생성
		ScoreServiceA scoreService = new ScoreServiceA();
		
		// 학생의 학번, 이름, 과목점수 세팅
		홍길동.stName ="홍길동";
		홍길동.stNum ="0001";
		홍길동.scKor = scoreService.getScore();
		홍길동.scEng = scoreService.getScore();
		홍길동.scMath = scoreService.getScore();
		
		이몽룡.stName ="이몽룡";
		이몽룡.stNum ="0002";
		이몽룡.scKor = scoreService.getScore();
		이몽룡.scEng = scoreService.getScore();
		이몽룡.scMath = scoreService.getScore();
		
		성춘향.stName ="성춘향";
		성춘향.stNum ="0003";
		성춘향.scKor = scoreService.getScore();
		성춘향.scEng = scoreService.getScore();
		성춘향.scMath =scoreService.getScore();
		
		// 성적표 title 출력
		System.out.println("=".repeat(70));
		System.out.println("학번 \t이름 \t국어 \t영어 \t수학 \t총점 \t평균");
		System.out.println("=".repeat(70));
		
		// 각 학생 정보 출력
		scoreService.scorePrint(홍길동);
		scoreService.scorePrint(이몽룡);
		scoreService.scorePrint(성춘향);
	}

}
