package com.marpol.classes.exec;

import com.marpol.classes.service.ScoreService;

import com.marpol.classes.service.impl.ScoreServiceImplV1;

public class ScoreExecA {
	
	public static void main(String[] args) {
		
		ScoreService scService = new ScoreServiceImplV1();
		scService.loadScore();
		scService.printScore();
		
	}

}
