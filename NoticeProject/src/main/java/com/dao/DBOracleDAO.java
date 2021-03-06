package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dto.Notice;
@Repository
public class DBOracleDAO implements DBDao {

	@Override
	public List<Notice> noticeList(SqlSessionTemplate session) {
		return session.selectList("NoticeMapper.noticeList");
	}

	@Override
	public Notice selectByNo(SqlSessionTemplate session, int no) {
		int num = session.update("NoticeMapper.readcntUpdate",no);
		
		return session.selectOne("NoticeMapper.selectByNo",no);
	}

	@Override
	public int noticeWrite(SqlSessionTemplate session, Notice board) {
		return session.insert("NoticeMapper.noticeWrite",board);
	}

	@Override
	public int noticeUpdate(SqlSessionTemplate session, Notice board) {
		return session.update("NoticeMapper.noticeUpdate",board);
	}

	@Override
	public int noticeDelete(SqlSessionTemplate session, int no) {
		return session.delete("NoticeMapper.noticeDelete",no);
	}

}
