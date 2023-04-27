package com.marpol.classes.arrays;

import com.marpol.classes.model.ScoreDto;
import com.marpol.classes.service.ScoreServiceA;

public class HomeWorkB {

	public static void main(String[] args) {

		// 문자열(String) class type 배열 10개 선언
//		String[] names1 = new String[10];
		// 각 문자열 배열의 요소에 이름을 저장하기
		// DB로 부터 가져온 데이터,
		// 키보드 등으로 프로젝트가 실행되는 중에 생성된 데이터를
		// 베열에 저장하는 방법
//		names1[0] = "홍길동";
//		names1[1] = "이몽룡";
//		names1[2] = "장보고";
//		names1[3] = "임꺽정";
//		names1[4] = "김철수";
//		names1[5] = "김희경";
//		names1[6] = "이기동";
//		names1[7] = "박철수";
//		names1[8] = "한동후";
//		names1[9] = "성춘향";

		// = {}; 에 표시된 요소들을 기본 값으로 하여
		// names 배열 생성하기
		// names 배열의 요소에 저장할 값이 미리 확정된 경우
		String[] names = { "홍길동", "이몽룡", "장보고", "임꺽정", "김철수", "김희경", "이기동", "박철수", "한동후", "성춘향" };

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}

		// names(학생이름) 배열의 요소 개수 만큼
		// score 배열 요소를 생성하고 싶다
		ScoreDto[] scores = new ScoreDto[names.length];

		ScoreServiceA scService = new ScoreServiceA();

		for (int index = 0; index < scores.length; index++) {
			// names 배열에 저장된 학생이름을 순서대로
			// score 배열 요소의 stName 속성에 복사하기
			scores[index].stName = names[index];

		//	 scores[index].stNum = (index + 1) + "";
			scores[index].stNum = String.format("S%04d", (index + 1));

			// 각 학생의 과목 성적을 랜덤수 샘플데이터로 세팅하기
			scores[index].scKor = scService.getScore();
			scores[index].scEng = scService.getScore();
			scores[index].scMath = scService.getScore();
		}

		System.out.println("=".repeat(60));
		System.out.println("학번 \t이름 \t국어 \t영어 \t수학 \t총점 \t평균");
		System.out.println("=".repeat(60));

		for (int i = 0; i < scores.length; i++) {
			scService.scorePrint(scores[i]);
		}
	}
}
