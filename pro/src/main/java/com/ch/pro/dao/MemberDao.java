package com.ch.pro.dao;

import com.ch.pro.model.Member;

public interface MemberDao {
 
	Member select(String id);

	int insert(Member member);

}
