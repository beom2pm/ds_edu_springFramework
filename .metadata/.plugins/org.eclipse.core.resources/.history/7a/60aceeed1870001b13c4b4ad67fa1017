package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.User;

@Controller
public class LoginController {
	
	//뷰만 지정된 형태로서 리턴타입이 String이면 JSP 파일명을 의미한다.
	//이름이 같아도 메소드 전달방식이 다르기 때문에 충돌이 나지 않는다.
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm() {
		return "loginForm";
	}
	
	//jsp의 요청파라미터 얻는 방법 2 - dto class
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("xxx") User user) { //request.setAttribute("user", user)동일
		
		System.out.println(user);
		return "login";  //  /WEB-INF/views/login.jsp
	}
	
	//jsp의 요청파라미터 얻는 방법 1 - @RequestParam 사용
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String login(@RequestParam String userid,//이전 request.getParameter("userid")와 동일
//			@RequestParam String passwd) {
//		
//		System.out.println(userid+"\t"+passwd);
//		
//		return "login";
//	}
	
}
