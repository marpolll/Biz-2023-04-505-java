package com.marpol.memo.exec;

import java.util.Scanner;

import com.marpol.memo.service.MemoService2;

public class MemoExecA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemoService2 memoService = new MemoService2();

		while (true) {

			System.out.println("=".repeat(100));
			System.out.println("메모장");
			System.out.println("=".repeat(100));
			System.out.println("실행할 항목을 선택하세요");
			System.out.println("  1. 메모 추가");
			System.out.println("  2. 메모 수정");
			System.out.println("  3. 메모 삭제");
			System.out.println("  4. 메모 리스트");
			System.out.println("  5. 작성자 조회");
			System.out.println("  9. 업무종료");
			System.out.println("-".repeat(100));
			System.out.print("선택 >>>> ");
			String strSelect = scan.nextLine();
			int intSelect = 0;
			try {
				intSelect = Integer.valueOf(strSelect);
			} catch (Exception e) {
				System.out.printf("잘못된 선택입니다..(%s)\n", strSelect);
				continue;
			}
			if (intSelect == 9)
				break;
			else if (intSelect == 1)
				memoService.insertMemo();
			else if (intSelect == 2)
				memoService.upDate();
			else if (intSelect == 3)
				memoService.delete();
			else if (intSelect == 4)
				memoService.printMemoList();
			else if (intSelect == 5)
				memoService.findByWriter();
		}
		System.out.println("잘하자");

	}

}
