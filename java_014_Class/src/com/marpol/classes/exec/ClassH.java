package com.marpol.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassH {

	public static void main(String[] args) {
		// Java 1.7 이후 번전에서는 생성자에는 Generic 을 생략해도 된다.
		List<Integer> numList = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			numList.add(rndNum);
		}
		
		for (int out = 0; out < numList.size(); out++) {
			for (int in = out + 1; in < numList.size(); in++) {
				if (numList.get(out) > numList.get(in)) {
					int _tmp = numList.get(in);
					numList.set(in ,numList.get(out));
					numList.set(out, _tmp);
				}
			}
		}
		// List type 의 객체변수에는 toString() method 가 포함되고
		// 단순히 List 의 값들을 출력 해 볼 수 있다.
		System.out.println(numList.toString());
		
		for (int i = 0; i < numList.size(); i++) {
			System.out.print(+ numList.get(i) + "\t");
		}
	}
}
