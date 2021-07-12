package com.ch.project.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ch.project.model.Users;
import com.ch.project.service.IUsersService;

public class UsersController {
	private IUsersService usersService;

	//회원가입 페이지 join.jsp열람 요청
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join() throws Exception {
		//RestController에서는 modelandview에 담아서 보낸다.
		return "user/join";
	}
	//회원가입 처리 요청
	@RequestMapping("")
	public String register(Users user) throws Exception {
		usersService.register(user);
		return "joinSuccess";
	}
}
