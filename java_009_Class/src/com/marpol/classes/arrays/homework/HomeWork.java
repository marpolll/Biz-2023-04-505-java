package com.marpol.classes.arrays.homework;

import com.marpol.classes.model.ScoreDto;
import com.marpol.classes.service.ScoreServiceA;

public class HomeWork {

	public static void main(String[] args) {
		ScoreDto[] score = new ScoreDto[10];

		for (int index = 0; index < score.length; index++) {
			score[index] = new ScoreDto();
		}
		ScoreServiceA scoreService = new ScoreServiceA();

		score[0].stNum = "0001";
		score[0].stName = "홍길동";
		score[0].scKor = scoreService.getScore();
		score[0].scEng = scoreService.getScore();
		score[0].scMath = scoreService.getScore();

		score[1].stNum = "0002";
		score[1].stName = "이나라";
		score[1].scKor = scoreService.getScore();
		score[1].scEng = scoreService.getScore();
		score[1].scMath = scoreService.getScore();

		score[2].stNum = "0003";
		score[2].stName = "김길동";
		score[2].scKor = scoreService.getScore();
		score[2].scEng = scoreService.getScore();
		score[2].scMath = scoreService.getScore();

		score[3].stNum = "0004";
		score[3].stName = "홍자반";
		score[3].scKor = scoreService.getScore();
		score[3].scEng = scoreService.getScore();
		score[3].scMath = scoreService.getScore();

		score[4].stNum = "0005";
		score[4].stName = "박상욱";
		score[4].scKor = scoreService.getScore();
		score[4].scEng = scoreService.getScore();
		score[4].scMath = scoreService.getScore();

		score[5].stNum = "0006";
		score[5].stName = "표상효";
		score[5].scKor = scoreService.getScore();
		score[5].scEng = scoreService.getScore();
		score[5].scMath = scoreService.getScore();

		score[6].stNum = "0007";
		score[6].stName = "김서영";
		score[6].scKor = scoreService.getScore();
		score[6].scEng = scoreService.getScore();
		score[6].scMath = scoreService.getScore();

		score[7].stNum = "0008";
		score[7].stName = "정홍기";
		score[7].scKor = scoreService.getScore();
		score[7].scEng = scoreService.getScore();
		score[7].scMath = scoreService.getScore();

		score[8].stNum = "0009";
		score[8].stName = "김사랑";
		score[8].scKor = scoreService.getScore();
		score[8].scEng = scoreService.getScore();
		score[8].scMath = scoreService.getScore();

		score[9].stNum = "0010";
		score[9].stName = "백훈진";
		score[9].scKor = scoreService.getScore();
		score[9].scEng = scoreService.getScore();
		score[9].scMath = scoreService.getScore();

		System.out.println("=".repeat(60));
		System.out.println("학번 \t이름 \t국어 \t영어 \t수학 \t총점 \t평균");
		System.out.println("=".repeat(60));
		
		scoreService.scorePrint(score[0]);
		scoreService.scorePrint(score[1]);
		scoreService.scorePrint(score[2]);
		scoreService.scorePrint(score[3]);
		scoreService.scorePrint(score[4]);
		scoreService.scorePrint(score[5]);
		scoreService.scorePrint(score[6]);
		scoreService.scorePrint(score[7]);
		scoreService.scorePrint(score[8]);
		scoreService.scorePrint(score[9]);
		
		System.out.println("=".repeat(60));
		
		int korTotal = score[1].scKor;
		korTotal += score[2].scKor;
		korTotal += score[3].scKor;
		korTotal += score[4].scKor;
		korTotal += score[5].scKor;
		korTotal += score[6].scKor;
		korTotal += score[7].scKor;
		korTotal += score[8].scKor;
		korTotal += score[9].scKor;
		
		int engTotal = score[1].scEng;
		engTotal += score[2].scEng;
		engTotal += score[3].scEng;
		engTotal += score[4].scEng;
		engTotal += score[5].scEng;
		engTotal += score[6].scEng;
		engTotal += score[7].scEng;
		engTotal += score[8].scEng;
		engTotal += score[9].scEng;
		
		int mathTotal = score[1].scMath;
		mathTotal += score[2].scMath;
		mathTotal += score[3].scMath;
		mathTotal += score[4].scMath;
		mathTotal += score[5].scMath;
		mathTotal += score[6].scMath;
		mathTotal += score[7].scMath;
		mathTotal += score[8].scMath;
		mathTotal += score[9].scMath;
		
		scoreService.scoreTotalPrint(korTotal, engTotal, mathTotal);
		
		
		
	}
}