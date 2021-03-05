package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dto.Dept;

@Repository("oracle")
public class DBOracleDAO implements DBDao {

	@Override
	public List<Dept> list(SqlSessionTemplate session) {
		List<Dept> list = session.selectList("DeptMapper.selectAll");
		return list;
	}

	@Override
	public int insert(SqlSessionTemplate session, Dept dto) {
		return session.insert("DeptMapper.insert",dto);
	}

	@Override
	public int deleteByDeptno(SqlSessionTemplate session, int deptno) {
		
		return session.delete("DeptMapper.deleteByDeptno",deptno);
	}

	@Override
	public int update(SqlSessionTemplate session, Dept dto) {
		
		return session.update("DeptMapper.update", dto);
	}


}
