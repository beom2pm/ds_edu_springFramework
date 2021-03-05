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
import org.springframework.web.servlet.ModelAndView;

import com.dto.User;

@Controller
public class TestController2 {
	
	/*
	 * Controller의 메서드 리턴타입
	 * 
	 */

	//1. String ==> jsp 파일명 의미,  Model은 없고, View정보만 제공
	@RequestMapping(value="/home")
	public String home() { 
		System.out.println("home");
		return "home";
	}
	
	//2. ModelAndView ==> jsp 파일명 의미,  Model은 없고, View정보만 제공
	@RequestMapping(value="/home2")
	public ModelAndView home2() { 
		System.out.println("home2");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("username","hong"); //model 정보
		mav.setViewName("home"); //view 정보
		return mav;
	}
	
	//3.User ==> Model만 지정, view지정 안함 => 뷰정보는 매핑값
	@RequestMapping(value="/home3")
	@ModelAttribute("xxx")
	public User home3() { 
		User u = new User("aaaa","124");
		return u;
	}
	
	//4.ArrayList ==> Model만 지정, view지정 안함 => 뷰정보는 매핑값
	@RequestMapping(value="/home4")
	@ModelAttribute("xxx")
	public ArrayList<String> home4() { 
		ArrayList<String> list = new ArrayList<String>();
		list.add("hong");
		list.add("jenny");
		return list;
	}
	
	
	
	
}
