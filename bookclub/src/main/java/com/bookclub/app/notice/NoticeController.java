package com.bookclub.app.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookclub.app.board.BoardVO;

@Controller
@RequestMapping(value="/notice/**")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	//게시글 목록 조회
	@RequestMapping("board")
	public ModelAndView getList() throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		List<BoardVO> list = noticeService.getList();
		System.out.println(noticeService.getList().isEmpty());
		mv.addObject("list", list);
		mv.setViewName("notice");
		
		return mv;
	}
	//게시글 등록
	//게시글 상세보기
	//게시글 삭제
	//게시글 수정
	
	
	

}
