package com.marpol.books.service;

import java.util.List;

import com.marpol.books.models.AuthorDto;

public interface AuthorService {

	public void loadAuthor();
	public void printAuthorList();

	public AuthorDto getAuthor(String code);

	public List<AuthorDto> getAuthorList();

}
