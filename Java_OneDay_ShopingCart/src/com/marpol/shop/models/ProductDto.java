package com.marpol.shop.models;

public class ProductDto {
	
	public String pCode; //	VARCHAR2(13)	NOT NULL,
	public String pName; //	nVARCHAR2(50)	NULL,
	public String pItem; //	VARCHAR2(10)	NULL,
	public int pIPrice; //	NUMBER	NULL,
	public int pOPrice; //	NUMBER	NULL
	
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDto(String pCode, String pName, String pItem, int pIPrice, int pOPrice) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pItem = pItem;
		this.pIPrice = pIPrice;
		this.pOPrice = pOPrice;
	}

	@Override
	public String toString() {
		return "ProductDto [pCode=" + pCode + ", pName=" + pName + ", pItem=" + pItem + ", pIPrice=" + pIPrice
				+ ", pOPrice=" + pOPrice + "]";
	}
	
}
