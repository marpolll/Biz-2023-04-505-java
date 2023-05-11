package com.marpol.books.models;

public class AuthorDto {
	
	private String auCode;
	private String auName;
	private String auTel;
	private String auAdd;
	
	public AuthorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthorDto(String auCode, String auName, String auTel, String auAdd) {
		super();
		this.auCode = auCode;
		this.auName = auName;
		this.auTel = auTel;
		this.auAdd = auAdd;
	}
	public String getAuCode() {
		return auCode;
	}
	public void setAuCode(String auCode) {
		this.auCode = auCode;
	}
	public String getAuName() {
		return auName;
	}
	public void setAuName(String auName) {
		this.auName = auName;
	}
	public String getAuTel() {
		return auTel;
	}
	public void setAuTel(String auTel) {
		this.auTel = auTel;
	}
	public String getAuAdd() {
		return auAdd;
	}
	public void setAuAdd(String auAdd) {
		this.auAdd = auAdd;
	}
	@Override
	public String toString() {
		return "AuthorDto [auCode=" + auCode + ", auName=" + auName + ", auTel=" + auTel + ", auAdd=" + auAdd + "]";
	}
	

}
