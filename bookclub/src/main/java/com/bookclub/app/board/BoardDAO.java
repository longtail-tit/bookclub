package com.bookclub.app.board;

import java.util.List;

public interface BoardDAO {

	    //select
		public BoardVO getSelect(BoardVO boardVO) throws Exception;
		
		//delete
		public int setDelete(int no) throws Exception;
		
		//update
		public int setUpdate(BoardVO boardVO) throws Exception;
		
		//insert
		public int setInsert(BoardVO boardVO) throws Exception;
		
		//selectlist
		public List<BoardVO> getList() throws Exception;
		
		//updateHit
		public int updateHit(int no) throws Exception;
}
