package com.marpol.bank.service.impl;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.marpol.bank.model.BuyerDto;
import com.marpol.bank.service.BuyerService;

public class BuyerServiceImplV1 implements BuyerService {

	protected List<BuyerDto> buyerList;
	protected Scanner scan;

	public BuyerServiceImplV1() {

		buyerList = new ArrayList<>();
		scan = new Scanner(System.in);

	}

	public void loadBuyer() {

	}

	public void printBuyerList() {

	}

	public BuyerDto getBuyer(String buId) {
		return null;
	}

	
	
	
	
	public void inputBuyer() {
		
		// 전체적인 입력 반복을 위한 while문
		while (true) {

			System.out.println("=".repeat(60));
			System.out.println("고객정보 입력 종료하려면 QUIT 입력");
			System.out.println("-".repeat(60));

			String buId = "";
			BuyerDto buDto = new BuyerDto();
			int intId = 0 ;
		
			// 값에 대한 검증을 하기 위한 while
			while (true) {

				System.out.print("고객ID(정수) >> ");
				buId = scan.nextLine();
				if (buId.equals("QUIT"))
					break;
				try {
					int intNum = Integer.valueOf(buId);
					buId = String.format("%04d", intId);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("고객ID는 정수로 입력하세요");
					continue;
				}
				break;
			}
			if (buId.equals("QUIT"))
//				return null;

			for (BuyerDto dto : buyerList) {
				if (dto.buId.equals(buId)) {
					System.out.println("-".repeat(60));
					System.out.println("동일고객 데이터 있음, 데이터 수정!!");
					System.out.println(dto.toString());
					System.out.println("-".repeat(60));

					buDto = dto;
				}
			}

			System.out.printf("고객이름(%s) >> ", buDto.buName == null ? "신규" : buDto.buName);
			String buName = scan.nextLine();
			if (buName.equals("")) {
				buName = buDto.buName;
			}
			if (buName.equals("QUIT"))
//				return null;

			System.out.printf("전화번호(%s) >> ", buDto.buTel == null ? "신규" : buDto.buTel);
			String buTel = scan.nextLine();
			if (buTel.equals("QUIT"))
//				return null;
			
			if (buTel.equals("")) {
				buTel = buDto.buTel;
			}

//			int intGrade = 0;
//			while (true) {
//				System.out.printf("학년(%d) >> ", stDto.stGrade == 0 ? 0 : stDto.stGrade);
//				String strGrade = scan.nextLine();
//				if (strGrade.equals("QUIT"))
//					break;
//				try {
//					if (stDto.stGrade != 0 && strGrade.equals("")) {
//						intGrade = stDto.stGrade;
//					} else {
//						intGrade = Integer.valueOf(strGrade);
//					}
//				} catch (Exception e) {
//					// TODO: handle exception'
//					System.out.println("학년은 정수로 입력하세요");
//					continue;
//				}
//				if (intGrade < 1 || intGrade > 4) {
//					System.out.println("학년은 정수 1 ~ 4까지만 입력하세요");
//					continue;
//				}
//				break;
//			}
//			if (intGrade == 0)
//				return null;

			System.out.printf("고객주소(%s) >> ", buDto.buAddr == null ? "신규" : buDto.buAddr);
			String buAddr = scan.nextLine();
			if (buAddr.equals("QUIT"))
			if (buAddr.equals("")) {
				buAddr = buDto.buAddr;
			}

			System.out.printf("고객생일(%s) >> ", buDto.buBirth == null ? "신규" : buDto.buBirth);
			String buBirth = scan.nextLine();
			if (buBirth.equals("QUIT"))
			
			if (buBirth.equals("")) {
				buBirth = buDto.buBirth;
			}

			
			System.out.printf("고객직업(%s) >> ", buDto.buJob == null ? "신규" : buDto.buJob);
			String buJob = scan.nextLine();
			if (buJob.equals("QUIT"))
			
			if (buJob.equals("")) {
				buJob = buDto.buJob;
			}

			
			buDto.buId = buId;
			
			buyerList.add(buDto);
			
		}
	}

	@Override
	public void printBuyerList(PrintWriter out) {
		// TODO Auto-generated method stub
		
	}
}