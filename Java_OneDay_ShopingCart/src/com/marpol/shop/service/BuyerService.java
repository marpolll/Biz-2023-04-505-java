package com.marpol.shop.service;

import java.util.List;

import com.marpol.shop.models.BuyerDto;

public interface BuyerService {
	
	public List<BuyerDto> selectAll();
	
	public int insert(BuyerDto dto);

	public List<BuyerDto> findById(String id);
	
	public List<BuyerDto> findByName(String name);

	public int update(BuyerDto dto);

	public String maxId();
	
}
