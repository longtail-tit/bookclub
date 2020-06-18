package com.bookclub.app.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookclub.app.board.BoardDAO;
import com.bookclub.app.board.BoardVO;

@Repository
public class NoticeDAO implements BoardDAO{
	
	// 1. sql 세션 
	// 2. 네임스페이스(쿼리 매핑)

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.bookclub.app.notice.NoticeDAO.";

	@Override
	public BoardVO getSelect(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getSelectOne", boardVO);
	}

	@Override
	public int setDelete(int no) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE+"setDelete", no);
	}

	@Override
	public int setUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setInsert(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(boardVO.getContent());
		
		return sqlSession.insert(NAMESPACE+"setInsert", boardVO);
	}

	@Override
	public List<BoardVO> getList() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("dao!!!");
		
		return sqlSession.selectList(NAMESPACE+"getList");
	}

	@Override
	public int updateHit(int no) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"setUpdateHit", no);
	}

	

}
