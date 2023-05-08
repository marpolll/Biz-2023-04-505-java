package com.marpol.classes.exec;

import com.marpol.classes.models.ScoreDto;

public class ScoreA {

	public static void main(String[] args) {

		ScoreDto scoreDto = new ScoreDto();
		scoreDto.setStNum("0001");
		scoreDto.setScKor(80);
		scoreDto.setScMath(20);
		scoreDto.setScMusic(85);
		scoreDto.setScArt(23);

		System.out.println(scoreDto.toString());
	}
}
