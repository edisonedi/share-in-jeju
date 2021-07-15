package com.ch.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.project.dao.BoardDao;
import com.ch.project.model.Board;
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDao bd;
	@Override
	public List<Board> list() {
		
		return bd.list();
	}
	@Override
	public Board select(int bcode) {
		
		return bd.select(bcode);
	}
	@Override
	public int insert(Board board) {
		
		return bd.insert(board);
	}
	@Override
	public int update(Board board) {
		
		return bd.update(board);
	} 

}
