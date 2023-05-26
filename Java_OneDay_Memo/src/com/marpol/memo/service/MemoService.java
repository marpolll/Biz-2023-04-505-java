package com.marpol.memo.service;


import java.util.List;

import com.marpol.memo.models.MemoDto;

public interface MemoService {
	
	
	public List<MemoDto> selecAll();
	
	
	public MemoDto findById(int seq);
	
	// 작성자로 검색하기
	public List<MemoDto> findByMWriter(String mWriter);
	
	// 메모 추가
	public int insert(MemoDto dto);
	
	// 메모 수정
	public int update(MemoDto dto);
	
	// 메모 삭제
	public int delete(int seq);
	
	public String maxMseq(String seq);

}
