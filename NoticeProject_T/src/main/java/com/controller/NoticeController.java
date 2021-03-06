package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Notice;
import com.service.DBService;

@Controller
public class NoticeController {

	@Autowired
	DBService service;
	    
	  //글쓰기 화면
		@GetMapping(value="/write")
		public String writeUI() {
			return "writeForm";
		}
		
		//글쓰기
		@PostMapping("/write")
		public String write(Notice notice) {
			int num = service.noticeWrite(notice);
			return "redirect:list";
		}

		// 글목록보기
		@RequestMapping("/list")
		public String list(Model m) {
			List<Notice> list = service.noticeList();
			m.addAttribute("noticeList", list); // list.jsp에서 ${noticeList}로 참조가능
			return "list"; // /WEB-INF/views/list.jsp
		}

		// 글 자세히보기
		@RequestMapping("/retrieve") 
		@ModelAttribute("detail")
		public Notice retrieve(@RequestParam("no") int no) {
			Notice board = service.selectByNo(no);
			return board;
		}


		// 글수정
		@RequestMapping(value = "/update", method = RequestMethod.POST)
		public String update(Notice notice) {
			int num = service.noticeUpdate(notice);
			return "redirect:list";
		}

		// 글삭제 
		@RequestMapping(value = "/delete", method = RequestMethod.GET)
		public String delete(@RequestParam int no) {
			int num2 = service.noticeDelete(no);
			return "redirect:list";
		}
}
