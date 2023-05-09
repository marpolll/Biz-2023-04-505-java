package com.marpol.classes.exec;

import com.marpol.classes.models.StdData;

public class ExecE {

	public static void main(String[] args) {
		
		// StdData 클래스의 student  변수는 static 키워드로 선언되어 있기 때문에
		// 객체를 생성하여 객체를 통해 접근하지 않아도 된다.
		// 대신 클래스를 통해 Dot(.) 연산자로 변수에 직접 접근이 가능하다.
		StdData stdData = new StdData();
		System.out.println(stdData.student);
		
		
		for(int i = 0 ; i < StdData.student.length; i++) {
			System.out.println(StdData.student[i]);
		}
		
		// StdData 클래스에 정의된 student 변수(field)는 final 키워드가
		// 선언되어 있다. 따라서 student 변수는 다시 제 정의 할수 없다.
		// StdData.student = new String[10];
		
		// 아래 변수는 값이 바뀔때마다 전에거가 사라지고 다시 20 , 30 개 만든다.
		String[] str = new String[10];
		str = new String[20];
		str = new String[30];
		
	}
	
}
