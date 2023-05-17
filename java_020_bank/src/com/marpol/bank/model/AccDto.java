package com.marpol.bank.model;


/*
 * 계좌번호	문자열(10)	acNum
 * 거래일자	문자열	acDate
 * 거래시각	문자열	acTime
 * 거래구분	문자열	acDe
 * 입금	정수형	acIn
 * 출금	정수형	acOut
 *public String buId;
 */

public class AccDto {
	
	public String acNum;
	public String acDate;
	public String acTime;
	public String acDiv;
	public int acInput;
	public int acOutput;
	public String buId;
	
	
	
	public AccDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AccDto(String acNum, String acDate, String acTime, String acDiv, int acInput, int acOutput, String buId) {
		super();
		this.acNum = acNum;
		this.acDate = acDate;
		this.acTime = acTime;
		this.acDiv = acDiv;
		this.acInput = acInput;
		this.acOutput = acOutput;
		this.buId = buId;
	}



	@Override
	public String toString() {
		return "AccDto [acNum=" + acNum + ", acDate=" + acDate + ", acTime=" + acTime + ", acDiv=" + acDiv
				+ ", acInput=" + acInput + ", acOutput=" + acOutput + ", buId=" + buId + "]";
	}
	
	
	
	

}
