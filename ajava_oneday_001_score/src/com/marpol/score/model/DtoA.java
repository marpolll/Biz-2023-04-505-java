package com.marpol.score.model;

public class DtoA {
	
	public String stName;
	public String stNum;
	
	public int scKor;
	public int scEng;
	public int scMath;
	public int scMusic;
	public int scArt;
	
	public int getTotal() {
		int total = this.scKor;
		total += this.scEng;
		total += this.scMath;
		total += this.scMusic;
		total += this.scArt;
		
		return total;	
	
	}
	
	public float getAvg() {
		float avg = (float)this.getTotal() / 5;
		return avg;
	}
	
}
