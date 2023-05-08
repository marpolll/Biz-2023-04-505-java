package com.marpol.classes;

import java.util.ArrayList;
import java.util.List;

import com.marpol.models.AnimalDto;
import com.marpol.models.StudentDto;

public class ExecE {
	
	public static void main(String[] args) {
		AnimalDto animalDto = new AnimalDto();
		
		animalDto.setAnName("럭키");
		animalDto.setAnKind("허스키");
		animalDto.setAnAge(5);
		
		animalDto.setAnName("나비");
		animalDto.setAnKind("버밀라");
		animalDto.setAnAge(7);
		
		animalDto.setAnName("몽");
		animalDto.setAnKind("스피츠");
		animalDto.setAnAge(7);
		
//		List<AnimalDto> animalList = new ArrayList<>();
//		animalList.add(animalList);
//		stDto = new StudentDto("0002", "이몽룡", "전자", 2, "010-111-1111");
//		stList.add(stDto);
//		
//		System.out.println(stList.toString());
		
	}

}
