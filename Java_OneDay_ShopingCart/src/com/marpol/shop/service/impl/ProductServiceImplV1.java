package com.marpol.shop.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.marpol.shop.config.DBConnection;
import com.marpol.shop.config.DBContract;
import com.marpol.shop.models.BuyerDto;
import com.marpol.shop.models.ProductDto;
import com.marpol.shop.service.ProductService;

public class ProductServiceImplV1 implements ProductService {
	
	protected final Connection dbConn;
	
	public ProductServiceImplV1() {
		
		dbConn = DBConnection.getDBConn();
		
	}
	
	protected ProductDto result2Dto(ResultSet result) {
		try {
			ProductDto productDto = new ProductDto();
			productDto.pCode = result.getNString(DBContract.PRODUCT.PCODE);
			productDto.pName = result.getString(DBContract.PRODUCT.PNAME);
			productDto.pItem = result.getString(DBContract.PRODUCT.PITEM);
			productDto.pIPrice = result.getInt(DBContract.PRODUCT.PIPRICE);
			productDto.pOPrice = result.getInt(DBContract.PRODUCT.POPRICE);
			
			return productDto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<ProductDto> selectAll() {
		
		List<ProductDto> productList = new ArrayList<>();
		String sql = 
				" SELECT "
				+ " pcode, pname, pitem, piprice, poprice "
				+ " FROM tbl_product "
				+ " ORDER BY pcode ";
		
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			while(result.next()) {
				ProductDto productDto = result2Dto(result);
				productList.add(productDto);
			}
			return productList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}


	public int insert(ProductDto dto) {
		
		String sql = " INSERT INTO tbl_product(pcode, pname, pitem, piprice, poprice) "
				+ " VALUES(?,?,?,?,?) ";

				try {
					PreparedStatement pStr = dbConn.prepareStatement(sql);
					pStr.setString(1, dto.pCode);
					pStr.setString(2, dto.pName);
					pStr.setString(3, dto.pItem);
					pStr.setInt(4, dto.pIPrice);
					pStr.setInt(5, dto.pOPrice);
					
					int result = pStr.executeUpdate();
					return result;
				} catch (SQLException e) {
					e.printStackTrace();
				}
		return 0;
	}

	public int update(ProductDto dto) {
		
		String sql = " UPDATE tbl_product "
				+" SET pname = ? ,"
				+" pitem =  ? ,"
			    +" piprice = ? ,"
			    +" poprice = ? ,"
			    +" WHERE pcode = ? ";
		
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.pName);
			pStr.setString(2, dto.pItem);
			pStr.setInt(3, dto.pIPrice);
			pStr.setInt(4, dto.pOPrice);
			pStr.setString(5, dto.pCode);
			return pStr.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}


}
