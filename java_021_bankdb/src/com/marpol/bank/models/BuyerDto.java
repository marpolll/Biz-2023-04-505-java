package com.marpol.bank.models;

public class BuyerDto {
	
public String buId;
public String buName;
public String buTel;
public String buAddr;
public String buBirth;
public String buJob;



public BuyerDto() {
	super();
	// TODO Auto-generated constructor stub
}



public BuyerDto(String buId, String buName, String buTel, String buAddr, String buBirth, String buJob) {
	super();
	this.buId = buId;
	this.buName = buName;
	this.buTel = buTel;
	this.buAddr = buAddr;
	this.buBirth = buBirth;
	this.buJob = buJob;
}



@Override
public String toString() {
	return "BuyerDto [buId=" + buId + ", biName=" + buName + ", buTel=" + buTel + ", buAddr=" + buAddr + ", buBirth="
			+ buBirth + ", buJob=" + buJob + "]";
}





}
