package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(value="/loginForm")
	public String loginForm() {
		System.out.println("loginForm");
		return "loginForm"; // WEB-INF/views/loginForm.jsp를 찾아줌
	}
	
	//@GetMapping
	//@RequestMapping(value="/login", method = RequestMethod.GET)
	@GetMapping("/login")
	public String login(User user) {
		System.out.println("login:GET");
		System.out.println(user);
		return "loginForm";
	}
	
	//@PostMapping - requestmapping 대신 사용 가능
	//@RequestMapping(value="/login2",method = RequestMethod.POST)
	@PostMapping("/login2")
	public String login2(User user) {
		System.out.println("login:POST");
		System.out.println(user);
		return "loginForm";
	}
	
}
