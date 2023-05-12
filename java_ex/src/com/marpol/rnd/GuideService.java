package com.marpol.rnd;

import java.util.List;

public interface GuideService {
	
	public void loadH();
	public void printHList();

	public GuideDto getH(String hId);

	public List<GuideDto> getHList();
	
	

}
