package com.ch.project.dao;

import com.ch.project.model.Member;

public interface MemberDao {
 
	Member select(String id);
	int insert(Member member);
	int update(Member member);
	int delete(String id);

}
