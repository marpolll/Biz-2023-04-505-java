package com.marpol.classes.arrays.homework;

import com.marpol.classes.model.ScoreDto;

public class ScoreServiceA {
	ScoreDto 홍길동 = new ScoreDto();
	ScoreDto 이몽룡 = new ScoreDto();
	ScoreDto 성춘향 = new ScoreDto();
	
	public int getScore() {
		int score = (int) (Math.random() * 50) + 51;
		return score;
	}

	public void scorePrint(ScoreDto score) {

		System.out.print(score.stNum + "\t");
		System.out.print(score.stName + "\t");

		System.out.printf("%3d\t", score.scKor);
		System.out.printf("%3d\t", score.scEng);
		System.out.printf("%3d\t", score.scMath);
		System.out.printf("%3d\t", score.getTotal());
		System.out.printf("%.5f\n", score.getAvg());

	}

	public void scoreTotalPrint(int kor, int eng, int math) {
		
		System.out.print("\t");
		System.out.print("\t");

		System.out.println("----------------------------------------------------------");
		System.out.printf("%3d\t", kor);
		System.out.printf("%3d\t", eng);
		System.out.printf("%3d\t", math);
		System.out.printf("%3d\t", kor + eng + math);
		System.out.printf("%.5f\n", kor + eng + math / 3);
		
		}
}
