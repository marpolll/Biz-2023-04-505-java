package com.marpol.classes;

import java.util.ArrayList;
import java.util.List;

public class ExecC {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("우리나라만세");
		strList.add("대한민국");
		strList.add("Republic of korea");

		// 기본 생성자로 객체 초기화
		ClassE classE1 = new ClassE();
		
		// 임의 생성자로 객체 초기화
		ClassE classE = new ClassE(strList);
		classE.printList();

	}

}
