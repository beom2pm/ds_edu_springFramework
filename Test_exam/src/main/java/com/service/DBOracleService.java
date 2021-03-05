package com.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DBDao;
import com.dto.Board;

@Service
public class DBOracleService implements DBService {

	@Autowired
	DBDao dao;
	
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public List<Board> boardList() {
		return dao.boardList(session);
	}

	@Override
	public Board selectByNum(int num) {
		// TODO Auto-generated method stub
		return dao.selectByNum(session, num);
	}

	@Override
	public int boardWrite(Board board) {
		// TODO Auto-generated method stub
		return dao.boardWrite(session, board);
	}

	@Override
	public int boardUpdate(Board board) {
		// TODO Auto-generated method stub
		return dao.boardUpdate(session, board);
	}

	@Override
	public int boardDelete(int num) {
		// TODO Auto-generated method stub
		return dao.boardDelete(session, num);
	}

}
