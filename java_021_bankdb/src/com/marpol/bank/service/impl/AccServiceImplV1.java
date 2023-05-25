package com.marpol.bank.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.marpol.bank.config.DBConnection;
import com.marpol.bank.config.DBContract;
import com.marpol.bank.models.AccDto;
import com.marpol.bank.service.AccService;

public class AccServiceImplV1 implements AccService {

	// DB 에 연결 session 구축하는 도구
	protected final Connection dbConn;

	public AccServiceImplV1() {
		// dbConn 도구를 이미 만들어둔 DBConnection 클래스 코드를
		// 사용하여 초기화 한다
		dbConn = DBConnection.getDBConn();
	}

	/*
	 * throws ... try...catch... 으로 처리를 해야하는 코드가 있을 경우 직접 처리하지 않고 이 method 를 호출한 곳으로
	 * exception 을 대리 처리하도록 하는 조치
	 */
	protected AccDto result2Dto(ResultSet result) throws SQLException {

		AccDto accDto = new AccDto();
		accDto.acNum = result.getString(DBContract.ACC.ACC_NUM);
		accDto.acDiv = result.getString(DBContract.ACC.ACC_DIV);
		accDto.acBuId = result.getString(DBContract.ACC.ACC_ID);
		// accDto.acBalance = result.getString(DBContract.ACC.ACC_BALANCE);

		// SELECT 된 데이터의 type 이 확실하게 숫자형(특히 정수형)인 경우
		// getInt() method 를 사용하여 직접 정수형으로 변환 후 받을 수 있ㄷ
		accDto.acBalance = result.getInt(DBContract.ACC.ACC_BALANCE);
		return accDto;

	}

	
	
	
	
	
	
	
	public List<AccDto> db2List(PreparedStatement pStr) throws SQLException {

		ResultSet result = pStr.executeQuery();
		List<AccDto> accList = new ArrayList<>();
		while (result.next()) {
			AccDto accDto = result2Dto(result);
			accList.add(accDto);
		}
		pStr.close();
		result.close();
		return accList;
	}

	
	
	
	
	
	
	
	
	
	
	public List<AccDto> selectAll() {

		String sql = " SELECT acNum, acDiv,acBuId,acBalance " 
						+ " FROM tbl_acc " 
						+ " ORDER BY acNum ";

		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			List<AccDto> accList = db2List(pStr);
			return accList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
	
	
	
	
	
	
	
	public AccDto findById(String acNum) {
		String sql = " SELECT acNum, acDiv,acBuId,acBalance " + " FROM tbl_acc " + " WHERE acNum = ? ";

		PreparedStatement pStr;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, acNum);
			
			ResultSet result = pStr.executeQuery();

			if (result.next()) {
				return result2Dto(result);
			}
			result.close();
			pStr.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	
	public List<AccDto> findByBuId(String acBuId) {

		String sql = " SELECT acNum, acDiv,acBuId,acBalance " 
				+ " FROM tbl_acc " 
				+ " WHERE acBuId = ? "
				+ " ORDER BY acNum ";
		
		PreparedStatement pStr;
		try {

			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, acBuId);
			List<AccDto> accList = db2List(pStr);
			return accList;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
	
	
	
	
	
	
	
	
	
	public int insert(AccDto dto) {
		
		String sql = " INSERT INTO tbl_acc(acBuId, acNum, acDiv, acBalance) " + " VALUES(?,?,?,?) ";

		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, dto.acBuId);
			pStr.setString(2, dto.acNum);
			pStr.setString(3, dto.acDiv);
			pStr.setInt(4, dto.acBalance);

			// sql 로 전달하는 명령대로 DB 를 변경(insert)하라 라는 의미
			int result = pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	
	
	
	
	
	
	
	/*
	 * 계좌정보 전체(또는 부분)을 업데이트 하는 method
	 * SQL 을 보면 전체 칼럼을 모두 업데이트 하고 있다.
	 * 
	 * 업데이트 method 를 호출하는 곳에서는 반드시 AccDto 객체를 잘 관리 해야 한다.
	 * 		변경할 칼럼의 데이터만 변경하고
	 * 		그렇지 않을(변경하지 않을) 칼럼은 원래 값을 그대로 유지
	 */
	public int update(AccDto dto) {
		
		String sql = " UPDATE tbl_acc SET  " 
				+ " acBuid = ?, "
				+ " acDiv = ?, "
				+ " acBalance = ? "
				+ " WHERE acNum = ? ";
		
		PreparedStatement pStr;
		try {
			pStr = dbConn.prepareStatement(sql);
			
			pStr.setString(1, dto.acBuId);
			pStr.setString(2, dto.acDiv);
			pStr.setInt(3, dto.acBalance);
			pStr.setString(4, dto.acNum);
			
			return pStr.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	
	
	
	
	
	
	
	public int delete(String acNum) {
		
		
		
		
		return 0;
	}
	
	
	
	
	
	
	public String maxAcNum(String date) {
		String sql = " SELECT substr(max(acNum),9) "
				+ " FROM tbl_acc "
				+ " WHERE  substr(acNum,0,8) = ? ";
		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			
			pStr.setString(1, date);
			
			ResultSet result = pStr.executeQuery();
			if(result.next()) {
				String maxNum = result.getString(1);
				if(maxNum == null) return "0";
				else return maxNum;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "0";
	}
	
	
	
	
	
	
	

}