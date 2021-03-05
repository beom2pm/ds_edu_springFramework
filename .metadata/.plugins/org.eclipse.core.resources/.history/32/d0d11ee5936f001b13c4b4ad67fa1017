package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dto.Board;

@Repository
public class DBOracleDAO implements DBDao {

	@Override
	public List<Board> boardList(SqlSessionTemplate session) {
		return session.selectList("BoardMapper.boardList");
	}

	@Override
	public Board selectByNum(SqlSessionTemplate session, int num) {
		return session.selectOne("BoardMapper.selectByNum",num);
	}

	@Override
	public int boardWrite(SqlSessionTemplate session, Board board) {
		return session.insert("BoardMapper.boardWrite",board);
	}

	@Override
	public int boardUpdate(SqlSessionTemplate session, Board board) {
		return session.update("BoardMapper.boardUpdate", board);
	}

	@Override
	public int boardDelete(SqlSessionTemplate session, int num) {
		return session.delete("BoardMapper.boardDelete",num);
	}

}
