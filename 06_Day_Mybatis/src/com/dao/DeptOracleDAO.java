package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class DeptOracleDAO {

	public int delete(SqlSession session, int n) {
		int num = session.delete("DeptMapper.deleteByDeptno", n);
		return num;
	}
	
	public int delete(SqlSession session, String dname) {
		int num = session.delete("DeptMapper.deleteByDname", dname);
		return num;
	}

	public int insert(SqlSession session, Dept dept) {
		int num = session.insert("DeptMapper.insert",dept);
		return num;
	}
	
	public int update(SqlSession session, Dept dept) {
		int num = session.update("DeptMapper.update",dept);
		return num;
	}
	
	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept x = session.selectOne("DeptMapper.selectByDeptno", deptno);
		return x;
	}
	
	public List<Dept> selectAll(SqlSession session) {
		List<Dept> list = session.selectList("DeptMapper.selectAll");
		return list;
	}
	
}
