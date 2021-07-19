package com.ch.pro.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ch.pro.model.Member;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public Member select(String id) {
		return sst.selectOne("memberns.select", id);
	}

	@Override
	public int insert(Member member) {
		return sst.insert("memberns.insert", member);
	}
	
	
}
