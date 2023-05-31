package com.marpol.shop.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.marpol.shop.models.BuyerDto;
import com.marpol.shop.models.IoListDto;
import com.marpol.shop.models.ProductDto;
import com.marpol.shop.service.impl.BuyerServiceImplV1;
import com.marpol.shop.service.impl.IoListServiceImplV1;
import com.marpol.shop.service.impl.ProductServiceImplV1;

public class ShoppingService {

	protected final Scanner scan;
	protected List<ProductDto> productList;
	protected List<BuyerDto> buyerList;
	protected final BuyerService buyerService;
	protected final ProductService productService;
	protected List<IoListDto> ioList;
	protected final IoListService ioListService;

	public ShoppingService() {
		scan = new Scanner(System.in);
		buyerService = new BuyerServiceImplV1();
		productService = new ProductServiceImplV1();
		ioListService = new IoListServiceImplV1();
	}

	public void findByBuyer() {

		System.out.println("=".repeat(100));
		System.out.println("조회하고자 하는 고객 ID를 입력하세요");
		System.out.println("=".repeat(100));
		System.out.print("ID >>>>");
		String strId = scan.nextLine();

		ioListService.findByBuId(strId);

		if (ioListService.findByBuId(strId) == null) {
			System.out.println("없는 ID 입니다.");
		} else {
			System.out.println(ioListService.findByBuId(strId).toString());
		}
	}

	public void printIoList() {

		ioList = ioListService.selecAll();
		
		System.out.println("=".repeat(100));
		System.out.println("전체거래 리스트");
		System.out.println("=".repeat(100));
		System.out.println("거래일자\t거래시각\t고객ID\t고객이름\t전화번호\t상품코드\t상품명\t판매단가\t수량\t판매합계");
		System.out.println("-".repeat(100));
		
		BuyerDto buyerDto = new BuyerDto();
		ProductDto pdDto = new ProductDto();
		
		for (IoListDto ioDto : ioList) {
			System.out.printf("%s\t", ioDto.ioDate);
			System.out.printf("%s\t", ioDto.ioTime);
			System.out.printf("%s\t", ioDto.ioBuId);
			System.out.printf("%s\t", buyerDto.buName);
			System.out.printf("%s\t", buyerDto.buTel);
			System.out.printf("%s\t", ioDto.ioPCode);
			System.out.printf("%s\t", pdDto.pName);
			System.out.printf("%s\t", ioDto.ioPrice);
			System.out.printf("%s\t", ioDto.ioQuan);
			System.out.println(ioDto.ioPrice * ioDto.ioQuan);
		}
		System.out.println("-".repeat(150));
	}

	public void printByBuyerList() {
		
		ioList = ioListService.selecAll();
		
		BuyerDto buyerDto = new BuyerDto();
		ProductDto pdDto = new ProductDto();
		
		System.out.print("고객이름 입력 >> ");
		String strName = scan.nextLine();
		
		buyerList = buyerService.findByName(strName);
		
		System.out.println("=".repeat(100));
		System.out.println(strName + "님 거래 리스트");
		System.out.println("=".repeat(100));
		System.out.println("거래일자\t거래시각\t고객ID\t고객이름\t전화번호\t상품코드\t상품명\t판매단가\t수량\t판매합계");
		System.out.println("-".repeat(100));
		
		
		for (IoListDto ioDto : ioList) {
			System.out.printf("%s\t", ioDto.ioDate);
			System.out.printf("%s\t", ioDto.ioTime);
			System.out.printf("%s\t", ioDto.ioBuId);
			System.out.printf("%s\t", buyerDto.buName);
			System.out.printf("%s\t", buyerDto.buTel);
			System.out.printf("%s\t", ioDto.ioPCode);
			System.out.printf("%s\t", pdDto.pName);
			System.out.printf("%s\t", ioDto.ioPrice);
			System.out.printf("%s\t", ioDto.ioQuan);
			System.out.println(ioDto.ioPrice * ioDto.ioQuan);
		}
		System.out.println("-".repeat(150));
	}

	public void printByDateList() {
		
		ioList = ioListService.selecAll();
		
		BuyerDto buyerDto = new BuyerDto();
		ProductDto pdDto = new ProductDto();
		
		System.out.println("시작날짜 입력 >> ");
		String strSDate = scan.nextLine();
		
		System.out.println("마지막날짜 입력 >> ");
		String strEDate = scan.nextLine();
		
		
		System.out.println("=".repeat(100));
		System.out.println(strSDate + " - " + strEDate + " 거래 리스트");
		System.out.println("=".repeat(100));
		System.out.println("거래일자\t거래시각\t고객ID\t고객이름\t전화번호\t상품코드\t상품명\t판매단가\t수량\t판매합계");
		System.out.println("-".repeat(100));
		
		for (IoListDto ioDto : ioList) {
			
			System.out.printf("%s\t", ioDto.ioDate);
			System.out.printf("%s\t", ioDto.ioTime);
			System.out.printf("%s\t", ioDto.ioBuId);
			System.out.printf("%s\t", buyerDto.buName);
			System.out.printf("%s\t", buyerDto.buTel);
			System.out.printf("%s\t", ioDto.ioPCode);
			System.out.printf("%s\t", pdDto.pName);
			System.out.printf("%s\t", ioDto.ioPrice);
			System.out.printf("%s\t", ioDto.ioQuan);
			System.out.println(ioDto.ioPrice * ioDto.ioQuan);
		}
		System.out.println("-".repeat(150));
	}

	public void printByPNameList() {
		
		ioList = ioListService.selecAll();
		System.out.print("상품이름 입력 >> ");
		String strPName = scan.nextLine();
		
		
		System.out.println("=".repeat(100));
		System.out.println(strPName + " 물품 거래 리스트");
		System.out.println("=".repeat(100));

		BuyerDto buyerDto = new BuyerDto();
		ProductDto pdDto = new ProductDto();
		
		for (IoListDto ioDto : ioList) {
			System.out.printf("%s\t", ioDto.ioDate);
			System.out.printf("%s\t", ioDto.ioTime);
			System.out.printf("%s\t", ioDto.ioBuId);
			System.out.printf("%s\t", buyerDto.buName);
			System.out.printf("%s\t", buyerDto.buTel);
			System.out.printf("%s\t", ioDto.ioPCode);
			System.out.printf("%s\t", pdDto.pName);
			System.out.printf("%s\t", ioDto.ioPrice);
			System.out.printf("%s\t", ioDto.ioQuan);
			System.out.println(ioDto.ioPrice * ioDto.ioQuan);
		}
		System.out.println("-".repeat(150));
	}

	public void printByNameAndDate() {
		ioList = ioListService.selecAll();
		System.out.println("고객ID 입력 >> ");
		String strID = scan.nextLine();
		
		System.out.println("날짜 입력 >> ");
		String strDate = scan.nextLine();
		
		IoListDto ioListDto = new IoListDto();
		BuyerDto buyerDto = new BuyerDto();
		ProductDto pdDto = new ProductDto();
		
		System.out.println("=".repeat(100));
		System.out.println(buyerDto.buName + "님" + ioListDto.ioDate + "날짜 구매 리스트");
		System.out.println("=".repeat(100));
		System.out.println("거래일자\t거래시각\t고객ID\t고객이름\t전화번호\t상품코드\t상품명\t판매단가\t수량\t판매합계");
		System.out.println("-".repeat(100));
		
		for (IoListDto ioDto : ioList) {
			System.out.printf("%s\t", ioDto.ioDate);
			System.out.printf("%s\t", ioDto.ioTime);
			System.out.printf("%s\t", ioDto.ioBuId);
			System.out.printf("%s\t", buyerDto.buName);
			System.out.printf("%s\t", buyerDto.buTel);
			System.out.printf("%s\t", ioDto.ioPCode);
			System.out.printf("%s\t", pdDto.pName);
			System.out.printf("%s\t", ioDto.ioPrice);
			System.out.printf("%s\t", ioDto.ioQuan);
			System.out.println(ioDto.ioPrice * ioDto.ioQuan);
		}
		System.out.println("-".repeat(150));

	}
	
	
	
	
	public void insertIoList() {

		System.out.println("=".repeat(100));
		System.out.println("장바구니 상품 담기");
		System.out.println("=".repeat(100));

		IoListDto ioDto = new IoListDto();
		ProductDto poDto = new ProductDto();

		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat today = new SimpleDateFormat("YYYY-MM-dd");

		ioDto.ioDate = today.format(date);

		SimpleDateFormat nowTime = new SimpleDateFormat("HH:mm:ss");
		ioDto.ioTime = nowTime.format(date);

		System.out.print("고객ID >>>>>>");
		String strBuId = scan.nextLine();

		System.out.print("상품코드 >>>>>>");
		String strPCode = scan.nextLine();

		System.out.print("수량 >>>>>>");
		String strQuan = scan.nextLine();

		ioDto.ioBuId = strBuId;
		ioDto.ioPCode = strPCode;
		ioDto.ioQuan = Integer.valueOf(strQuan);
		ioDto.ioPrice = poDto.pOPrice;

		ioListService.insert(ioDto);

	}

	public void printProductList() {

		productList = productService.selectAll();
		System.out.println("=".repeat(100));
		System.out.println("빛나라 쇼핑몰 상품 리스트");
		System.out.println("=".repeat(100));
		System.out.print("상품코드\t상품명\t품목\t매입단가\t매출단가\n");
		System.out.println("-".repeat(100));

		for (ProductDto productDto : productList) {

			System.out.printf("%s\t", productDto.pCode);
			System.out.printf("%s\t", productDto.pName);
			System.out.printf("%s\t", productDto.pItem);
			System.out.printf("%s\t", productDto.pIPrice);
			System.out.printf("%s\n", productDto.pOPrice);
		}
		System.out.println("=".repeat(100));

	}

	public void insertProduct() {

		ProductDto productDto = new ProductDto();

		System.out.println("=".repeat(100));
		System.out.println("상품정보 등록");
		System.out.println("=".repeat(100));
		String strPCode = "";

		System.out.print("상품코드 >>>>>>");
		strPCode = scan.nextLine();
		while (true) {
			if (strPCode == productDto.pCode) {

				System.out.println(productDto.toString());
				System.out.printf("상품코드 : %s\n", productDto.pCode);

				System.out.printf("상품명(%s)\n", productDto.pName);
				String strPName = scan.nextLine();
				if (!strPName.equals(""))
					productDto.pName = strPName;

				System.out.printf("품목(%s)\n", productDto.pItem);
				String strPItem = scan.nextLine();
				if (!strPItem.equals(""))
					productDto.pItem = strPItem;

				System.out.printf("매입단가(%s)\n", productDto.pIPrice);
				String strPIPrice = scan.nextLine();
				if (!strPName.equals(""))
					productDto.pIPrice = Integer.valueOf(strPIPrice);

				System.out.printf("매출단가(%s)\n", productDto.pOPrice);
				String strPOPrice = scan.nextLine();
				if (!strPOPrice.equals(""))
					productDto.pOPrice = Integer.valueOf(strPOPrice);

				int result = productService.update(productDto);
				if (result > 0)
					System.out.println("변경 성공");
				else
					System.out.println("변경실패");
			}
			break;
		}

		System.out.print("상품명 >>>>>>");
		String strPName = scan.nextLine();

		System.out.print("품목 >>>>>>");
		String strPItem = scan.nextLine();

		System.out.print("매입단가 >>>>>>");
		String strPIPrice = scan.nextLine();

		int intPIPrice = 0;

		try {
			intPIPrice = Integer.valueOf(strPIPrice);
		} catch (Exception e) {
			System.out.printf(" %s 금액은 정수로 입력하세요\t", strPIPrice);
		}

		int intPOPrice = Integer.valueOf(strPIPrice);
		double doublePOPrice = intPIPrice * 0.22;
		int IntPOPrice = (int) doublePOPrice;

		System.out.printf("매출단가 >>>>>> %s\n", IntPOPrice + intPOPrice);

		productDto.pCode = strPCode;
		productDto.pName = strPName;
		productDto.pItem = strPItem;
		productDto.pIPrice = Integer.valueOf(strPIPrice);
		productDto.pOPrice = intPOPrice + IntPOPrice;

		productService.insert(productDto);

	}

	public void printBuyerList() {

		buyerList = buyerService.selectAll();
		System.out.println("=".repeat(100));
		System.out.println("빛나라 쇼핑몰 고객 리스트");
		System.out.println("=".repeat(100));
		System.out.println("고객ID\t고객이름\t전화번호\t주소");
		System.out.println("-".repeat(100));

		for (BuyerDto buyerDto : buyerList) {

			System.out.printf("%s\t", buyerDto.buId);
			System.out.printf("%s\t", buyerDto.buName);
			System.out.printf("%s\t", buyerDto.buTel);
			System.out.printf("%s\n", buyerDto.buAddr);
		}
		System.out.println("=".repeat(100));

	}

	public void insertBuyer() {

		String strMaxId = maxId();

		System.out.println("=".repeat(100));
		System.out.println("고객정보 등록");
		System.out.println("=".repeat(100));

		System.out.printf("고객ID (%s)\n", strMaxId);
		String strBuName = "";
		while (true) {
			System.out.print("고객이름 >> ");
			strBuName = scan.nextLine();
			if (strBuName.equals("")) {
				System.err.println("고객이름은 빈칸으로 입력하실 수 없습니다.");
			} else {
				break;
			}
		}

		System.out.print("전화번호 >>>>>>");
		String strBuTel = scan.nextLine();

		System.out.print("주소 >>>>>>");
		String strBuAddr = scan.nextLine();

		BuyerDto buyerDto = new BuyerDto();

		buyerDto.buId = strMaxId;
		buyerDto.buName = strBuName;
		buyerDto.buTel = strBuTel;
		buyerDto.buAddr = strBuAddr;

		buyerService.insert(buyerDto);

	}

	public String maxId() {

		String strMaxId = buyerService.maxId();
		int maxId = 0;
		if (strMaxId == null) {
			maxId = 0;
		} else {
			maxId = Integer.valueOf(strMaxId) + 1;
		}
		strMaxId = String.format("%010d", maxId);

		return strMaxId;
	}
}
