package com.marpol.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.marpol.classes.models.ScoreDto;
import com.marpol.classes.service.ScoreServiceV2;

public class ExecD {
	
	public static void main(String[] args) {
		ScoreServiceV2  scoreService = new ScoreServiceV2();
		scoreService.makeScore();
		
		List<ScoreDto> scList = new ArrayList<>();
		
		scoreService.makeScore(scList);
		scoreService.printScore(scList);
		
	}

}
