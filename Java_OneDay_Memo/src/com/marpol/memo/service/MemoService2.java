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
		
		System.out.print("작성자 >>>>>>");
		String strmwriter = scan.nextLine();

		System.out.print("제목 >>>>>>");
		String strmsubject = scan.nextLine();
		
		System.out.print("내용 >>>>>>");
		String strmcontent = scan.nextLine();

		MemoDto memoDto = new MemoDto();
		
		
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
