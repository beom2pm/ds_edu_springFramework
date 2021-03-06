package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.User;

/*
 * 경로지정
 * 
 * 1. 절대경로
 *   ===> / 로시작
 *   ===> /위치는 9000 바로 뒤에 오는 /를 의미
 *   ==> 가독성은 좋지만 바꿀 때 다 바꿔야하는 단점이 있음

 * 2. 상대경로
 *   ===> 로 시작안함
 *   ===> 현재경로를 기준으로 함
 *
 */
@Controller
public class LoginController {

	@RequestMapping("/loginForm")
	public String loginForm() {
		System.out.println("loginForm");
		return "loginForm"; // WEB-INF/views/loginForm.jsp를 찾아줌
	}
	
	//이론시험
	@RequestMapping("/login")
	public String login(@ModelAttribute User user) {
		System.out.println("login");
		System.out.println(user);
		return "loginForm";
	}
	
	//modelattribute 생략
	@RequestMapping("/login6")
	public String login6(User user) {
		System.out.println("login");
		System.out.println(user);
		return "loginForm";
	}
	
	@RequestMapping("/login2")
	public String login2(@RequestParam("userid")String id, 
			@RequestParam("passwd")String pw) {
		System.out.println("login");
		System.out.println(id+"\t"+pw);
		return "loginForm";
	}
	
	//변수명과 param이 같으면 생략가능
	@RequestMapping("/login3")
	public String login3(@RequestParam String userid, 
			@RequestParam String passwd) {
		System.out.println("login");
		System.out.println(userid+"\t"+passwd);
		return "loginForm";
	}
	
	//변수명과 param이 같으면 생략가능
	@RequestMapping("/login4")
	public String login4(String userid, 
			String passwd) {
		System.out.println("login");
		System.out.println(userid+"\t"+passwd);
		return "loginForm";
	}
	
	//map은 requestparam을 꼭 지정해줘야함
	@RequestMapping("/login5")
	public String login5(@RequestParam Map<String, String >map) {
		System.out.println("login");
		System.out.println(map);
		return "loginForm";
	}
}
