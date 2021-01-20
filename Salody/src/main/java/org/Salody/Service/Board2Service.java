package org.Salody.Service;

import java.util.ArrayList;

import org.Salody.DTO.BoardAttachDTO;
import org.Salody.DTO.BoardDTO;
import org.Salody.DTO.BrdCriteria;

//Interface - class
public interface Board2Service {

	public void write2(BoardDTO bdto);
	
	//DAO.xml - service<ArrayList> - serviceImpl connect
	public ArrayList<BoardDTO> list2(BrdCriteria bcri);
	
	public BoardDTO detail2(BoardDTO bdto);
	
	public ArrayList<BoardAttachDTO> showImg(int bno);
	
	
	public void update2(BoardDTO bdto);
	

	public void delete2(BoardDTO bdto);
	
	//hit
	public void brdHit(BoardDTO bdto);
	
	
	public int getTotal();
	
}
