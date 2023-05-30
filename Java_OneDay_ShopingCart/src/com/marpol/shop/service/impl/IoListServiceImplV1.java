package com.marpol.shop.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.marpol.shop.config.DBConnection;
import com.marpol.shop.config.DBContract;
import com.marpol.shop.models.IoListDto;
import com.marpol.shop.service.IoListService;

public class IoListServiceImplV1 implements IoListService {

	protected final Connection dbConn;

	public IoListServiceImplV1() {
		dbConn = DBConnection.getDBConn();
	}
	
	protected IoListDto result2Dto(ResultSet result) {
		try {
			IoListDto ioListDto = new IoListDto();
			ioListDto.ioSEQ = result.getInt(DBContract.IOLIST.IOSEQ);
			ioListDto.ioDate = result.getString(DBContract.IOLIST.IODATE);
			ioListDto.ioTime = result.getString(DBContract.IOLIST.IOTIME);
			ioListDto.ioBuId = result.getString(DBContract.IOLIST.IOBUID);
			ioListDto.ioPCode = result.getString(DBContract.IOLIST.IOPCODE);
			ioListDto.ioQuan = result.getInt(DBContract.IOLIST.IOQUAN);
			ioListDto.ioPrice = result.getInt(DBContract.IOLIST.IOPRICE);
			
			return ioListDto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	public List<IoListDto> selecAll() {
		
		
		List<IoListDto> ioList = new ArrayList<>();
		
		String sql = " SELECT iodate, iotime, buid, buname, butel, pcode, pname, poprice, ioquan " 
		+ " FROM tbl_iolist , tbl_buyer , tbl_product "
		+ " WHERE iobuid = buid " ;

		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			while(result.next()) {
				IoListDto ioListDto = result2Dto(result);
				ioList.add(ioListDto);
			}
			return ioList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}


	public int insert(IoListDto dto) {
		
		String sql = " INSERT INTO tbl_iolist(ioseq, iodate, iotime, iobuid, iopcode, ioquan, ioprice) "
				+ " VALUES(seq_buyer.NEXTVAL,?,?,?,?,?,?) ";

				try {
					PreparedStatement pStr = dbConn.prepareStatement(sql);
					pStr.setString(1, dto.ioDate);
					pStr.setString(2, dto.ioTime);
					pStr.setString(3, dto.ioBuId);
					pStr.setString(4, dto.ioPCode);
					pStr.setInt(5, dto.ioQuan);
					pStr.setInt(6, dto.ioPrice);
					int result = pStr.executeUpdate();
					return result;
				} catch (SQLException e) {
					e.printStackTrace();
				}
		return 0;
	}

	public List<IoListDto> findByBuId(String ioBuId) {
		
		List<IoListDto> ioList = new ArrayList<>();
		
		String sql = 
				" SELECT ioseq, iodate, iotime, iobuid, iopcode, ioquan, ioprice "
				+ " FROM tbl_iolist "
				+ " WHERE iobuid = ? ";
		
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, ioBuId);
			ResultSet result = pStr.executeQuery();
			while(result.next()) {
				IoListDto ioListDto = result2Dto(result);
				ioList.add(ioListDto);
			}
			return ioList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public List<IoListDto> findByDateDestance(String sDate, String eDate) {
		
		List<IoListDto> ioList = new ArrayList<>();
		
		String sql = 
				" SELECT * FROM tbl_iolist "
				+ " WHERE iodate BETWEEN " 
				+ "? AND ? "; 
		
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, sDate);
			pStr.setString(2, eDate);
			ResultSet result = pStr.executeQuery();
			while(result.next()) {
				IoListDto ioListDto = result2Dto(result);
				ioList.add(ioListDto);
			}
			return ioList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
