package com.marpol.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.marpol.classes.models.ScData;
import com.marpol.classes.models.ScoreDto;
import com.marpol.classes.models.StudentDto;
import com.marpol.classes.service.ScoreService;
import com.marpol.classes.service.StudentService;

/*
 * Interface(class)를 implements 한 클래스는
 * Interface 에 선언된 모든 method 를 의무적으로 구현해야 한다.
 * Interface 에 선언된 method 를 한개라도 생략하면
 *              클래스 코드는 문법오류가 발생하고 실행 불가 상태가 된다.
 * 
 */
public class ScoreServiceImplV3 implements ScoreService {
	private StudentService stService;
	private List<ScoreDto> scList;
	private List<StudentDto> stdList;
	
	public ScoreServiceImplV3() {
		scList = new ArrayList<>();
		stdList = new ArrayList<>();
		stService  = new ScoreServiceImplV5();
	}

	// ScData.score 배열을 loading 하여
	// scList 데이터로 변환하기
	@Override
	public void makeScore() {
		// TODO Auto-generated method stub
		for (String str : ScData.score) {
			String[] score = str.split(",");
			ScoreDto scDto = new ScoreDto((score[ScData.ST_NUM]), Integer.valueOf(score[ScData.ST_KOR]),
					Integer.valueOf(score[ScData.ST_ENG]), Integer.valueOf(score[ScData.ST_MATH]),
					Integer.valueOf(score[ScData.ST_MUSIC]), Integer.valueOf(score[ScData.ST_ART]),
					Integer.valueOf(score[ScData.ST_SOFTWARE]), Integer.valueOf(score[ScData.ST_DATABASE]));
			scList.add(scDto);
		}

	}

	@Override
	public void makeList(List<ScoreDto> scList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		
		stService.loaadStudent();
		
		System.out.println("=".repeat(100));
		System.out.println("학번\t 이름\t 학과\t 국어\t 영어\t 수학\t 음악\t 미술\n");
		System.out.println("-".repeat(100));
		for (ScoreDto dto : scList) {
			StudentDto dto1 = stService.getStudent(dto.getStName());
			System.out.print(dto.getStName() + "\t");
			System.out.print(dto1.stName + "\t");
			System.out.print(dto1.stDept + "\t");
			System.out.print(dto.getScKor() + "\t");
			System.out.print(dto.getScEng() + "\t");
			System.out.print(dto.getScMath() + "\t");
			System.out.print(dto.getScMusic() + "\t");
			System.out.print(dto.getScArt() + "\t");
			
			System.out.println();
		}
		System.out.println("-".repeat(100));
	}

	@Override
	public void printScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub

	}

}
