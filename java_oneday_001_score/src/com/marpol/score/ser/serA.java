package com.marpol.score.ser;

import com.marpol.score.model.DtoA;

public class serA {
	DtoA score = new DtoA();
	
	public int getScore() {
		int score = (int) (Math.random() * 50) + 51;
		return score;
	}

	public static void printScore(DtoA score) { 
		System.out.printf("%5s\t ",score.stNum);
		System.out.printf("%3d\t ",score.scKor);
		System.out.printf("%3d\t ",score.scEng);
		System.out.printf("%3d\t ",score.scMath);
		System.out.printf("%3d\t ",score.scMusic);
		System.out.printf("%3d\t ",score.scArt);
		System.out.printf("%3d\t ",score.getTotal());
		System.out.printf("%5.2f\t ",score.getAvg());
		System.out.println();
	}
	
	public static void TotalScore(DtoA[] score) { 
		DtoA total = new DtoA();
		for(int i = 0; i< score.length; i++) {
			total.scKor   += score[i].scKor;
			total.scEng   += score[i].scEng;
			total.scMath  += score[i].scMath;
			total.scMusic += score[i].scMusic;
			total.scArt   += score[i].scArt;
		}

		System.out.printf("총점\t ");
		System.out.printf("%3d\t ",total.scKor);
		System.out.printf("%3d\t ",total.scEng);
		System.out.printf("%3d\t ",total.scMath);
		System.out.printf("%3d\t ",total.scMusic);
		System.out.printf("%3d\t ",total.scArt);
		System.out.printf("%3d\t ",total.getTotal());
		System.out.printf("\t ");
		System.out.println();
	}
	public static void TotalAvg(DtoA[] score) { 
		DtoA total = new DtoA();
		for(int i = 0; i< score.length; i++) {
			total.scKor   += score[i].scKor;
			total.scEng   += score[i].scEng;
			total.scMath  += score[i].scMath;
			total.scMusic += score[i].scMusic;
			total.scArt   += score[i].scArt;
		}

		float avg = 0;
		avg += (float)total.scKor/score.length;
		avg += (float)total.scEng/score.length;
		avg += (float)total.scMath/score.length;
		avg += (float)total.scMusic/score.length;
		avg += (float)total.scArt/score.length;
		
		System.out.printf("평균\t ");
		System.out.printf("%5.2f\t ",(float)total.scKor/score.length);
		System.out.printf("%5.2f\t ",(float)total.scEng/score.length);
		System.out.printf("%5.2f\t ",(float)total.scMath/score.length);
		System.out.printf("%5.2f\t ",(float)total.scMusic/score.length);
		System.out.printf("%5.2f\t ",(float)total.scArt/score.length);
		System.out.printf("\t ");
		System.out.printf("%5.2f\t ",avg/5f);
		System.out.println();
	}
}