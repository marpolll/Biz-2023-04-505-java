package com.marpol.score;

import com.marpol.score.ser.serA;
import com.marpol.score.model.DtoA;

public class ListA2 {
	public static void main(String[] args) {

		DtoA dtoA = new DtoA();
		serA serA = new serA();

		DtoA[] nums = new DtoA[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = new DtoA();
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i].stNum = String.format("23%03d", i + 1);

			nums[i].scKor = serA.getScore();
			nums[i].scEng = serA.getScore();
			nums[i].scMath = serA.getScore();
			nums[i].scMusic = serA.getScore();
			nums[i].scArt = serA.getScore();
		}

		System.out.println("=".repeat(70));
		System.out.println("                    * 한울 고교 성적 리스트 *");
		System.out.println("=".repeat(70));
		System.out.printf("학번\t 국어\t 영어\t 수학\t 음악\t 미술\t 총점\t 평균\n");
		System.out.println("-".repeat(70));
		for (int i = 0; i < nums.length; i++) {
			serA.printScore(nums[i]);
		}

		System.out.println("-".repeat(70));
		serA.TotalScore(nums);
		serA.TotalAvg(nums);
		System.out.println("=".repeat(70));
	}
}
