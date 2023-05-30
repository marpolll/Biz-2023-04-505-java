package com.marpol.shop.service;

import java.util.List;

import com.marpol.shop.models.ProductDto;


public interface ProductService {
	
		public List<ProductDto> selectAll();
		
		public int insert(ProductDto dto);
		
		public int update(ProductDto dto);
		

}
