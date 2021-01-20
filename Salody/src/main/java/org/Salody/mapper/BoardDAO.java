package org.Salody.mapper;

import java.util.ArrayList;

import org.Salody.DTO.BoardAttachDTO;
import org.Salody.DTO.BoardDTO;
import org.Salody.DTO.BrdCriteria;

public interface BoardDAO {
	
	//게시판 글쓰기
	public void write2(BoardDTO bdto);
	
	//게시판 리스트
	public ArrayList<BoardDTO> list2(BrdCriteria bcri);
	
	//게시판 상세리스트
	public BoardDTO detail2(BoardDTO bdto);
	
	//게시판 글 수정
	public void update2(BoardDTO bdto);
	
	//게시판 글 삭제
	public void delete2(BoardDTO bdto);
	
	//게시글 총 건수
	public int getTotal();
	
	//조회수
	public void brdHit(BoardDTO bdto);
	
}
