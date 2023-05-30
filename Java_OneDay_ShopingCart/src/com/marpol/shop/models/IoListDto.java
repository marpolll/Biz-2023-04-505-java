package com.marpol.shop.models;

public class IoListDto {
	
	public int ioSEQ; //	NUMBER	NOT NULL,
	public String ioBuId; //	VARCHAR2(10)	NOT NULL,
	public String ioPCode; // 	VARCHAR2(13)	NOT NULL,
	public String ioDate; //	VARCHAR2(10)	NULL,
	public String ioTime; //	VARCHAR2(10)	NULL,
	public int ioQuan; //	NUMBER	NULL,
	public int ioPrice; //	NUMBER	NULL
	
	public IoListDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IoListDto(int ioSEQ, String ioBuId, String ioPCode, String ioDate, String ioTime, int ioQuan, int ioPrice) {
		super();
		this.ioSEQ = ioSEQ;
		this.ioBuId = ioBuId;
		this.ioPCode = ioPCode;
		this.ioDate = ioDate;
		this.ioTime = ioTime;
		this.ioQuan = ioQuan;
		this.ioPrice = ioPrice;
	}

	@Override
	public String toString() {
		return "IoListDto [ioSEQ=" + ioSEQ + ", ioBuId=" + ioBuId + ", ioPCode=" + ioPCode + ", ioDate=" + ioDate
				+ ", ioTime=" + ioTime + ", ioQuan=" + ioQuan + ", ioPrice=" + ioPrice + "]";
	}

}
