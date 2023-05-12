package com.marpol.publisher;

import com.marpol.books.models.PublisherDto;
import com.marpol.books.service.PublisherService;
import com.marpol.books.service.impl.PublisherServiceImplV1;

public class PublisherExecA {
	public static void main(String[] args) {

		PublisherService pubSer = new PublisherServiceImplV1();

		pubSer.loadPublisher();
		pubSer.printPublisherList();
		PublisherDto puDto = pubSer.getPublisherListByName("");
		System.out.println(puDto.toString());
		
	}
}
