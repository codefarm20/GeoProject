package com.ja.finalproject.board.mapper;

import java.util.ArrayList;

import com.ja.finalproject.vo.BoardVo;

public interface BoardSQLMapper {
	
	public void insertBoard(BoardVo vo);
	
	public ArrayList<BoardVo> getBoardList(); //1개의 행을 받을때는 단일 객체 리턴 , N개의 행을 받을때는 List로 받는다.
	public BoardVo getBoardByNo(int no);
	
	public void increaseReadCount(int no);
	public void deleteBoard(int no);
	public void updateBoard(BoardVo vo);
	
}
