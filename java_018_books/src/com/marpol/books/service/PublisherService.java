package com.marpol.books.service;

import com.marpol.books.models.PublisherDto;

public interface PublisherService {
	
	public void loadPublisher(); 
		
	public void printPublisherList(); 
	
	public PublisherDto getPublisherListByName(String name); 
		
}
