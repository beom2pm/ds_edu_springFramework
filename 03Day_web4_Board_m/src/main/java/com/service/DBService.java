package com.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import com.dto.Board;

public interface DBService {

	public abstract List<Board> boardList();
	public abstract Board selectByNum( int num);
	public abstract int boardWrite( Board board);
	public abstract int boardUpdate( Board board);
	public abstract int boardDelete( int num);
}
