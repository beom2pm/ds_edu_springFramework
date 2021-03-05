package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.DeptOracleDAO;
import com.dto.Dept;

public class DeptService {
	DeptOracleDAO dao;
	
	public void setDao(DeptOracleDAO dao) {
		this.dao = dao;
	}

	
	//MyBatis에 제공하는 SqlSession 얻는다.
	public int delete(int n) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num = 0;
		try {
			num = dao.delete(session, n);
			session.commit();
		}finally {
			session.close();
		}
		return num;
	}
	
	public int delete(String dname) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num = 0;
		try {
			//DAO 연동 코드 구현
			num = dao.delete(session, dname);
			session.commit();
		}finally {
			session.close();
		}
		
		return num;
	}
	
	public int insert(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num = 0;
		try {
			num = dao.insert(session, dept);
			session.commit();
		}finally {
			session.close();
		}
		return num;
	}
	
	public int update(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSession();
		int num = 0;
		try {
			num = dao.update(session, dept);
			session.commit();
			
		}finally {
			session.close();
		}
		return num;
	}

	public Dept selectByDeptno(int deptno) {
		SqlSession session = MySqlSessionFactory.getSession();
		Dept dept = null;
		try {
			dept = dao.selectByDeptno(session, deptno);
			//dml과 관련이 없어서 커밋을 안함
		}finally {
			session.close();
		}
		return dept;
	}
	
	public List<Dept> selectAll(){
		SqlSession session = MySqlSessionFactory.getSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		}finally {
			session.close();
		}
		return list;
	}
	
	
	
	
}