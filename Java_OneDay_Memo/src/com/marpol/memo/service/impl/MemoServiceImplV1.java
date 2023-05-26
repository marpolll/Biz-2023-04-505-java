package com.marpol.memo.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.marpol.memo.config.DBConnection;
import com.marpol.memo.config.DBContract;
import com.marpol.memo.models.MemoDto;
import com.marpol.memo.service.MemoService;

public class MemoServiceImplV1 implements MemoService {

	protected Connection dbConn;

	public MemoServiceImplV1() {

		dbConn = DBConnection.getDBConn();

	}

	protected MemoDto result2Dto(ResultSet result) throws SQLException {

		MemoDto memoDto = new MemoDto();
		memoDto.mseq = result.getInt(DBContract.MEMO.SEQ);
		memoDto.mwriter = result.getString(DBContract.MEMO.WRITER);
		memoDto.mdate = result.getString(DBContract.MEMO.DATE);
		memoDto.msubject = result.getString(DBContract.MEMO.SUBJECT);
		memoDto.mcontent = result.getString(DBContract.MEMO.CONTENT);

		return memoDto;

	}

	public List<MemoDto> db2List(PreparedStatement pStr) throws SQLException {

		ResultSet result = pStr.executeQuery();
		List<MemoDto> memoList = new ArrayList<>();
		while (result.next()) {
			MemoDto memoDto = result2Dto(result);
			memoList.add(memoDto);
		}
		pStr.close();
		result.close();
		return memoList;
	}

	public List<MemoDto> selecAll() {

		String sql = " SELECT m_seq, m_writer, m_date, m_subject, m_content " + " FROM tbl_memo " + " ORDER BY m_seq ";

		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			
			List<MemoDto> accList = db2List(pStr);
			return accList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public MemoDto findById(int seq) {

		String sql = " SELECT m_seq, m_writer, m_date, m_subject, m_content " + " FROM tbl_memo " + " WHERE m_seq = ? ";

		PreparedStatement pStr;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setInt(1, seq);

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

	public List<MemoDto> findByMWriter(String mWriter) {

		String sql = " SELECT m_seq, m_writer, m_date, m_subject, m_content " + " FROM tbl_memo "
				+ " WHERE m_writer = ? " + " ORDER BY m_seq ";

		PreparedStatement pStr;
		try {

			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, mWriter);
			List<MemoDto> accList = db2List(pStr);
			return accList;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public int insert(MemoDto dto) {

		String sql = " INSERT INTO tbl_memo(m_seq, m_writer, m_date, m_subject, m_content) " + " VALUES(?,?,?,?,?) ";

		try {
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			pStr.setInt(1, dto.mseq);
			pStr.setString(2, dto.mwriter);
			pStr.setString(3, dto.mdate);
			pStr.setString(4, dto.msubject);
			pStr.setString(5, dto.mcontent);

			// sql 로 전달하는 명령대로 DB 를 변경(insert)하라 라는 의미
			int result = pStr.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int update(MemoDto dto) {

		String sql = " UPDATE tbl_memo SET  " + " m_writer = ?, " + " m_date = ?, " + " m_subject = ? "
				+ " m_content = ? " + " WHERE m_seq = ? ";

		PreparedStatement pStr;
		try {
			pStr = dbConn.prepareStatement(sql);

			pStr.setString(1, dto.mwriter);
			pStr.setString(2, dto.mdate);
			pStr.setString(3, dto.msubject);
			pStr.setString(4, dto.mcontent);
			pStr.setInt(5, dto.mseq);

			return pStr.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int delete(int seq) {

		String sql = " DELETE FROM tbl_memo " + " WHERE m_seq = ? ";
		try {
			PreparedStatement pst = dbConn.prepareStatement(sql);
			pst.setInt(1, seq);
			int result = pst.executeUpdate();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public String maxMseq(String seq) {
		// TODO Auto-generated method stub
		return null;
	}

}
