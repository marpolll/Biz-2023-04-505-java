package com.marpol.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.marpol.books.models.BookDto;
import com.marpol.books.service.BookService;

public class BookServiceImplV1 implements BookService {

	private List<BookDto> bookList;
	
	public BookServiceImplV1() {
		bookList = new ArrayList<>();
	}
	
	public void loadBook() {
		
		String bookFile = "src/com/marpol/books/data/도서정보(2023-05-11).txt";

		Scanner scan = null;

		InputStream is = null;
		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			System.out.println(bookFile + "파일이 없습니다.");
			return;
		}
		scan = new Scanner(is);
		
		while(scan.hasNext()) {
			String Line = scan.nextLine();
			String[] book = Line.split(",");
			BookDto stDto = new BookDto();	
			
			stDto.setbIsbn(book[0]);
			stDto.setbTitle(book[1]);
			stDto.setbPublisher(book[2]);
			stDto.setbAuthor(book[3]);
			stDto.setbPublisnData(book[4]);
			stDto.setbpages(Integer.valueOf(book[5])); 
			stDto.setbPrice(Integer.valueOf(book[6]));
			
			bookList.add(stDto);
			
		}
		scan.close();

		
	}

	public void printBookList() {
		
		System.out.println("=".repeat(100));
		System.out.print("ISBN\t도서명\t출판사\t저장\t발행일\t페이지\t가격\n");
		System.out.println("-".repeat(100));
		for(int i = 0 ; i < bookList.size() ; i ++) {
			System.out.print(bookList.get(i).getbIsbn() + "\t");
			System.out.print(bookList.get(i).getbTitle() + "\t");
			System.out.print(bookList.get(i).getbPublisher() + "\t");
			System.out.print(bookList.get(i).getbAuthor() + "\t");
			System.out.print(bookList.get(i).getbPublisnData() + "\t");
			System.out.print(bookList.get(i).getbpages() + "\t");
			System.out.print(bookList.get(i).getbPrice() + "\n");
		}
		
		System.out.println("=".repeat(100));
	}

	@Override
	public BookDto getBook(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> getBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updataBook(BookDto bookDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub
		
	}

}
