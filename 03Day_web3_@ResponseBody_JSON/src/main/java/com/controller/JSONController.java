package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.User;

@RestController  //@Controller + @ResponseBody 가 혼합됨
public class JSONController {

	
	@RequestMapping("/home")
	public User main2() {
		User user = new User("lisa","1245");
		return user;
	}
	
	@RequestMapping("/home2")
	public ArrayList<User> main3() {
		
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("hong","23"));
		list.add(new User("jenny","123"));
		
		return list;
	}
}
