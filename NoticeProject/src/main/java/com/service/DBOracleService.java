package com.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DBDao;
import com.dto.Notice;
@Service
public class DBOracleService implements DBService {

	@Autowired
	DBDao dao;
	
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public List<Notice> noticeList() {
		return dao.noticeList(session);
	}

	@Override
	public Notice selectByNo(int no) {
		return dao.selectByNo(session, no);
	}

	@Override
	public int noticeWrite(Notice board) {
		return dao.noticeWrite(session, board);
	}

	@Override
	public int noticeUpdate(Notice board) {
		return dao.noticeUpdate(session, board);
	}

	@Override
	public int noticeDelete(int no) {
		return dao.noticeDelete(session, no);
	}

}
