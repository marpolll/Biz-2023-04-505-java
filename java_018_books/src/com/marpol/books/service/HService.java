package com.marpol.books.service;

import java.util.List;


import com.marpol.books.models.HDto;

public interface HService {

	public void loadH();
	public void printHList();

	public HDto getH(String hId);

	public List<HDto> getHList();

}
