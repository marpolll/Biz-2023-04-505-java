package com.marpol.shop.exec;

import java.util.Scanner;

import com.marpol.shop.service.ShoppingService;

public class ShoppingExec {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ShoppingService shoppingService = new ShoppingService();

		while (true) {
			System.out.println("=".repeat(100));
			System.out.println("빛나라 쇼핑몰 2023");
			System.out.println("=".repeat(100));
			System.out.println("상품관리");
			System.out.println("-".repeat(50));
			System.out.println("  1. 상품 리스트");
			System.out.println("  2. 상품 등록 및 수정");
			System.out.println("-".repeat(50));
			System.out.println("고객관리");
			System.out.println("-".repeat(50));
			System.out.println("  3. 고객 리스트");
			System.out.println("  4. 고객 등록 및 수정");
			System.out.println("-".repeat(50));
			System.out.println("상품판매");
			System.out.println("-".repeat(50));
			System.out.println("  5. 장바구니 상품 담기");
			System.out.println("  6. 구매자별 장바구니 리스트 보기");
			System.out.println("  7. 장바구니 전체 리스트 보기");
			System.out.println("-".repeat(50));
			System.out.println("QUIT. 끝내기");
			System.out.println("-".repeat(100));
			System.out.print("선택 >>>> ");
			String strSelect = scan.nextLine();
			if (strSelect.equals("QUIT"))
				break;
			int intSelect = 0;
			try {
				intSelect = Integer.valueOf(strSelect);
				strSelect.equals("QUIT");

			} catch (Exception e) {
				System.out.printf("업무 선택은 QUIT(끝내기), 1 ~7 정수만 입력할 수 있습니다. (%s)\n ", strSelect);
				continue;
			}
			if (intSelect < 1 || intSelect > 7) {
				System.out.println("업무 선택은 1 ~ 7 까지 중에 선택하세요");
				continue;

			} else if (intSelect == 1)
				shoppingService.printProductList();
			else if (intSelect == 2)
				shoppingService.insertProduct();
			else if (intSelect == 3)
				shoppingService.printBuyerList();
			else if (intSelect == 4)
				shoppingService.insertBuyer();
			else if (intSelect == 5)
				shoppingService.insertIoList();
			else if (intSelect == 6)
				shoppingService.findByBuyer();
			else if (intSelect == 7) {
				shoppingService.printIoList();
				while (true) {
					System.out.println("1. 기간별 2. 상품별 3. 고객+거래기간");
					String strSel = scan.nextLine();
					int intSel = 0;
					try {
						intSel = Integer.valueOf(strSel);
					} catch (Exception e) {
						System.out.printf("업무 선택을 잘못 하였습니다(%s).", strSel);
						continue;
					}
					if (strSelect.equals("QUIT"))
						break;
					else if (intSel == 1)
						shopSer.printByDateList();
					else if (intSel == 2)
						shopSer.printByPNameList();
					else if (intSel == 3)
						shopSer.printByNameAndDate();
				}
			}

		}
	}
}
