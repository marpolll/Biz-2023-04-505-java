package com.marpol.classes;

import java.util.ArrayList;

import java.util.List;

import com.marpol.models.AnimalDto;

public class ExecE {
	
	public static void main(String[] args) {
		AnimalDto animalDto1 = new AnimalDto();
		AnimalDto animalDto2 = new AnimalDto();
		AnimalDto animalDto3 = new AnimalDto();
		
		List<AnimalDto> animalList = new ArrayList<>();
		
		animalDto1 = new AnimalDto ("럭키", "허스키", 5);
		animalDto2 = new AnimalDto ("나비", "버밀라", 7);
		animalDto3 = new AnimalDto ("몽", "스피츠", 7);
		animalList.add(animalDto1);
		animalList.add(animalDto2);
		animalList.add(animalDto3);
		
		System.out.println(animalList.toString());
		
	}

}
