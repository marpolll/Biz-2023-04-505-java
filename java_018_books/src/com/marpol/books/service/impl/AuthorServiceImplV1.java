package com.marpol.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.marpol.books.config.DataIndex;
import com.marpol.books.config.Utils;
import com.marpol.books.models.AuthorDto;
import com.marpol.books.service.AuthorService;

public class AuthorServiceImplV1 implements AuthorService {

	protected List<AuthorDto> authorList;

	public AuthorServiceImplV1() {

		authorList = new ArrayList<>();

	}

	public void loadAuthor() {

		String authorFile = "src/com/marpol/books/data/저자정보(2023-05-11).txt";

		Scanner scan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(authorFile);
		} catch (FileNotFoundException e) {
			System.out.println(authorFile + "파일이 없습니다.");
			return;
		}
		scan = new Scanner(is);

		while (scan.hasNext()) {

			String[] author = scan.nextLine().split(",");

			AuthorDto aDto = new AuthorDto();
			aDto.setAuCode(author[DataIndex.AUTHOR.AUCODE]);
			aDto.setAuName(author[DataIndex.AUTHOR.AUNAME]);
			aDto.setAuTel(author[DataIndex.AUTHOR.AUTEL]);
			aDto.setAuAdd(author[DataIndex.AUTHOR.AUADD]);
					
			authorList.add(aDto);
		}
		scan.close();
	}

	public void printAuthorList() {
		
		System.out.println(Utils.dLine(100));
		System.out.println("코드\t저자\t번호\t주소");
		System.out.println(Utils.sLine(100));
		for (AuthorDto dto : authorList) {
			System.out.printf("%s\t", dto.getAuCode());
			System.out.printf("%s\t", dto.getAuName());
			System.out.printf("%s\t", dto.getAuTel());
			System.out.printf("%s\n", dto.getAuAdd());
			
		}
		System.out.println(Utils.dLine(100));
	}


	public AuthorDto getAuthor(String code) {
		for(AuthorDto dto : authorList) {
			if(authorList.isEmpty()) {
				this.loadAuthor();
			}
			if(dto.getAuCode().equals(code)) {
				return dto;
			}
		}
		return null;
	}

	public List<AuthorDto> getAuthorList() {
		
		if(authorList.isEmpty()) {
			this.loadAuthor();
		}
		return authorList;
	}

}
