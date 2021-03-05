package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	//  http://localhost:9000/app/xyz
	@RequestMapping("/xyz")
	public String method() {
		System.out.println("MainController.method");
		//view resolver를 등록하지 않아서 명시적으로 줌
		//view만 반환 (모델은 제외)
		return "/WEB-INF/views/hello.jsp";
	}
//  http://localhost:9000/app/xyz2
	@RequestMapping("/xyz2")
	public String method2() {
		System.out.println("MainController.method");
		//view resolver를 등록하지 않아서 명시적으로 줌
		//view만 반환 (모델은 제외)
		return "/WEB-INF/views/hello.jsp";
	}
}
