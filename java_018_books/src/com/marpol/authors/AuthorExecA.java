package com.marpol.authors;

import java.util.ArrayList;
import java.util.List;

import com.marpol.books.models.AuthorDto;
import com.marpol.books.service.AuthorService;
import com.marpol.books.service.impl.AuthorServiceImplV1;

public class AuthorExecA {
	
	
	public static void main(String[] args) {
		
		AuthorService auService = new AuthorServiceImplV1();
		
		auService.loadAuthor();
		auService.printAuthorList();
		AuthorDto auDto = auService.getAuthor("A0034");
		System.out.println(auDto);
		
		
	}

}
