package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.User;

@Controller
public class MainController {
	
	@RequestMapping("/list")
	public ModelAndView list() {
		
		ModelAndView mav = new ModelAndView();
		//model 저장
		mav.addObject("userid","홍길동" ); // request.setAttribute(key,value)와 동일
		mav.addObject("age",10 );
		
		//view 저장
		mav.setViewName("list");  //WEB-INF/views/list.jsp
		
		
		return mav;
	}
	
	@RequestMapping("/list2")
	public ModelAndView list2() {
		
		ModelAndView mav = new ModelAndView();
		//model 저장
		mav.addObject("xxx",new User("홍길동","1234")); 
		
		//view 저장
		mav.setViewName("list2");  //WEB-INF/views/list2.jsp
		
		return mav;
	}
	
	@RequestMapping("/list3")
	public ModelAndView list3() {
		
		ModelAndView mav = new ModelAndView();
		//모델저장
		List<User> list = Arrays.asList(new User("홍길동1","1234"),
				new User("홍길동2","1234"),
				new User("홍길동3","1234")); 
		
		mav.addObject("xyz", list);
		
		//view저장
		mav.setViewName("list3");  //  /WEB-INF/views/list3.jsp
		
		return mav;
	}

}
