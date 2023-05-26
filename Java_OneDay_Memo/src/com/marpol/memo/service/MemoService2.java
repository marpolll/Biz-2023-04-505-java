package com.marpol.memo.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.marpol.memo.config.DBContract;
import com.marpol.memo.models.MemoDto;
import com.marpol.memo.service.impl.MemoServiceImplV1;
import com.marpol.memo.utils.Line;

public class MemoService2 {
	
	protected final Scanner scan;
	protected List<MemoDto> memoList;
	protected final MemoService memoService;

	
	public MemoService2() {

		scan = new Scanner(System.in);
		memoService = new MemoServiceImplV1();
	}
	
	public void printMemoList() {

		memoList = memoService.selecAll();
		System.out.println("=".repeat(100));
		System.out.println("메모 리스트");
		System.out.println("=".repeat(100));
		System.out.println("일련번호\t작성자\t작성일자\t제목\t내용");
		System.out.println("-".repeat(100));

		for (MemoDto memoDto : memoList) {

			System.out.printf("%s\t", memoDto.mseq);
			System.out.printf("%s\t", memoDto.mwriter);
			System.out.printf("%s\t", memoDto.mdate);
			System.out.printf("%s\t", memoDto.msubject);
			System.out.printf("%s\n", memoDto.mcontent);
			
		}
		System.out.println("=".repeat(100));

	}
	
	
//	public void insertMemoList() {
//
//		// 메모정보 확인
//		printMemoList();
//		findWriterInfo();
//		while (true) {
//			System.out.println(Line.sLine(100));
//			System.out.println("입출금 등록");
//			System.out.println(Line.sLine(100));
//			System.out.println("계좌 입력 >>  ");
//			String acNum = scan.nextLine();
//
//			// 계좌번호를 사용하여 tbl_acc 테이블에서 데이터 조회
//			// accDto 에는 acNum 계좌번호에 해당하는 데이터가 모두 담긴 상태
//			AccDto accDto = accService.findById(acNum);
//
//			if (accDto == null) {
//				System.out.printf("계좌번호를 확인하세요($s)", acNum);
//				continue;
//			}
//			System.out.println("거래구분(1입금, 2출금, -1종료) >>");
//			String aioDiv = scan.nextLine();
//			
//			int intDiv = 0;
//
//			try {
//				intDiv = Integer.valueOf(aioDiv);
//			} catch (Exception e) {
//				System.out.printf("선택이 잘못되었다.(%s)", aioDiv);
//				continue;
//			}
//			if (intDiv == -1) {
//				System.out.println("입출금 업무중단");
//				break;
//			}
//
//			if (intDiv != 1 && intDiv != 2) {
//				System.out.println("1,  2 중에서 선택하세요");
//				continue;
//			}
//
//			String[] divs = { "입금", "출금" };
//
//			int intAmt = 0;
//
//			while (true) {
//				String prompt = divs[intDiv - 1];
//				System.out.printf("%s (QUIT : 종료) >> ", divs[intDiv - 1]);
//				String amount = scan.nextLine();
//
//				if (amount.equals("QUIT")) {
//					intAmt = -1;
//					break;
//				}
//
//				try {
//					intAmt = Integer.valueOf(amount);
//				} catch (Exception e) {
//					System.out.printf(" %s 금액은 정수로 입력하세요\n", prompt);
//					continue;
//				}
//
//				if (aioDiv.equals("2")) {
//					int balance = accDto.acBalance;
//					if (balance < intAmt) {
//						System.out.printf("잔액(%d)가 부족하여 출금할수 없습니다.\n", balance);
//						continue;
//					}
//				}
//				break;
//			} // 입출금입력 while end
//
//			if (intAmt < 0)
//				break;
//
//			AccListDto ioDto = new AccListDto();
//
//			Date date = new Date(System.currentTimeMillis());
//			SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
//			SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
//
//			ioDto.aioDate = dateFormat.format(date);
//			ioDto.aioTime = timeFormat.format(date);
//
//			ioDto.aioDiv = aioDiv;
//			ioDto.acNum = acNum;
//
//			if (aioDiv.equals("1")) {
//				ioDto.aioInput = intAmt;
//			} else if (aioDiv.equals("2")) {
//				ioDto.aioOutput = intAmt;
//				intAmt *= -1; // 아래 + intAmt 하나만 쓰기 위해서
//			}
//
//			accListService.insert(ioDto);
//
//			accDto.acBalance = accDto.acBalance + intAmt;
//			accService.update(accDto);
//
//		}
//
//	}



//	public void findByWriter2() {
//
//		this.printBuyerList();
//
//		System.out.println("조회할 작성자를 입력하세요");
//		System.out.print("작성자 >> ");
//		String strWriter = scan.nextLine();
//
//		MemoDto memoDto = memoService.findByMWriter(strWriter);
//
//		if (buyerDto == null) {
//			System.out.println("고객ID 가 없습니다");
//			return;
//		} else {
//			System.out.println(Line.sLine(100));
//			System.out.printf("고객ID :  %s\n", buyerDto.buId);
//			System.out.printf("이름 :  %s\n", buyerDto.buName);
//			System.out.printf("전화번호 :  %s\n", buyerDto.buTel);
//			System.out.printf("주소 :  %s\n", buyerDto.buAddr);
//			System.out.println(Line.sLine(100));
//		}
//
//		List<AccDto> accList = accService.findByBuId(strBuId);
//		if (accList.isEmpty()) {
//			System.out.println("고객의 계좌정보가 없습니다");
//			return;
//		} else {
//			System.out.println(Line.sLine(100));
//			System.out.println("계좌번호\t구분\t잔액");
//			System.out.println(Line.sLine(100));
//			for (AccDto accDto : accList) {
//				System.out.printf("%s\t", accDto.acNum);
//
//				int intDate = 0;
//				try {
//					intDate = Integer.valueOf(accDto.acDiv);
//
//					System.out.printf("%s\t", DBContract.ACC_DIV[intDate - 1]);
//
//				} catch (Exception e) {
//					System.out.printf("%s\t", "종류불명");
//				}
//				System.out.printf("%d\n", accDto.acBalance);
//			}
//			System.out.println(Line.sLine(100));
//		}
//
//	}

	
	public void findByWriter() {
		
		System.out.println("=".repeat(100));
		System.out.println("조회하고자 하는 작성자를 입력하세요");
		System.out.println("=".repeat(100));
		System.out.print("작성자 >>>>");
		String strWriter = scan.nextLine();

		List<MemoDto> memoDto ;
		
		memoDto = memoService.findByMWriter(strWriter);
		
		if (memoDto == null) {
			System.out.println("없는 작성자 입니다.");
		} else {
			System.out.println(memoDto.toString());
		}
	}
	

	public void findById() {
		System.out.println("=".repeat(100));
		System.out.println("조회하고자 하는 일련번호를 입력하세요");
		System.out.println("=".repeat(100));
		System.out.print("일련번호 >>>>");
		String strId = scan.nextLine();

		MemoDto memoDto = memoService.findById(Integer.valueOf(strId));
		if (memoDto == null) {
			System.out.println("없는 번호 입니다.");
		} else {
			System.out.println(memoDto.toString());
		}
	}

	public void insertMemo() {

		System.out.println("=".repeat(100));
		System.out.println("메모 등록");
		System.out.println("=".repeat(100));

//		int maxNum = 0 ;
//		String seq = "1000";
//		for(MemoDto memoDto : memoList) {
//			
//			int Mseq = memoDto.mseq;
//	
//			seq = seq.substring(0,4);
//		} 
//		
//		
//		String mseq = String.format("%s-%04d", seq,maxNum +1);
//		
//		System.out.println("일련번호 : " + mseq);
		
//		System.out.print("일련번호 >>>>>>");
//		String strmseq = scan.nextLine();
		
		int seq = 1000;
		
		System.out.print("작성자 >>>>>>");
		String strmwriter = scan.nextLine();

		System.out.print("제목 >>>>>>");
		String strmsubject = scan.nextLine();
		
		System.out.print("내용 >>>>>>");
		String strmcontent = scan.nextLine();

		MemoDto memoDto = new MemoDto();
		
		
		
		
		memoDto.mseq = Integer.valueOf(seq);
		memoDto.mwriter = strmwriter;
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat today = new SimpleDateFormat("YYYY-MM-dd");
		memoDto.mdate = today.format(date);
		memoDto.msubject = strmsubject;
		memoDto.mcontent = strmcontent;

		memoService.insert(memoDto);

	}

	public void delete() {

		System.out.println("=".repeat(100));
		System.out.println("삭제할 일련번호 를 입력하세요");
		System.out.print("일련번호 >> ");
		String strmseq = scan.nextLine();

		MemoDto memoDto = memoService.findById(Integer.valueOf(strmseq));
		if (memoDto == null) {
			System.out.printf("%s  없는 일련 번호 입니다", strmseq);
		} else {
			System.out.println(memoDto.toString());
			System.out.println("작성된 메모를 정말 삭제할까요???(YES/NO)");
			String yesNo = scan.nextLine();
			if (yesNo.equals("YES")) {
				int result = memoService.delete(Integer.valueOf(strmseq));
				if (result > 0) {
					System.out.println("메모 삭제 완료");
				} else {
					System.err.println("메모 삭제 실패");
				}
			} else {
				System.out.println("삭제 취소");
			}
		}
	}

	public void upDate() {

		while (true) {

			System.out.println("=".repeat(100));
			System.out.println("수정할 메모의 일련번호 입력");
			System.out.println("=".repeat(100));
			System.out.print("일련번호 >>>>>");
			String strmseq = scan.nextLine();

			MemoDto memoDto = memoService.findById(Integer.valueOf(strmseq));

			if (memoDto == null) {
				System.out.printf("%s, 메모 정보가 없습니다.\n", strmseq);
				continue;
			}
			System.out.println(memoDto.toString());
			System.out.printf("일련번호 : %s\n", memoDto.mseq);
			System.out.printf("작성자 : (%s)\n", memoDto.mwriter);
			String strmWriter = scan.nextLine();
			if (!strmWriter.equals(""))
				memoDto.mwriter = strmWriter;

			System.out.printf("제목 : (%s)\n", memoDto.msubject);
			String strmSubject = scan.nextLine();
			if (!strmSubject.equals(""))
				memoDto.msubject = strmSubject;

			System.out.printf("내용 : (%s)\n", memoDto.mcontent);
			String strmContent = scan.nextLine();
			if (!strmContent.equals(""))
				memoDto.msubject = strmContent;
			
			
			int result = memoService.update(memoDto);
			if (result > 0)
				System.out.println("변경 성공");
			else
				System.out.println("변경실패");

			break;

		}

	}

}
