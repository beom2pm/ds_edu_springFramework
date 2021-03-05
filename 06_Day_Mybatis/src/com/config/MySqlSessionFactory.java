package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//mybatis 를 자바쪽으로 인식할 수 있도록 돕는것
public class MySqlSessionFactory {
	static SqlSessionFactory sqlSessionFactory;
	static {
		String resource = "com/config/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory =
		new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	//임의의 클래스에서 MySqlSessionFactory.getSession() 호출해서 sqlSession 리턴받아 사용
	//반환된 것을 가지고 디비 연동
	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}

}
