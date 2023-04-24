package com.marpol.classes.exec;

import com.marpol.classes.module.MyClassB_static없는경우;

public class ExecF_myclassB {

	public static void main(String[] args) {
		
		/*
		 * 개발자(우리) 가 생성한 MyClassB 클래스가
		 * 변수를 선언하는 키워드가 되었다.
		 * Java에서 기본적으로 제공하는 키워드 외에
		 * 개발자가 생성한 클래스로 변수를 선언하는
		 * 키워드가 된다.
		 * 
		 */
		
		MyClassB_static없는경우 myB = new MyClassB_static없는경우();
		System.out.println(myB.add(30,40));
		System.out.println(myB.add(30.0f,40.0f));
		System.out.println(myB.add("대한","민국"));
		
	}
}
