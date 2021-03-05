package com.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DBDao;
import com.dto.Board;

// 2가지: DBDAO, SqlSessionTemplate
@Service
public class DBOracleService implements DBService {

	@Autowired // 생성이 되어야 주입받을 수 있음 - 빈태그 등록/ 컴포넌트스캔(반드시 마킹 필요)
	DBDao dao;
	  
	@Autowired
	SqlSessionTemplate session; //sqlsessiontemplate은 빈태그로 등록되어있기에 주입가능
	
	@Override
	public List<Board> boardList() {
		return dao.boardList(session);
	}

	@Override
	public Board selectByNum(int num) {
		return dao.selectByNum(session, num);
	}

	@Override
	public int boardWrite(Board board) {
		return dao.boardWrite(session, board);
	}

	@Override
	public int boardUpdate(Board board) {
		return dao.boardUpdate(session, board);
	}

	@Override
	public int boardDelete(int num) {
		return dao.boardDelete(session, num);
	}

}
