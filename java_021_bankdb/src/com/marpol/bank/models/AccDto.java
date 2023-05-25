package com.marpol.bank.models;

/*
 * 데이터 클래스는
 * 각 method 간에 데이터를 묶음으로 담아 전달하기 위한 목적의 객체
 */

public class AccDto {
	
//	VARCHAR2(10)
//	VARCHAR2(1)
//	VARCHAR2(5)
//	NUMBER
	
	public String acNum;
	public String acDiv;
	public String acBuId;
	public int acBalance;
	
	
	// super, 기본 생성자
	public AccDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	// filed, 임의 생성자
	public AccDto(String acNum, String acDiv, String acBuId, int acBalance) {
		super();
		this.acNum = acNum;
		this.acDiv = acDiv;
		this.acBuId = acBuId;
		this.acBalance = acBalance;
	}



	@Override
	public String toString() {
		return "AccDto [acNum=" + acNum + ", acDate=" + acDiv + ", acBuId=" + acBuId + ", acBalance=" + acBalance
				+ "]";
	}

	
	
}
