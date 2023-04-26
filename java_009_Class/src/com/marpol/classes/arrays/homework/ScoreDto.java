package com.marpol.classes.arrays.homework;

public class ScoreDto {

	public String stNum;
	public String stName;

	public int scKor;
	public int scEng;
	public int scMath;

	public int getTotal() {
		int total = this.scKor;
		total += this.scEng;
		total += this.scMath;
		return total;
	}

	public float getAvg() {
		float avg = (float) this.getTotal() / 3;
		return avg;
	}

}
