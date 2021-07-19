package com.ch.pro.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ch.pro.model.Board;
import com.ch.pro.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService bs;
	
	
	
	
	// 사용자 측(전체 글 조회)
	@RequestMapping("boardList")
	public String boardList(HttpSession session,Model model) {	
		List<Board> boardList = bs.list(); 
		model.addAttribute("boardList",boardList);
		return "board/boardList";
	}
	// 입력 
	@RequestMapping("boardInsertForm")
	public String boardInsertForm() {
		return "board/boardInsertForm";
	}
	
	 @RequestMapping("boardInsert")
	 public String boardInsert(Board board,HttpSession session,Model model) {
	 int result = 0;
	 Board board2 = bs.select(board.getBid()); // 게시글번호 중복 확인
	 if(board2 == null) result = bs.insert(board);
	 else result = -1;
	 model.addAttribute("result",result);
	 
	 return "board/boardInsert";
	 
	 }
	 @RequestMapping("updateBoardForm")
	 public String updateBoardForm(int bid, Model model) {
		 Board board = bs.select(bid);
		 model.addAttribute("board",board);
		 return "board/updateBoardForm";
	 }
	 
	 @RequestMapping("boardUpdate")
	 public String boardUpdate(Board board , Model model) {
		int result = bs.update(board);
		model.addAttribute("result",result);
		return "board/boardUpdate";
	 }
	 
	 
}
