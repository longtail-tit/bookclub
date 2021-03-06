package com.bookclub.app.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookclub.app.board.BoardService;
import com.bookclub.app.board.BoardVO;

@Service
public class NoticeService  implements BoardService{
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public BoardVO getSelect(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		
		return noticeDAO.getSelect(boardVO);
	}

	

	@Override
	public int setUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setInsert(BoardVO boardVO) throws Exception {
		
		return noticeDAO.setInsert(boardVO);
	}

	@Override
	public List<BoardVO> getList() throws Exception {
		System.out.println("service!!  :"+noticeDAO.getList().isEmpty());
	
		return noticeDAO.getList();
	}



	@Override
	public int setDelete(int no) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setDelete(no);
	}



	@Override
	public int updateHit(int no) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.updateHit(no);
	}



}
