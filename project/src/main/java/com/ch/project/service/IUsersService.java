package com.ch.project.service;

import com.ch.project.model.Login;
import com.ch.project.model.UsersImgs;
import com.ch.project.model.Users;

public interface IUsersService {

	/***** 회원가입 로직 *****/
	// 회원가입 처리
	void register(Users user) throws Exception;
	
	// 이메일 중복확인 처리
	int isDuplicateEmail(String email) throws Exception;
	
	// 아이디 중복확인 처리
	int isDuplicateId(String id) throws Exception;
	
	/***** 로그인 로직 *****/
	// 로그인 시도 회원정보 조회 처리
	Users login(Login login) throws Exception;
	
	/***** 회원정보 로직 *****/
	// 회원정보 수정
	void modifyInfo(Users user) throws Exception;
	
	// 첨부파일을 DB에서 불러오기
	UsersImgs getProfile(int userNo) throws Exception;
	
	//프로필 사진 등록
	void insertUsersImg(UsersImgs file) throws Exception;
	
	//아이디로 회원의 모든 정보 조회
	Users inquiryOfUserByUserById(String id) throws Exception;
	
	//유저번호로 회원의 모든 정보 조회
	Users inquiryOfUserByUserByNo(int userNo) throws Exception;
	
	//프로필 사진 삭제
	void deleteUsersImg(int UserNo) throws Exception;
	
	//비밀번호 변경
  	void modifyPw(Users user) throws Exception;
	
	//비밀번호 찾기
	String findPw(Login login) throws Exception;
	
	//회원 탈퇴
	void withdrawal(Users user) throws Exception;

	
}
