package com.marpol.books;

import com.marpol.books.service.BookService;
import com.marpol.books.service.impl.BookServiceImplV2;

public class BookExecD {

	public static void main(String[] args) {

		BookService bookService = new BookServiceImplV2();

		bookService.loadBook();
		bookService.printBookList();
		
	}
}
