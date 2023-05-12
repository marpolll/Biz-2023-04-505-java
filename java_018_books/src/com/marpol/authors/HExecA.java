package com.marpol.authors;

import com.marpol.books.models.HDto;
import com.marpol.books.service.HService;
import com.marpol.books.service.impl.HServiceImplV1;

public class HExecA {
	
	public static void main(String[] args) {
		
		HService hSer = new HServiceImplV1();
		
//		hSer.loadH();
//		hSer.printHList();
//		HDto dto = hSer.getH("경남 밀양시 내일동 649-7");
//		System.out.println(dto);
		hSer.getHList();
		
	}

}
