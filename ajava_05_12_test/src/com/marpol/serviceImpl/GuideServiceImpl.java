package com.marpol.serviceImpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.marpol.dataindex.DataIndex;
import com.marpol.dataindex.DataIndex.H;
import com.marpol.dto.GuideDto;
import com.marpol.service.GuideService;
import com.marpol.utils.Utils;

public class GuideServiceImpl implements GuideService {
	
	protected List<GuideDto> hList;

	public GuideServiceImpl() {

		hList = new ArrayList<>();
	}

	public void loadH() {

		String hFile = "src/com/marpol/dataindex/guide.txt";

		Scanner scan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(hFile);
		} catch (FileNotFoundException e) {
			System.out.println(hFile + "파일이 없습니다.");
			return;
		}
		scan = new Scanner(is);

		while (scan.hasNext()) {

			String[] h = scan.nextLine().split(",");

			GuideDto aDto = new GuideDto();
			aDto.hId = h[DataIndex.H.HID];
			aDto.hName = h[DataIndex.H.HNAME];
			aDto.hCount = h[DataIndex.H.HCOUNT];
			aDto.hHow = h[DataIndex.H.HHOW];
			
			hList.add(aDto);
		}
		scan.close();
	}

	public void printHList() {
		
		System.out.println(Utils.dLine(100));
		System.out.println("id\t종목명\t순번\t가이드");
		System.out.println(Utils.sLine(100));
		for (GuideDto dto : hList) {
			System.out.printf("%s\t", dto.hId);
			
			String nameA = dto.hName;
			if(nameA.length() > 10) {
				System.out.printf("%-20s\t", nameA.subSequence(0,10));
			}else {
				System.out.printf("%-20s\t",nameA);
			}
			
			System.out.printf("%s\t", dto.hCount);
			System.out.printf("%s\n", dto.hHow);
			
		}
		System.out.println(Utils.sLine(100));
	}


	public GuideDto getH(String hid) {
		for(GuideDto dto : hList) {
			if(hList.isEmpty()) {
				this.loadH();
			}
			if(dto.hId.equals(hid)) {
				return dto;
			}
		}
		return null;
	}

	public List<GuideDto> getHList() {
		
		if(hList.isEmpty()) {
			this.loadH();
		}
		return hList;
	}

}



