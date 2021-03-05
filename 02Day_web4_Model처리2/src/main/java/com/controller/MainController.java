package com.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.User;

@Controller
public class MainController {
	
	@RequestMapping("/list")
	public String list(Model m) {
		m.addAttribute("username","홍길동");
		m.addAttribute("age",10);
		return "list"; //WEB-INF/views/list.jsp
	}
	
	@RequestMapping("/list2")
	public String list2(Map<String,User> map) {
		map.put("xxx", new User("hong","10"));
		
		return "list2"; //WEB-INF/views/list.jsp
	}
	
	@RequestMapping("/list3")
	public String list3(@ModelAttribute("xyz") ArrayList<User> list) {
		list.add(new User("hong","10"));
		list.add(new User("hong2","20"));
		list.add(new User("hong3","30"));
		return "list3"; //WEB-INF/views/list.jsp
	}

}
