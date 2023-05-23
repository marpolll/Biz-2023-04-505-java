package com.marpol.bank.service;

import java.util.List;

import com.marpol.bank.models.BuyerDto;

public interface BuyerService {
	
	// 전체 리스트를 조회하는 매소드
	public List<BuyerDto> selectAll();
	
	// PK 를 기준으로 1개의 데이터를 조회 하는 메소드
	public BuyerDto findById(String id);
	
	// 1개의 데이터를 DB 에 추가하는 메소드
	public int insert(BuyerDto dto);
	
	// 데이터를 업데이트(수정)하는 메소드
	public int update(BuyerDto dto);
	
	// PK 를 전달받아 1개의 데이터를 삭제하는 메소드
	public int delete(String id);

}
