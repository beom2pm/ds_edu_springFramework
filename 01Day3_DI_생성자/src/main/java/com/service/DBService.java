package com.service;

public class DBService {
	
	//변수, property
	public String name;

	public DBService() {
	}

	//생성ㅇ자 주입
	public DBService(String x) {
		System.out.println("DBService 생성자~~~~");
		this.name = x;
	}
	
	

}
