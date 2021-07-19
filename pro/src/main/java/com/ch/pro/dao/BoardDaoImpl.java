package com.ch.pro.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ch.pro.model.Board;
@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlSessionTemplate sst;
	
	@Override
	public List<Board> list() {
		
		return sst.selectList("boardns.list");
	}

	@Override
	public Board select(int bcode) {
		
		return sst.selectOne("boardns.select", bcode);
	}

	@Override
	public int insert(Board board) {
		
		return sst.insert("boardns.insert",board);
	}

	@Override
	public int update(Board board) {
		
		return sst.update("boardns.update",board);
	}

}
