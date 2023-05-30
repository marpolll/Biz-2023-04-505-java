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
import com.marpol.shop.models.IoListDto;
import com.marpol.shop.service.BuyerService;

public class BuyerServiceImplV1 implements BuyerService{
	
	protected final Connection dbConn;
	
	public BuyerServiceImplV1() {
		
		dbConn = DBConnection.getDBConn();
		
	}

	protected BuyerDto result2Dto(ResultSet result) {
		try {
			BuyerDto buyerDto = new BuyerDto();
			buyerDto.buId = result.getNString(DBContract.BUYER.BUID);
			buyerDto.buName = result.getString(DBContract.BUYER.BUNAME);
			buyerDto.buTel = result.getString(DBContract.BUYER.BUTEL);
			buyerDto.buAddr = result.getString(DBContract.BUYER.BUADDR);
			return buyerDto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<BuyerDto> selectAll() {
		
		List<BuyerDto> buyerList = new ArrayList<>();
		String sql = 
				" SELECT "
				+ " buid, buname, butel, buaddr "
				+ " FROM tbl_buyer "
				+ " ORDER BY buname ";
		
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			while(result.next()) {
				BuyerDto buyerDto = result2Dto(result);
				buyerList.add(buyerDto);
			}
			return buyerList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public int insert(BuyerDto dto) {
		
		String sql = " INSERT INTO tbl_buyer(buid, buname, butel, buaddr) "
		+ " VALUES(seq_buyer.NEXTVAL,?,?,?) ";

		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.buName);
			pStr.setString(2, dto.buTel);
			pStr.setString(3, dto.buAddr);
			
			int result = pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	public List<BuyerDto> findById(String id) {
		
		List<BuyerDto> buyerList = new ArrayList<>();
		
		String sql = " SELECT buid, buname, butel, buaddr " 
		+ " FROM tbl_buyer " 
		+ " WHERE buid = ? ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, id);
			ResultSet result = pStr.executeQuery();
			while (result.next()) {
				BuyerDto buyerDto = result2Dto(result);
				buyerList.add(buyerDto);
			}
			return buyerList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public List<BuyerDto> findByName(String name) {
		
		List<BuyerDto> buyerList = new ArrayList<>();
		
		String sql = " SELECT buid, buname, butel, buaddr " 
		+ " FROM tbl_buyer "
		+ " WHERE buname LIKE '%' || ? || '%' ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, name);
			ResultSet result = pStr.executeQuery();
			while (result.next()) {
				BuyerDto buyerDto = result2Dto(result);
				buyerList.add(buyerDto);
			}
			return buyerList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public int update(BuyerDto dto) {
		
		String sql = " UPDATE TBL_buyer " 
		+ " SET buname = ?, " 
		+ " butel = ?, " 
		+ " buaddr = ? "
		+ " WHERE buid = ? ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.buName);
			pStr.setString(2, dto.buTel);
			pStr.setString(3, dto.buAddr);
			pStr.setString(4, dto.buId);
			int result = pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	public String maxId() {
		
		String sql = " SELECT buid " + " FROM tbl_buyer ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			if (result.next()) {
				String maxNum = result.getString(1);
				if (maxNum == null) return "0";
				else return maxNum;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
