package com.marpol.rnd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.marpol.rnd.AAAA.Utils;
import com.marpol.rnd.dataa.DataIndex;

public class GuideServiceImplV1 implements GuideService {

	protected List<GuideDto> hList;

	public GuideServiceImplV1() {

		hList = new ArrayList<>();

	}

	public void loadH() {

		String hFile = "src/com/marpol/rnd/guide.txt";

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

		System.out.println("=".repeat(100));
		System.out.println("id\t종목명\t순서\t방법");
		System.out.println("-".repeat(100));

		for (GuideDto dto : hList) {

			String idA = dto.hId;
			
			System.out.printf("%s\t", dto.hId);

			String nameA = dto.hName;
			if (nameA.length() > 10) {
				System.out.printf("%-20s\t", nameA.subSequence(0, 10));
			} else {
				System.out.printf("%-20s\t", nameA);
			}

			System.out.printf("%s\t", dto.hCount);
			System.out.printf("%s\n", dto.hHow);

			if (idA.equals(dto.hId)) {
				System.out.println("-".repeat(100));
			}
		}
		System.out.println("=".repeat(100));
	}
}
