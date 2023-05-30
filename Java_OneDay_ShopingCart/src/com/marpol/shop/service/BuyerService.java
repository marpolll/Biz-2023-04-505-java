package com.marpol.shop.service;

import java.util.List;

import com.marpol.shop.models.BuyerDto;

public interface BuyerService {
	
	public List<BuyerDto> selectAll();
	
	public int insert(BuyerDto dto);
	
	public String maxId(String date);
	
	
}
