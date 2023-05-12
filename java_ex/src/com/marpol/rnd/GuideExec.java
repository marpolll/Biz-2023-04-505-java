package com.marpol.rnd;

public class GuideExec {
	
	public static void main(String[] args) {
		
		GuideService guSer = new GuideServiceImplV1();
		
		guSer.loadH();
		guSer.printHList();
		
	}

}
