package com.marpol.classes.service;

import java.util.List;

import com.marpol.classes.models.ScoreDto;


/*
 * Java Interface
 * 클래스의 설계도
 * 클래스의 부모 클래스
 */
public interface ScoreService {
	
	// 코드블럭({}) 이 없는 method 의 원형(모형)만 선언하기
	// 코드 구현체가 없는 클래스
	public void makeScore();
	public void makeList(List<ScoreDto> scList);
	public void printScore();
	public void printScore(List<ScoreDto> scList);
	

}
