package com.marpol.books;

import com.marpol.books.service.impl.BookServiceImplV1;

public class BookExecC {
	
	public static void main(String[] args) {
		
		BookServiceImplV1 bookService = new BookServiceImplV1();
		
		bookService.loadBook();
		bookService.printBookList();
	}
}
