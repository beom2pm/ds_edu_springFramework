package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.dto.Notice;

public interface DBDao {
	public abstract List<Notice> noticeList(SqlSessionTemplate session);
	public abstract Notice selectByNo(SqlSessionTemplate session, int no);
	public abstract int noticeWrite(SqlSessionTemplate session, Notice board);
	public abstract int noticeUpdate(SqlSessionTemplate session, Notice board);
	public abstract int noticeDelete(SqlSessionTemplate session, int no);

}
