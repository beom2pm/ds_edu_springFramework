package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.User;

@Controller
public class TestController {
	
	/*
	 * Controller의 메서드 파라미터변수 종류
	 * 
	 */
	@RequestMapping(value="/main")
	public String main() {
		System.out.println("main");
		return "main";
	}
	
	@RequestMapping(value="/main2")
	public String main2(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("main2" + "\t"+request+"\t"+response);
		return "main";
	}
	
	@RequestMapping(value="/main3")
	public String main3(HttpSession session) {
		System.out.println("main3" + "\t"+session);
		return "main";
	}
	
	@RequestMapping(value="/main4")
	public String main4(User user) {  //Model용도 (:jsp에서 보여줄 수 있는 데이터) ${클래스명}
		System.out.println("main4" + "\t"+user);
		return "main";
	}
	
	@RequestMapping(value="/main5")
	public String main5(@ModelAttribute("xxx") User user) {  //Model용도 (:jsp에서 보여줄 수 있는 데이터) ${클래스명}
		System.out.println("main5" + "\t"+user);
		return "main";
	}
	
	@RequestMapping(value="/main6")
	public String main6(@ModelAttribute("xxx") ArrayList<String> list) {  //Model용도 (:jsp에서 보여줄 수 있는 데이터) ${클래스명}
		System.out.println("main6" + "\t"+list);
		return "main";
	}
	
	@RequestMapping(value="/main7")
	public String main7(Model model) {
		model.addAttribute("xxx","hong");
		System.out.println("main7" + "\t"+model);
		return "main";
	}
	
	@RequestMapping(value="/main8")
	public String main8(Map<String,String> map) {
		map.put("xxx","jenny");
		System.out.println("main8" + "\t"+map);
		return "main";
	}
	
	
	
}
