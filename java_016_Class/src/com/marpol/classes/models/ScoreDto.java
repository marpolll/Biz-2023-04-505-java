package com.marpol.classes.models;

public class ScoreDto {
	
	private String stName;
	private int scKor;
	private int scEng;
	private int scMath;
	private int scMusic;
	private int scArt;
	private int scSorftWare;
	private int scDataBase;
	
	public ScoreDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScoreDto(String stName, int scKor, int scEng, int scMath, int scMusic, int scArt, int scSorftWare,
			int scDataBase) {
		super();
		this.stName = stName;
		this.scKor = scKor;
		this.scEng = scEng;
		this.scMath = scMath;
		this.scMusic = scMusic;
		this.scArt = scArt;
		this.scSorftWare = scSorftWare;
		this.scDataBase = scDataBase;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getScKor() {
		return scKor;
	}
	public void setScKor(int scKor) {
		this.scKor = scKor;
	}
	public int getScEng() {
		return scEng;
	}
	public void setScEng(int scEng) {
		this.scEng = scEng;
	}
	public int getScMath() {
		return scMath;
	}
	public void setScMath(int scMath) {
		this.scMath = scMath;
	}
	public int getScMusic() {
		return scMusic;
	}
	public void setScMusic(int scMusic) {
		this.scMusic = scMusic;
	}
	public int getScArt() {
		return scArt;
	}
	public void setScArt(int scArt) {
		this.scArt = scArt;
	}
	public int getScSorftWare() {
		return scSorftWare;
	}
	public void setScSorftWare(int scSorftWare) {
		this.scSorftWare = scSorftWare;
	}
	public int getScDataBase() {
		return scDataBase;
	}
	public void setScDataBase(int scDataBase) {
		this.scDataBase = scDataBase;
	}
	@Override
	public String toString() {
		return "ScoreDto [stName=" + stName + ", scKor=" + scKor + ", scEng=" + scEng + ", scMath=" + scMath
				+ ", scMusic=" + scMusic + ", scArt=" + scArt + ", scSorftWare=" + scSorftWare + ", scDataBase="
				+ scDataBase + "]";
	}
	
	
	
	

}
