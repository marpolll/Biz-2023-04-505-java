package com.marpol.classes.exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.marpol.classes.models.StdData;

public class ExecF {

	public static void main(String[] args) {

		// 배열의 크기와 index 값을 알고 있을떄,
		// 또는 배열의 일부 요소만 사용하고 싶을때
		for (int i = 0; i < StdData.student.length; i++) {
			System.out.println(StdData.student[i]);
		}

		// index 0 부터 4번까지 데이터만 사용하고 싶을때
		for (int i = 0; i < 5; i++) {
			System.out.println(StdData.student[i]);
		}

		// 배열의 크기와 index 를 모르거나 몰라도 될때
		// 전체 배열의 요소를 사용하고 싶을때
		for (String str : StdData.student) {
			System.out.println(str);
		}
		
		// String List type 의 studentList 객체를 선언하고
		// StdData.student 배열의 요소를 사용하여
		// studentList 객체에 데이터를 채워넣어라
		List<String> studentList = Arrays.asList(StdData.student);
		studentList = new ArrayList<>(Arrays.asList(StdData.student));
		
		for (String str : studentList) {
			System.out.println(str);
		}
		
		/*  배열               |            List
		 * ===========================================================
		 * 처음에 개수를 지정  | 처음에 type 을 지정
		 * new String[10]      | List<String>
		 *                     | size() 가 0인 상태로 시작한다.
		 *                     |
		 * 개수범위내의 index  | 필요에 따라 List 에 add() 를 실행하여 
		 * 위치 요소에 값 저장 | 데이터를 추가한다.
		 * str[3] = "Korea"    |
		 *                     |
		 * 개수번위내의 index  | List 의 get(index) method 를 통하여
		 * 위치 요소로 부터    | 데이터를 읽을 수 있다.
		 * 값을 읽을수 있다.   |
		 * println(str[0])     | 특정 index 요소의 값을 변경할떄는
		 *                     | List 의 set(index) method 를 통하여
		 *                     | 값을 변경할 수 있다.
		 *                     |
		 * 배열은 코드가 실행  | List 는 필요에 따라 size() 가 변경 할수 있다.
		 * 되는 도중에         |
		 * 크기를 변경 불가    |     
		 *                     |
		 *                     | remove(index) method 를 통해서
		 *                     | index 위치의 item 을 제거할 수 있다.         
		 *          
		 */
		
	}
}










