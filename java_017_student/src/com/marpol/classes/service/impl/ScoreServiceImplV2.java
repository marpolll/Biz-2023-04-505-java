package com.marpol.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.marpol.classes.config.Line;
import com.marpol.classes.datas.DataIndex;
import com.marpol.classes.models.ScoreDto;
import com.marpol.classes.models.StudentDto;
import com.marpol.classes.service.StudentService;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	public ScoreServiceImplV2() {
		// V1 에서 로 선언 를 사용할수 있도록
		// 초기화 하는 작업, 반드시 필요
		scList = new ArrayList<>();
	}

	@Override
	public void loadScore() {
		String scoreFile = "src/com/marpol/classes/datas/score.csv";
		Scanner filescan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(scoreFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(scoreFile + "이 없습니다 확인하세요");
			return;
		}
		filescan = new Scanner(is); // system.in

		while (filescan.hasNext()) {

			String[] score = filescan.nextLine().split(",");
			ScoreDto scDto = new ScoreDto(
					score[DataIndex.SCORE.ST_NUM],
					Integer.valueOf(score[DataIndex.SCORE.ST_KOR]),
					Integer.valueOf(score[DataIndex.SCORE.ST_ENG]), 
					Integer.valueOf(score[DataIndex.SCORE.ST_MATH]),
					Integer.valueOf(score[DataIndex.SCORE.ST_MUSIC]), 
					Integer.valueOf(score[DataIndex.SCORE.ST_ART]),
					Integer.valueOf(score[DataIndex.SCORE.ST_SOFTWARE]), 
					Integer.valueOf(score[DataIndex.SCORE.ST_DATABASE])
					);
			scList.add(scDto);
		}
		filescan.close();
	}

	@Override
	public void printScore() {

		StudentService stService = new StudentServiceImplV4();
		System.out.println(Line.dLine(100));
		System.out.print("학번\t이름\t학과\t\t국어\t영어\t수학\t음악\t미술\t총점\t평균\n");
		System.out.println(Line.sLine(100));
		int i = 0; 
		for (ScoreDto dto : scList) {
			stService.loadStudent();
			StudentDto stDto = stService.getStudent(dto.getStName());
			System.out.print(dto.getStName() + "\t");
			
			if (stDto != null) {
				System.out.print(stDto.stName + "\t");
				System.out.print(stDto.stDept + "\t");
			} else {
				System.out.print("-\t");
				System.out.print("-\t");
			}
			System.out.print(dto.getScKor() + "\t");
			System.out.print(dto.getScEng() + "\t");
			System.out.print(dto.getScMath() + "\t");
			System.out.print(dto.getScMusic() + "\t");
			System.out.print(dto.getScArt() + "\t");
			System.out.print(dto.getTotal() + "\t");
			System.out.print(dto.getTotal()/5 + "\n");
			
			if (++i % 5 ==0 && i < scList.size()) {
				System.out.println(Line.sLine(100));
			}
		}
		System.out.println(Line.dLine(100));
	}

}
