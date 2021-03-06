package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.User;

@Controller
public class MainController {

	//main.jsp가 없으니 에러남
	@RequestMapping("/main")
	public User main() {
		User user = new User("hong","1245");
		return user;
	}
	
	@RequestMapping("/main2")
	@ResponseBody   // -> 덕분에 user를 모델로 보지 않음
	public User main2() {
		User user = new User("hong","1245");
		return user;
	}
	
	@RequestMapping("/main3")
	@ResponseBody
	public ArrayList<User> main3() {
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("hong","23"));
		list.add(new User("jenny","123"));
		return list;
	}
}
