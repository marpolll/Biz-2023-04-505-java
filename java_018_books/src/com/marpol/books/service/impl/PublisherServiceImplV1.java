package com.marpol.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.marpol.books.config.DataIndex;
import com.marpol.books.models.PublisherDto;
import com.marpol.books.service.PublisherService;

public class PublisherServiceImplV1 implements PublisherService {

	protected List<PublisherDto> pubList;
	
	public PublisherServiceImplV1() {
		
		pubList = new ArrayList<>();
		
	}
	
	
	public void loadPublisher() {
		
		String pubFile = "src/com/marpol/books/data/출판사정보(2023-05-11).txt";
		
		Scanner scan = null;
		InputStream is = null;
		
		try {
			is = new FileInputStream(pubFile);
		} catch (FileNotFoundException e) {
			System.out.println("정보가 없습니다.");
		}
		
		scan = new Scanner(is);
		
		while(scan.hasNext()) {
			
			String[] pub = scan.nextLine().split(",");
			
			PublisherDto pDto = new PublisherDto();
			
			pDto.setPubCode(pub[DataIndex.PUBLISHER.PUCODE]);
			pDto.setPubName(pub[DataIndex.PUBLISHER.PUNAME]);
			pDto.setPubCeo(pub[DataIndex.PUBLISHER.PUCEO]);
			pDto.setPubTel(pub[DataIndex.PUBLISHER.PUTEL]);
			pDto.setPubAdd(pub[DataIndex.PUBLISHER.PUADD]);
			
			pubList.add(pDto);
		}
		
		scan.close();
		
	
	}

	public void printPublisherList() {
		
		System.out.println("=".repeat(100));
		System.out.println("출판사코드\t출판사명\t대표\t전화번호\t주소");
		System.out.println("-".repeat(100));
		for (PublisherDto dto : pubList) {
			System.out.printf("%s\t",dto.getPubCode());
			System.out.printf("%s\t",dto.getPubName());
			System.out.printf("%s\t",dto.getPubCeo());
			System.out.printf("%s\t",dto.getPubTel());
			System.out.printf("%s\n",dto.getPubAdd());
			
		}
		System.out.println("-".repeat(100));
		
	}

	public PublisherDto getPublisherListByName(String name) {
		
		for(PublisherDto dto : pubList) {
			if(pubList.isEmpty()) {
				this.loadPublisher();
			}
			if(dto.getPubName().contains(name)) {
				pubList.add(dto);
			}
			System.out.println(pubList);
		}
		return null;
	}
		
	
	

}
