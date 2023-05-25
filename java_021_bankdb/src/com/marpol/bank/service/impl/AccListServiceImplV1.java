package com.marpol.bank.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.marpol.bank.config.DBConnection;
import com.marpol.bank.models.AccListDto;
import com.marpol.bank.service.AccListService;

public class AccListServiceImplV1 implements AccListService {
	
	protected Connection dbConn;
	
	public AccListServiceImplV1() {
		 
		dbConn = DBConnection.getDBConn();
	
	}
	
	

	public List<AccListDto> selecAll() {
		return null;
	}

	
	
	
	
	
	
	public AccListDto findById(long seq) {
		return null;
	}

	
	
	
	
	
	
	public int insert(AccListDto dto) {
		
		String sql = 
				" INSERT INTO tbl_accList "
				+ " (aioseq, acnum, aiodate, aiotime, "
				+ " aiodiv, aioinput, aiooutput) "
				+ " VALUES(seq_accList.NEXTVAL, "
				+ " ?,?,?,?,?,?) ";
		
		
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.acNum);
			pStr.setString(2, dto.aioDate);
			pStr.setString(3, dto.aioTime);
			pStr.setString(4, dto.aioDiv);
			pStr.setInt(5, dto.aioInput);
			pStr.setInt(6, dto.aioOutput);
			
			// 쿼리 실행하는 method
			// SELECT : executeQuery(),
			// INSERT, UPDATE, DELETE : executeUpdate()
//			int result = 
			return pStr.executeUpdate();
//			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

	
	
	
	
	
	
	public List<AccListDto> findByDateDestance(String sDate, String eDate) {
		return null;
	}

	
	
	
	
	
	
	public List<AccListDto> findByAcNum(String acNum) {
		return null;
	}

	
	
	
	
	
	
	public List<AccListDto> findByAcNumAndDateDest(String acNum, String sDate, String eDate) {
		return null;
	}

	
	
	
	
	
	
	public int update(AccListDto dto) {
		return 0;
	}

	
	
	
	
	
	
	public int delete(long seq) {
		return 0;
	}
	

}
