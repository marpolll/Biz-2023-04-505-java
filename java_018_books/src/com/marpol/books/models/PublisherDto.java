package com.marpol.books.models;

public class PublisherDto {
	
	private String pubCode;
	private String pubName;
	private String pubCeo;
	private String pubTel;
	private String pubAdd;
	
	
	public PublisherDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PublisherDto(String pubCode, String pubName, String pubCeo, String pubTel, String pubAdd) {
		super();
		this.pubCode = pubCode;
		this.pubName = pubName;
		this.pubCeo = pubCeo;
		this.pubTel = pubTel;
		this.pubAdd = pubAdd;
	}
	public String getPubCode() {
		return pubCode;
	}
	public void setPubCode(String pubCode) {
		this.pubCode = pubCode;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	public String getPubCeo() {
		return pubCeo;
	}
	public void setPubCeo(String pubCeo) {
		this.pubCeo = pubCeo;
	}
	public String getPubTel() {
		return pubTel;
	}
	public void setPubTel(String pubTel) {
		this.pubTel = pubTel;
	}
	public String getPubAdd() {
		return pubAdd;
	}
	public void setPubAdd(String pubAdd) {
		this.pubAdd = pubAdd;
	}
	@Override
	public String toString() {
		return "PublisherDto [pubCode=" + pubCode + ", pubName=" + pubName + ", pubCeo=" + pubCeo + ", pubTel=" + pubTel
				+ ", pubAdd=" + pubAdd + "]";
	}
	
	
	

}
