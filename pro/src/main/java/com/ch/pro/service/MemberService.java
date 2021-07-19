package com.ch.pro.service;

import com.ch.pro.model.Member;

public interface MemberService {

	Member select(String id);

	int insert(Member member);

}
