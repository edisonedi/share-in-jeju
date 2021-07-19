//package com.ch.project.controller;
//
//import java.io.IOException;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.ch.project.model.Member;
//import com.ch.project.service.MemberService;
//
//@Controller
//public class ProController {
//	@Autowired
//	private MemberService ms;
//	@RequestMapping("joinForm")
//	public String joinForm() {
//		return "main/joinForm";
//	}
//	@RequestMapping("idChk")
//	public String idChk(String id, Model model) {
//		String msg = "";
//		Member member = ms.select(id);
//		if (member == null) msg = "사용 가능한 아이디 입니다";
//		else msg = "이미 사용중이니 다른 아이디를 사요하세요";
//		model.addAttribute("msg", msg);
//		return "main/idChk";
//	}
//	@RequestMapping("join")
//	public String join(Member member, Model model, HttpSession session) throws IOException {
//		int result = 0;
//		// member는 화면에서 입력한 데이터이고 memebr2는 DB에서 id로 읽은 데이터
//		Member member2 = ms.select(member.getId());
//		if (member2 == null) {
//			result = ms.insert(member);
//		} else result = -1;  // 이미 있으니 입력하지마
//		model.addAttribute("result", result);
//		return "main/join";
//	}
//	@RequestMapping("loginForm")
//	public String loginForm() {
//		return "main/loginForm";
//	}
//	@RequestMapping("login")
//	public String login(Member member, Model model, HttpSession session) {
//		int result = 0; // 암호가 다름
//		Member member2 = ms.select(member.getId());
//		if (member2 == null || member2.getDel().equals("y")) 
//			result = -1; // 없는 ID 
//		else if (member2.getPassword().equals(member.getPassword())) {
//			result = 1; // 성공 id와 password가 일치
//			session.setAttribute("id", member.getId());
//		} 
//		model.addAttribute("result", result);
//		return "main/login";
//	}
//	@RequestMapping("logout")
//	public String logout(HttpSession session) {
//		session.invalidate(); // 세션 데이터 삭제
//		return "main/loginForm";
//	}
//	@RequestMapping("main")
//	public String main(Member member, Model model, HttpSession session) {
//		String id = (String)session.getAttribute("id");
//		if (id != null && !id.equals("")) {
//			member = ms.select(id);
//			model.addAttribute("member", member);
//		}
//		return "main/main";
//	}
//}
