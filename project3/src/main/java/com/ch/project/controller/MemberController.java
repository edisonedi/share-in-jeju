package com.ch.project.controller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ch.project.model.Member;
import com.ch.project.service.MemberService;
@Controller
public class MemberController {
	@Autowired
	private MemberService ms;
	@RequestMapping("joinForm")
	public String joininForm() {
		return "main/joinForm";
	}
	@RequestMapping(value="idChk", produces = "text/html;charset=utf-8")
	@ResponseBody // idChk.jsp로 가지말고 바로 본문을 전달하라.
	public String idChk(String id) {
		String msg = "";
		Member member = ms.select(id);
		if (member == null) msg = "사용 가능한 아이디입니다";
		else msg = "이미 사용중이니 다른 아이디를 사용하세요";
		return msg;
	}
	@RequestMapping("join")
	public String join(Member member, Model model, HttpSession session) throws IOException {
		int result = 0;
		// member는 화면에서 입력한 데이터이고 memebr2는 DB에서 id로 읽은 데이터
		Member member2 = ms.select(member.getId());
		if (member2 == null) {
			String memberPhoto = member.getFile().getOriginalFilename();
			member.setMemberPhoto(memberPhoto);
			String real = 
				session.getServletContext().getRealPath("/resources/images");
			FileOutputStream fos = new FileOutputStream(
					new File(real+"/"+memberPhoto));
			fos.write(member.getFile().getBytes());
			fos.close();
			result = ms.insert(member);
		} else result = -1;  // 이미 있으니 입력하지마
		model.addAttribute("result", result);
		return "main/join";
	}
	@RequestMapping("loginForm")
	public String loginForm() {
		return "main/loginForm";
	}
	@RequestMapping("login")
	public String login(Member member, Model model, HttpSession session) {
		int result = 0; // 암호가 다름
		Member member2 = ms.select(member.getId());
		if (member2 == null || member2.getDel().equals("y")) 
			result = -1; // 없는 ID 
		else if (member2.getPassword().equals(member.getPassword())) {
			result = 1; // 성공 id와 password가 일치
			session.setAttribute("id", member.getId());
		} 
		model.addAttribute("result", result);
		return "main/login";
	}
	@RequestMapping("view")
	public String view(HttpSession session, Model model) {
		String id = (String)session.getAttribute("id");
		Member member = ms.select(id);
		model.addAttribute("member", member);
		return "view";
	}
	@RequestMapping("updateForm")
	public String updateForm(Model model, HttpSession session) {
		String id = (String)session.getAttribute("id");
		Member member = ms.select(id);
		model.addAttribute("member", member);
		return "updateForm";
	}
	@RequestMapping("update")
	public String update(Member member, Model model, HttpSession session) throws IOException {
		int result = 0;
//		fileName는 null일수도 있고 값을 가지고 올 수도 있다
		String memberPhoto = member.getFile().getOriginalFilename();
		if (memberPhoto != null && !memberPhoto.equals("")) {			
			member.setMemberPhoto(memberPhoto);
			String real = 
				session.getServletContext().getRealPath("/resources/images");
			FileOutputStream fos = new FileOutputStream(
					new File(real+"/"+memberPhoto));
			fos.write(member.getFile().getBytes());
			fos.close();			
		} 
		result = ms.update(member);
		model.addAttribute("result", result);
		return "update";
	}
	@RequestMapping("delete")
	public String delete(Model model, HttpSession session) {
		String id = (String)session.getAttribute("id");
		int result = ms.delete(id);
		if (result > 0) session.invalidate();
		model.addAttribute("result", result);
		return "delete";
	}
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "logout";
	}
	@RequestMapping("main")
	public String main(Member member, Model model, HttpSession session) {
		String id = (String)session.getAttribute("id");
		if (id != null && !id.equals("")) {
			member = ms.select(id);
			model.addAttribute("member", member);
		}
		return "main";
	}
}