package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/main")
	public String main() {
		System.out.println("main>>>");
		return "main";
	}
	
	//redirect
	@RequestMapping("/xxx")
	public String xxx(Model m) {
		System.out.println("xxx>>>");
		//main에서는 이 값을 보여줄 수가 없음 - redirect라서 request가 다르므로
		m.addAttribute("username", "홍길동");
		
		//xxx로 요청하면 main으로 redirect
		return "redirect:main";
	}
	
	//forward
	@RequestMapping("/yyy")
	public String yyy(Model m) {
		System.out.println("yyy>>>");
		//forward기 때문에 가져올 수 있다. & url변경도 안됨
		m.addAttribute("username", "홍길동");
		
		return "forward:main";
	}
}
