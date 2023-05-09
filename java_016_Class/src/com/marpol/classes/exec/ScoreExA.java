package com.marpol.classes.exec;

import com.marpol.classes.service.ScoreService;
import com.marpol.classes.service.impl.ScoreServiceImplV3;

public class ScoreExA {
	
	public static void main(String[] args) {
		
		ScoreService scService = new ScoreServiceImplV3();
		scService.makeScore();
		scService.printScore();
		
	}

}
