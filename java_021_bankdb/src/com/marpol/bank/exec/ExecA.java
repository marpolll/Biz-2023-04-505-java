package com.marpol.bank.exec;

import java.util.List;

import com.marpol.bank.config.DBConnection;
import com.marpol.bank.models.BuyerDto;

public class ExecA {

	public static void main(String[] args) {
		
		// SqlSession 을 자동으로 생성할 객체 가져오기
		SqlSessionFactory sessionaFactory = DBConnection.getSessionFactory();
		
		// SqlSession 정보 추출하기
		// openSession(true) : true 를 설정하면 자동으로 COMMIT 이 일어난다.
		SqlSession sqlSession = sessionFactory.openSession(true);
		
		// Mybatis 양 BuyerDao 인터페이스를 참조하여
		// Query 를 실행할 method 를 만들어 달라
		BuyerDao buyerDao = sqlSession.getMapper(BuyerDao.class);
		
		List<BuyerDto> buyerList = buyerDao.selectAll();
//		System.out.println(buyerList.toString());
		
		for (BuyerDto dto : buyerList) {
			System.out.println(dto.toString());
		}
		
	}
}
