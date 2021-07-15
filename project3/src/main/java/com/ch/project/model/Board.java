package com.ch.project.model;

import java.sql.Date;

import lombok.Data;
@Data
public class Board {
	private int bid; // 사용자 번호(primary key)		
 	private String writer; // 작성자
 	private String title; // 제목		
 	private String content; // 내용		
 			
 //	private int bcode; // 게시글 번호		
 	private Date regdate; // 등록일	
 	private int hit; // 좋아요 수	
 	
 	// 사진 upload용 
 	// 작성필요
}
