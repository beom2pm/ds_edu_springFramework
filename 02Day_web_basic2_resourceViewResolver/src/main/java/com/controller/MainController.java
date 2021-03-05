package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	//  http://localhost:9000/app/xyz
	@RequestMapping("/xyz")
	public String method() {
		System.out.println("MainController.method");
		//file명만 알려주면 됨 - viewResolver를 등록했기 때문에
		return "hello";
	}
	
//  http://localhost:9000/app/xyz2
	@RequestMapping("/xyz2")
	public String method2() {
		System.out.println("MainController.method");
		
		return "hello";
	}
}
