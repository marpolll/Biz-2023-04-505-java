package com.marpol.classes.exec;

import com.marpol.classes.service.ScoreService;
import com.marpol.classes.service.impl.ScoreServiceImplV2;

public class ScoreExecB {
	
	public static void main(String[] args) {
		
		ScoreService scService = new ScoreServiceImplV2();
		scService.loadScore();
		scService.printScore();
		
	}

}

