package com.service;

public class MyService {
	
	
	public String name;
	public int age;

	public MyService() {
	}

	public MyService(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		System.out.println("setName 메서드");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("setAge 메서드");
		this.age = age;
	}

	

	
	
	

}
