package com.marpol.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.marpol.bank.config.DBContract;
import com.marpol.bank.models.AccDto;
import com.marpol.bank.models.AccListDto;
import com.marpol.bank.models.BuyerDto;
import com.marpol.bank.service.impl.AccListServiceImplV1;
import com.marpol.bank.service.impl.AccServiceImplV1;
import com.marpol.bank.service.impl.BuyerServiceImplV1;
import com.marpol.bank.utils.Line;

public class BankService {

	protected final Scanner scan;
	protected List<AccDto> accList;
	protected List<BuyerDto> buyerList;
	protected final BuyerService buyerService;
	protected final AccService accService;
	protected List<AccListDto> accListDto;
	protected final AccListService accListService;

	public BankService() {
		scan = new Scanner(System.in);
		buyerService = new BuyerServiceImplV1();
		accService = new AccServiceImplV1();
		accListService = new AccListServiceImplV1();
	}

	public void insertAccList2() {
		
		// 고객정보 확인
		printBuyerList();
		findUserInfo2();
		while (true) {
			System.out.println(Line.sLine(100));
			System.out.println("입출금 등록");
			System.out.println(Line.sLine(100));
			System.out.println("계좌 입력 >>  ");
			String acNum = scan.nextLine();
			
			// 계좌번호를 사용하여 tbl_acc 테이블에서 데이터 조회
			// accDto 에는 acNum 계좌번호에 해당하는 데이터가 모두 담긴 상태
			AccDto accDto = accService.findById(acNum);

			if(accDto == null) {
				System.out.printf("계좌번호를 확인하세요($s)", acNum);
				continue;
			}
			System.out.println("거래구분(1입금, 2출금, -1종료) >>");
			String aioDiv = scan.nextLine();
			int intDiv = 0;
			
			try {
				intDiv = Integer.valueOf(aioDiv);
			} catch (Exception e) {
				System.out.printf("선택이 잘못되었다.(%s)" , aioDiv);
				continue;
			}
			if(intDiv == -1 ) {
				System.out.println("입출금 업무중단");
				break;
			}
			
			if(intDiv != 1 && intDiv !=2) {
				System.out.println("1,  2 중에서 선택하세요");
				continue;
			}
			
			String[] divs = {"입금","출금"};
			
			int intAmt = 0;
			
			while(true) {
				String prompt = divs[intDiv-1];
				System.out.printf("%s (QUIT : 종료) >> ", divs[intDiv-1]);
				String amount = scan.nextLine();
				
				if(amount.equals("QUIT")) {
					intAmt = -1;
					break;
				}
				
				try {
					intAmt = Integer.valueOf(amount);
				} catch (Exception e) {
					System.out.printf(" %s 금액은 정수로 입력하세요\n",prompt);
					continue;
				}
				
				if(aioDiv.equals("2")) {
					int balance = accDto.acBalance;
					if(balance < intAmt) {
						System.out.printf("잔액(%d)가 부족하여 출금할수 없습니다.\n", balance);
						continue;
					}
				}
				break;
			} // 입출금입력 while end
			
			if(intAmt < 0) break;
			
			
			
			AccListDto ioDto = new AccListDto();
			
			Date date = new Date(System.currentTimeMillis());
			SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
			SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

			ioDto.aioDate = dateFormat.format(date);
			ioDto.aioTime = timeFormat.format(date);
			
			ioDto.aioDiv = aioDiv;
			ioDto.acNum = acNum;
			
			if(aioDiv.equals("1")) {
				ioDto.aioInput = intAmt;
			}else if (aioDiv.equals("2")) {
				ioDto.aioOutput = intAmt;
				intAmt *= -1;  // 아래 + intAmt 하나만 쓰기 위해서
			}
			
			accListService.insert(ioDto);
			
			accDto.acBalance = accDto.acBalance + intAmt;
			accService.update(accDto);
				
		}
	
		
	}
	
	
	public void insertAccList() {

		this.printBuyerList();

		System.out.println("조회할 고객ID를 입력하세요");
		System.out.print("고객ID >> ");
		String strBuId = scan.nextLine();

		BuyerDto buyerDto = buyerService.findById(strBuId);

		if (buyerDto == null) {
			System.out.println("고객ID 가 없습니다");
			return;
		} else {
			System.out.println(Line.sLine(100));
			System.out.printf("고객ID :  %s\n", buyerDto.buId);
			System.out.printf("이름 :  %s\n", buyerDto.buName);
			System.out.printf("전화번호 :  %s\n", buyerDto.buTel);
			System.out.printf("주소 :  %s\n", buyerDto.buAddr);
			System.out.println(Line.sLine(100));
		}

		List<AccDto> accList = accService.findByBuId(strBuId);
		if (accList.isEmpty()) {
			System.out.println("고객의 계좌정보가 없습니다");
			return;
		} else {
			System.out.println(Line.sLine(100));
			System.out.println("계좌번호\t구분\t잔액");
			System.out.println(Line.sLine(100));
			for (AccDto accDto : accList) {
				System.out.printf("%s\t", accDto.acNum);

				int intDate = 0;
				try {
					intDate = Integer.valueOf(accDto.acDiv);

					System.out.printf("%s\t", DBContract.ACC_DIV[intDate - 1]);

				} catch (Exception e) {
					System.out.printf("%s\t", "종류불명");
				}
				System.out.printf("%d\n", accDto.acBalance);
			}
			System.out.println(Line.sLine(100));
		}

		AccDto accDto = new AccDto();
		AccListDto accListDto = new AccListDto();

		System.out.print("계좌번호 입력 >> ");
		String strAcNum = scan.nextLine();
		accListDto.acNum = strAcNum;

		while (true) {
			System.out.print("1. 입금, 2. 출금 >> ");
			String strAioDiv = scan.nextLine();
			accListDto.aioDiv = strAioDiv;
			if (strAioDiv.equals("1")) {
				System.out.print("입금액 입력 >> ");
				String strAioInput = scan.nextLine();
				accListDto.aioInput = Integer.valueOf(strAioInput);
				accListDto.aioOutput = 0;
				break;
			} else if (strAioDiv.equals("2")) {
				System.out.print("출금액 입력 >> ");
				String strAioOutput = scan.nextLine();
				accListDto.aioOutput = Integer.valueOf(strAioOutput);
				accListDto.aioInput = 0;
				break;
			} else
				continue;
		}
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat today = new SimpleDateFormat("YYYY-MM-dd");
		accListDto.aioDate = today.format(date);
		SimpleDateFormat nowTime = new SimpleDateFormat("HH:mm:ss");
		accListDto.aioTime = nowTime.format(date);
		accListService.insert(accListDto);


		System.out.println(Line.sLine(100));
		System.out.println("계좌번호\t날짜\t\t시간\t \t구분\t\t입금\t출금\t잔액");
		System.out.println(Line.sLine(100));


		System.out.printf("%s\t", accListDto.acNum);

		System.out.printf("%s\t", accListDto.aioDate);

		System.out.printf("%s\t", accListDto.aioTime);

		int intDate = 0;
		try {
			intDate = Integer.valueOf(accListDto.aioDiv);

			System.out.printf("%s\t", DBContract.ACC_DIV[intDate - 1]);

		} catch (Exception e) {
			System.out.printf("%s\t", "종류불명");
		}

			System.out.printf("%d\t", accListDto.aioInput);

			System.out.printf("%d\t", accListDto.aioOutput);
			
			
			accDto.acBalance = accDto.acBalance + accListDto.aioInput;
			accService.update(accDto);
			

			if (accListDto.aioInput > 0) {
				System.out.printf("%d\n", accDto.acBalance + accListDto.aioInput);
			}else if(accListDto.aioOutput > 0 ) {
				System.out.printf("%d\n", accDto.acBalance - accListDto.aioOutput);
			}else if(accListDto.aioOutput > accDto.acBalance) {
				System.out.println("계좌에 잔액이 부족합니다.");
			}
		
		System.out.println(Line.sLine(100));
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	public void makeAccount() {

		while (true) {
			System.out.println("ID 를 입력하세요");
			String strBuId = scan.nextLine();

			BuyerDto buyerDto = buyerService.findById(strBuId);
			if (buyerDto == null) {
				System.out.printf("고객 정보가 없습니다(%s)", strBuId);
				continue;
			}
			Date date = new Date(System.currentTimeMillis());
			SimpleDateFormat today = new SimpleDateFormat("YYYYMMdd");

			String todayString = today.format(date);

			int maxNum = Integer.valueOf(accService.maxAcNum(todayString)) + 1;
			String acNum = String.format("%s%02d", todayString, maxNum);
			System.out.println("계좌번호 : " + acNum);

			AccDto accDto = new AccDto();

			while (true) {
				System.out.print("1.입출금계좌, 2.적금계좌, 3.대출계좌");
				String selNum = scan.nextLine();

				if (selNum.equals("1")) {
					accDto.acDiv = Integer.toString(1);
					break;
				} else if (selNum.equals("2")) {
					accDto.acDiv = Integer.toString(2);
					break;
				} else if (selNum.equals("3")) {
					accDto.acDiv = Integer.toString(3);
					break;
				} else
					System.out.println("잘못 입력하셨습니다.");
				continue;
			}

			accDto.acNum = acNum;
			accDto.acBalance = 10000;
			accDto.acBuId = strBuId;
			accService.insert(accDto);
			break;
		}

	}

	public void findUserInfo2() {

		this.printBuyerList();

		System.out.println("조회할 고객ID를 입력하세요");
		System.out.print("고객ID >> ");
		String strBuId = scan.nextLine();

		BuyerDto buyerDto = buyerService.findById(strBuId);

		if (buyerDto == null) {
			System.out.println("고객ID 가 없습니다");
			return;
		} else {
			System.out.println(Line.sLine(100));
			System.out.printf("고객ID :  %s\n", buyerDto.buId);
			System.out.printf("이름 :  %s\n", buyerDto.buName);
			System.out.printf("전화번호 :  %s\n", buyerDto.buTel);
			System.out.printf("주소 :  %s\n", buyerDto.buAddr);
			System.out.println(Line.sLine(100));
		}

		List<AccDto> accList = accService.findByBuId(strBuId);
		if (accList.isEmpty()) {
			System.out.println("고객의 계좌정보가 없습니다");
			return;
		} else {
			System.out.println(Line.sLine(100));
			System.out.println("계좌번호\t구분\t잔액");
			System.out.println(Line.sLine(100));
			for (AccDto accDto : accList) {
				System.out.printf("%s\t", accDto.acNum);

				int intDate = 0;
				try {
					intDate = Integer.valueOf(accDto.acDiv);

					System.out.printf("%s\t", DBContract.ACC_DIV[intDate - 1]);

				} catch (Exception e) {
					System.out.printf("%s\t", "종류불명");
				}
				System.out.printf("%d\n", accDto.acBalance);
			}
			System.out.println(Line.sLine(100));
		}

	}

	public void findUserInfo() {

		printBuyerList();

		System.out.println("=".repeat(100));
		System.out.println("조회하고자 하는 고객 ID를 입력하세요");
		System.out.println("=".repeat(100));
		System.out.print("ID >>>>");
		String strId = scan.nextLine();

		BuyerDto buyerDto = buyerService.findById(strId);
		accList = accService.findByBuId(strId);

		if (accList == null) {
			System.out.println("없는 ID 입니다.");
		} else {
			System.out.println(buyerDto.toString());
			System.out.println(accList.toString());
		}

	}

	public void printBuyerList() {

		buyerList = buyerService.selectAll();
		System.out.println("=".repeat(100));
		System.out.println("대한은행 고객 리스트");
		System.out.println("=".repeat(100));
		System.out.println("ID\t이름\t전화번호\t주소\t생년월일\t직업");
		System.out.println("-".repeat(100));

		for (BuyerDto buyerDto : buyerList) {

			System.out.printf("%s\t", buyerDto.buId);
			System.out.printf("%s\t", buyerDto.buName);
			System.out.printf("%s\t", buyerDto.buTel);
			System.out.printf("%s\t", buyerDto.buAddr);
			System.out.printf("%s\t", buyerDto.buBirth);
			System.out.printf("%s\n", buyerDto.buJob);
		}
		System.out.println("=".repeat(100));

	}

	public void findByBuyer() {
		System.out.println("=".repeat(100));
		System.out.println("조회하고자 하는 고객 ID를 입력하세요");
		System.out.println("=".repeat(100));
		System.out.print("ID >>>>");
		String strId = scan.nextLine();

		BuyerDto buyerDto = buyerService.findById(strId);
		if (buyerDto == null) {
			System.out.println("없는 ID 입니다.");
		} else {
			System.out.println(buyerDto.toString());
		}
	}

	public void insertBuyer() {

		System.out.println("=".repeat(100));
		System.out.println("고객정보 등록");
		System.out.println("=".repeat(100));

		System.out.print("고객 ID >>>>>>");
		String strBuId = scan.nextLine();

		System.out.print("고객명 >>>>>>");
		String strBiName = scan.nextLine();

		System.out.print("전화번호 >>>>>>");
		String strBuTel = scan.nextLine();

		BuyerDto buyerDto = new BuyerDto();
		buyerDto.buId = strBuId;
		buyerDto.buName = strBiName;
		buyerDto.buTel = strBuTel;

		buyerService.insert(buyerDto);

	}

	public void delete() {

		System.out.println("=".repeat(100));
		System.out.println("삭제할 고객ID 를 입력하세요");
		System.out.print("고객ID >> ");
		String strBuId = scan.nextLine();

		BuyerDto buyerDto = buyerService.findById(strBuId);
		if (buyerDto == null) {
			System.out.printf("%s 고객ID 는 없는 정보입니다", strBuId);
		} else {
			System.out.println(buyerDto.toString());
			System.out.println("고객정보를 정말 삭제할까요???(YES/NO)");
			String yesNo = scan.nextLine();
			if (yesNo.equals("YES")) {
				int result = buyerService.delete(strBuId);
				if (result > 0) {
					System.out.println("고객정보 삭제 완료~~");
				} else {
					System.out.println("고객정보 삭제 실패!!");
				}
			} else {
				System.out.println("삭제 취소!!");
			}
		}
	}

	public void upDate() {

		while (true) {

			System.out.println("=".repeat(100));
			System.out.println("수정할 고객번호 입력");
			System.out.println("=".repeat(100));
			System.out.print("고객ID >>>>>");
			String strBuid = scan.nextLine();

			BuyerDto buyerDto = buyerService.findById(strBuid);

			if (buyerDto == null) {
				System.out.printf("%s, 고객 정보가 없습니다.\n", strBuid);
				continue;
			}
			System.out.println(buyerDto.toString());
			System.out.printf("고객ID : %s\n", buyerDto.buId);
			System.out.printf("고객이름(%s)\n", buyerDto.buName);
			String strBiName = scan.nextLine();
			if (!strBiName.equals(""))
				buyerDto.buName = strBiName;

			System.out.printf("전화번호(%s)\n", buyerDto.buTel);
			String strBuTel = scan.nextLine();
			if (!strBuTel.equals(""))
				buyerDto.buTel = strBuTel;

			int result = buyerService.update(buyerDto);
			if (result > 0)
				System.out.println("변경 성공");
			else
				System.out.println("변경실패");

			break;

		}

	}

}
