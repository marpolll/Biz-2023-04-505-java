package com.marpol.classes.service;

import java.util.ArrayList;
import java.util.List;

import com.marpol.classes.models.ScoreDto;

public class ScoreServiceV2 {

	private int classSize = 10;

	// scoreList 변수를 ScoreServiceV2 클래스와
	// 다른 method 에서 사용하기 위하여
	// 클래스 영역으로 scope 를 이동 한다.
	// 클래스 영역으로 scope 가 이동된 객체 변수는
	// 선언만 수행한다.
	// 선언만 수행된 객체변수는 사용하려고 하면 null~~~~~~~~~~exeption~~~
	// 발생 할수 있다.
	// 그래서 makeScore() method 가 시작되는 곳에서 scoreList 를
	// 초기화 (생성) 해 주어야 한다.
	private List<ScoreDto> scList; // 객체변수 선언
	public void makeScore() {
		
		// scoreList 변수의 scope 가 makeScore() {  } 블럭이다.
		// 만약 다른 method(
		// scoreList 변수값을 사용하려면
		// scope 영역을 변경해 주어야 한다.
		scList = new ArrayList<>(); // 객체변수 초기화
		this.makeScore(scList);
		
		
//		for (int i = 0; i < classSize; i++) {
//			String stNum = String.format("%03d", i + 1);
//			int scKor = (int) (Math.random() * 50) + 51;
//			int scEng = (int) (Math.random() * 50) + 51;
//			int scMath = (int) (Math.random() * 50) + 51;
//
//			ScoreDto scoreDto = new ScoreDto();
//			scoreDto.setStName(stNum);
//			scoreDto.setScKor(scKor);
//			scoreDto.setScEng(scEng);
//			scoreDto.setScMath(scMath);
//
//		}
	}

	public void makeScore(List<ScoreDto> scList) {

		for (int i = 0; i < classSize; i++) {
			
			// 학번 0001~0010 까지 만들기
			String stNum = String.format("%04d", i + 1);
			// 점수 만들기
			int scKor = (int) (Math.random() * 50) + 51;
			int scEng = (int) (Math.random() * 50) + 51;
			int scMath = (int) (Math.random() * 50) + 51;

			// 학번과 점수를 scoreDto 객체변수를 만들어 저장하기
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.setStName(stNum);
			scoreDto.setScKor(scKor);
			scoreDto.setScEng(scEng);
			scoreDto.setScMath(scMath);

			// scoreDto 객체변수를 scList에 추가하기
			scList.add(scoreDto);
		}

	}

	public void printScore(List<ScoreDto> scList) {

		System.out.println("=".repeat(50));
		System.out.print("학번\t국어\t수학\t영어\n");
		System.out.println("-".repeat(50));
		for (int i = 0; i < scList.size(); i++) {
			System.out.print(scList.get(i).getStName() + "\t");
			System.out.print(scList.get(i).getScKor() + "\t");
			System.out.print(scList.get(i).getScEng() + "\t");
			System.out.println(scList.get(i).getScMath() + "\t");
			System.out.println();
		}
		System.out.println("-".repeat(50));
	}
}
