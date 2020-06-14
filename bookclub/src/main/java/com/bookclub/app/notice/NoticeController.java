package com.bookclub.app.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
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
	@GetMapping(value="noticeWrite")
	public String setInsert() throws Exception{
		return "noticeWrite";
	}
	
	@PostMapping(value="noticeWrite")
	public ModelAndView setInsert(BoardVO boardVO) throws Exception{
		ModelAndView mv = new ModelAndView();
		System.out.println("컨트롤러: "+ boardVO.getTitle());
		int result = noticeService.setInsert(boardVO);
		
		if (result > 0) {
			System.out.println("등록완료");
		}
	    mv.setViewName("redirect:board");
		
		return mv;
	}
	//게시글 상세보기- 제목 클릭, 게시글 select 해오기 
	@GetMapping(value = "noticeOne")
	public ModelAndView getNotice(BoardVO boardVO) throws Exception{
		ModelAndView mv = new ModelAndView();
		boardVO = noticeService.getSelect(boardVO);
		mv.addObject("vo",boardVO);
		mv.setViewName("noticeOne");
		return mv; 
	}
	//게시글 삭제
	//게시글 수정
	
	
	

}
