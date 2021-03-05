package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Board;
import com.service.DBService;

@Controller
public class BoardController {

	@Autowired
	DBService service;

	// 글쓰기 화면보기- GET
//	@GetMapping("/write")
//	public String writeUI() {
//		System.out.println("writeUI");
//		return "write";
//	}

	// 글쓰기- POST
	@PostMapping("/write")
	public String write(Board board) {
		System.out.println("write");
		int num = service.boardWrite(board);

		return "redirect:list";
	}

	// 글목록보기
	@RequestMapping("/list")
	public String list(Model m) {
		List<Board> list = service.boardList(); // Model
		m.addAttribute("boardList", list); // list.jsp에서 ${boardList}로 참조가능
		return "list"; // /WEB-INF/views/list.jsp
	}

	// 글 자세히보기
	//model o, jsp x  => 뷰를 유추해야함 
	@RequestMapping("/retrieve") // /WEB-INF/views/retrieve.jsp , ${xyz} 참조 가능
	@ModelAttribute("xyz")
	public Board retrieve(@RequestParam("num") int kkk) {
		Board board = service.selectByNum(kkk);
		return board;
	}

	//restful방식에서는 데이터 타입 조심 - ref class로
		//변수형태는 중괄호로 {xxx}
		//  8090/app/retrieve/num/3/age/20 =>여러개 가능
		//@RequestMapping("/retrieve2/num/{xxx}/age/{yyy}")
	@RequestMapping("/retrieve2/num/{xxx}")
	public ModelAndView retrieve2(@PathVariable("xxx") Integer kkk) {

		ModelAndView mav = new ModelAndView();
		Board board = service.selectByNum(kkk);

		mav.addObject("xyz", board);
		mav.setViewName("retrieve");

		return mav;
	}

	// 글수정 ==> 목록
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Board board) {
		int num = service.boardUpdate(board);
		return "redirect:list";
	}

	// 글삭제 ==> 목록
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam int num) {
		int num2 = service.boardDelete(num);
		return "redirect:list";
	}
}

