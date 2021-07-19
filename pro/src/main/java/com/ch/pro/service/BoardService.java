package com.ch.pro.service;

import java.util.List;

import com.ch.pro.model.Board;

public interface BoardService {

	List<Board> list();
	Board select(int bcode);
	int insert(Board board);
	int update(Board board);

}
