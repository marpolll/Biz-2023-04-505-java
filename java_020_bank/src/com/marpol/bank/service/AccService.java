package com.marpol.bank.service;

import com.marpol.bank.model.AccDto;


/*
 * 게좌정보에 대한 interface
 * 
 * 1.계좌개설
 * 		계좌번호 신설
 * 2. 입금과 출금
 * 3. 입출금 리스트 출력
 * 4. 계좌데이터 저장
 * 5. 시작할때 계좌 데이터 읽어오기
 * 
 */

public interface AccService {
	
	public void acInit(); // 신규개설
	/*
	 * 계좌번호를 중복되지 않도록 만들기
	 * 고객ID + 계좌번호 정보가 중복되지 않아야 한다.
	 * AccList 에 계좌 정보 항목만 setting 하여 List
	 * 
	 * 
	 */

	public void inout(); //입출금 등록
	/*
	 * 계좌번호 조회 : 이미 개설된 계좌인가? 아니면 거부
	 * 입금인가 출금인가?
	 * 		입금 :  금액입력 => 입력내용을 리스트에 추가
	 * 		출금 :  금액입력 => 출금할수 있나?(잔액>출금 ?) => 출금 내용 추가
	 * 				아니면 => 거부
	 * 
	 * 계좌번호에 해당하는 입출금 정보를 연산하여 현재 잔액을 계산
	 * 
	 * 
	 */
	public void printAccList(); // 계좌 리스트 출력
	
	public void saveAccList();
	public void loadAccList();
	
	
//	public AccDto getBuyer(String buId);
	
//	public void inputBuyer();

}
