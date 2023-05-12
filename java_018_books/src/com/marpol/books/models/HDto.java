package com.marpol.books.models;

public class HDto {
	
	private String hId;
	private String hName;
	private String hCount;
	private String hHow;
	
	
	
	public HDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HDto(String hId, String hName, String hCount, String hHow) {
		super();
		this.hId = hId;
		this.hName = hName;
		this.hCount = hCount;
		this.hHow = hHow;
	}
	public String gethId() {
		return hId;
	}
	public void sethId(String hId) {
		this.hId = hId;
	}
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public String gethCount() {
		return hCount;
	}
	public void sethCount(String hCount) {
		this.hCount = hCount;
	}
	public String gethHow() {
		return hHow;
	}
	public void sethHow(String hHow) {
		this.hHow = hHow;
	}
	@Override
	public String toString() {
		return "HDto [hId=" + hId + ", hName=" + hName + ", hCount=" + hCount + ", hHow=" + hHow + "]";
	}
	
	

}
