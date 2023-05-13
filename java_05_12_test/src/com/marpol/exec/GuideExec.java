package com.marpol.exec;

import com.marpol.service.GuideService;
import com.marpol.serviceImpl.GuideServiceImpl;

public class GuideExec {
	
	public static void main(String[] args) {
		
		GuideService guSer = new GuideServiceImpl();
		
		guSer.loadH();
		guSer.printHList();
		
	}

}
