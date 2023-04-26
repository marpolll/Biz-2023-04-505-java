package com.marpol.classes.arrays;

import com.marpol.classes.model.ScoreDto;

public class ArrayA {
	
	public static void main(String[] args) {
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();
		
		홍길동.stName ="홍길동";
		홍길동.stNum ="0001";
		홍길동.scKor = (int) (Math.random() * 50) + 51;
		홍길동.scEng = (int) (Math.random() * 50) + 51;
		홍길동.scMath = (int) (Math.random() * 50) + 51;
		
		System.out.println("========================================================");
		System.out.println("학번 \t이름 \t국어 \t영어 \t수학 \t총점 \t평균");
		System.out.println("========================================================");
		System.out.print(홍길동.stNum + "\t");
		System.out.print(홍길동.stName + "\t");
		/*
		 * %3d : 3자리의 자릿수를 확보 하고 오른쪽 정령
		 *   90      
		 *   88
		 *  100 
		 */
		System.out.printf("%3d\t", 홍길동.scKor);
		System.out.printf("%3d\t", 홍길동.scEng);
		System.out.printf("%3d\t", 홍길동.scMath);
		
		System.out.printf("%3d\t" , 홍길동.getTotal());
		System.out.printf("%.5f\t" , 홍길동.getAvg());
	}
}
