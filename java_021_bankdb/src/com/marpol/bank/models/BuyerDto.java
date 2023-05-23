package com.marpol.bank.models;

public class BuyerDto {
	
public String buId;
public String biName;
public String buTel;
public String buAddr;
public String buBirth;
public String buJob;



public BuyerDto() {
	super();
	// TODO Auto-generated constructor stub
}



public BuyerDto(String buId, String biName, String buTel, String buAddr, String buBirth, String buJob) {
	super();
	this.buId = buId;
	this.biName = biName;
	this.buTel = buTel;
	this.buAddr = buAddr;
	this.buBirth = buBirth;
	this.buJob = buJob;
}



@Override
public String toString() {
	return "BuyerDto [buId=" + buId + ", biName=" + biName + ", buTel=" + buTel + ", buAddr=" + buAddr + ", buBirth="
			+ buBirth + ", buJob=" + buJob + "]";
}





}
