package com.ch.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ch.project.model.Member;
import com.ch.project.service.AdminService;
import com.ch.project.service.MemberService;

@Controller // 관리자 관련 컨트롤러 빈 선언
public class AdminController {
	@Autowired
	private MemberService ms;
//	@Autowired
//	private AdminService adminservice;

	// 메뉴 페이지에서 관리자 로그인 버튼을 클릭하면 맵핑되는 메소드
	// 관리자 로그인 페이지로 이동시킨다.
	@RequestMapping("/main/admin_loginForm")
	public String admin_login_view() {

		return "main/admin_loginForm";
	}

	@RequestMapping("main/admin_login")
	    public String admin_login(Member member, Model model, HttpSession session) {
			int result = 0; // 암호가 다름
			Member member2 = ms.select(member.getId());
			if (member2 == null || member2.getDel().equals("y")) 
				result = -1; // 없는 ID 
			else if (member2.getPassword().equals(member.getPassword())) {
				result = 1; // 성공 id와 password가 일치
				session.setAttribute("id", member.getId());
			} 
			model.addAttribute("result", result);
			return"main/admin_login";
		}
}