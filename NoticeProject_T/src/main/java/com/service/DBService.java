package com.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.dto.Notice;

public interface DBService {

	public abstract List<Notice> noticeList();
	public abstract Notice selectByNo( int no);
	public abstract int noticeWrite(Notice board);
	public abstract int noticeUpdate(Notice board);
	public abstract int noticeDelete(int no);

}
