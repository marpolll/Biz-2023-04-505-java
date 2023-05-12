package com.marpol.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.marpol.books.config.DataIndex;
import com.marpol.books.config.DataIndex2;
import com.marpol.books.config.Utils;
import com.marpol.books.models.AuthorDto;
import com.marpol.books.models.HDto;
import com.marpol.books.service.HService;

public class HServiceImplV1 implements HService {

	protected List<HDto> hList;

	public HServiceImplV1() {

		hList = new ArrayList<>();

	}

	public void loadH() {

		String authorFile = "src/com/marpol/books/data/저자정보(2023-05-11).txt";

		Scanner scan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(authorFile);
		} catch (FileNotFoundException e) {
			System.out.println(authorFile + "파일이 없습니다.");
			return;
		}
		scan = new Scanner(is);

		while (scan.hasNext()) {

			String[] h = scan.nextLine().split(",");

			HDto aDto = new HDto();
			aDto.sethId(h[DataIndex2.H.HID]);
			aDto.sethId(h[DataIndex2.H.HNAME]);
			aDto.sethId(h[DataIndex2.H.HCOUNT]);
			aDto.sethId(h[DataIndex2.H.HHOW]);
			
			hList.add(aDto);
		}
		scan.close();
	}

	public void printHList() {
		
		System.out.println(Utils.dLine(100));
		System.out.println("아이디\t운동이름\t갯수\t방법");
		System.out.println(Utils.sLine(100));
		for (HDto dto : hList) {
			System.out.printf("%s\t", dto.gethId());
			System.out.printf("%s\t", dto.gethName());
			System.out.printf("%s\t", dto.gethCount());
			System.out.printf("%s\n", dto.gethHow());
			
		}
		System.out.println(Utils.dLine(100));
	}


	public HDto getH(String hid) {
		for(HDto dto : hList) {
			if(hList.isEmpty()) {
				this.loadH();
			}
			if(dto.gethId().equals(hid)) {
				return dto;
			}
		}
		return null;
	}

	public List<HDto> getHList() {
		
		if(hList.isEmpty()) {
			this.loadH();
		}
		return hList;
	}

}
