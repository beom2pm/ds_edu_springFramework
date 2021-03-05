package com.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.DBDao;
import com.dto.Dept;

@Service("myService")
public class DBOracleService implements DBService{

	@Autowired
	@Qualifier("mysql")
	DBDao dao;
	
	@Autowired
	SqlSessionTemplate session;
	
	
	public void setDao(DBDao dao) {
		this.dao = dao;
	}

	
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}

	@Override
	public List<Dept> list() {
		return dao.list(session);
	}

	@Override
	public int insert(Dept dto) {
		
		return dao.insert(session, dto); //auto commit
	}

	@Override
	public int deleteByDeptno(int deptno) {
		
		return dao.deleteByDeptno(session, deptno);
	}

	@Override
	public int update(Dept dto) {
		return dao.update(session, dto);
	}

}
