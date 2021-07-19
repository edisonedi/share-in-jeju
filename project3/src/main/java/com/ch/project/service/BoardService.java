package com.ch.project.service;

import java.util.List;

import com.ch.project.model.Board;

public interface BoardService {

	List<Board> list();
	Board select(int bcode);
	int insert(Board board);
	int update(Board board);

}
