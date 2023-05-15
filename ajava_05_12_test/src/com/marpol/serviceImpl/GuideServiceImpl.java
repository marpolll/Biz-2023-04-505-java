package com.marpol.serviceImpl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.marpol.dataindex.DataIndex;
import com.marpol.dto.GuideDto;
import com.marpol.service.GuideService;

public class GuideServiceImpl implements GuideService {
	
	// 객체에 final 키워드를 부착하면 반드시 생성자에서  생성해주어야 한다
		protected final List<GuideDto> guideList;	
		public GuideServiceImpl() {
			this.guideList = new ArrayList<>();
		}
		
		
		@Override
		public void loadH() {

			String guideFile = "src/com/callor/exam/guide.txt";
			InputStream is = null;
			Scanner scan = null;
			
			try {
				is = new FileInputStream(guideFile);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			scan = new Scanner(is);
			
			int rows = 0;
			while(scan.hasNext()) {
				String line = scan.nextLine();
				String[] guide = line.split(",");
				
				GuideDto guDto = new GuideDto();
				try {
					guDto.hId = guide[DataIndex.H.HID];
					guDto.hName = guide[DataIndex.H.HNAME];
					guDto.hCount = guide[DataIndex.H.HCOUNT];
					guDto.hHow = guide[DataIndex.H.HHOW];
					guideList.add(guDto);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(rows + " 번째 에서 Exception 발생");
				}
				
			}
			scan.close();
			System.out.println("로딩된 데이터 개수 : " + guideList.size() );
			
		}

		@Override
		public void printHList() {
			
			System.out.println("=".repeat(150));
			System.out.println("ID\t종목명\t순서\t가이드");
			System.out.println("-".repeat(150));
			
			
			String id = null;
			for(GuideDto dto : guideList ) {
				
				if( id != null && !id.equals(dto.hId) ) {
					System.out.println("-".repeat(150));
				}
				id = dto.hId;
				
				System.out.printf("%s\t", dto.hId);
				System.out.printf("%s\t\t\t", dto.hName);
				System.out.printf("%d\t\t", dto.hCount);
				System.out.printf("%s\n", dto.hHow);
			}
			System.out.println("=".repeat(150));
			
		}

}



