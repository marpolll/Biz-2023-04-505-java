package com.marpol.classes;

import java.util.List;

/*
 * ClassE 는 2개의 생성자 method 를 가지고 있다.
 * 한개는 매개변수가 없는 생성자 = 기본생성자
 * 한개는 strList 매개변수를 가지고 있으며,
 *        this.strList 를 초기화 시키는 코드가 있다.
 * = 임의 생성자 
 */
public class ClassE {
	
	private List<String> strList;
	
	// 기본 생성자
	// 클래스의 임의생성자를 만들게 되면, 기본생성자가 자동으로 만들어지지 않는다.
	// 
	public ClassE() {
		
	}
	
	// 임의 생성자
	public ClassE(List<String> strList) {
		this.strList = strList;
	}
	
	public void printList() {
		System.out.println(strList.toString());
	}

}
