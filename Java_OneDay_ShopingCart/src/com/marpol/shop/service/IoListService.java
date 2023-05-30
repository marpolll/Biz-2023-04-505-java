package com.marpol.shop.service;

import java.util.List;

import com.marpol.shop.models.IoListDto;


public interface IoListService {
	
	public List<IoListDto> selecAll();
	
	public int insert(IoListDto dto);
	
	public List<IoListDto> findByBuId(String ioBuId);
	
	public List<IoListDto> findByDateDestance(String sDate, String eDate);
	
}
