package com.ch.project.dao;

import com.ch.project.model.Login;
import com.ch.project.model.UsersImgs;
import com.ch.project.model.Users;

public interface IUsersDao {

	/***회원가입 로직***/
	//회원 가입 처리
	void register(Users user) throws Exception;
	
	//이메일 중복 확인 처리
	int isDuplicateEmail(String email) throws Exception;
	
	//아이디 중복 확인 처리
	int isDuplicated(String id) throws Exception;
	
	/***로그인 로직***/
	//로그인 시도 회원 정보 조회처리
	Users login(Login login) throws Exception;
	
	/***회원정보 로직***/
	//회원 정보 수정
	void modifyInfo(Users users) throws Exception;
	
	//첨부파일을 DB에서 불러오기
	UsersImgs getProfile(int userNo)throws Exception;
	
	//프로필 사진 등록
	void insertUsersImg(UsersImgs file)throws Exception;
	
	//아이디로 회원의 모든 정보 조회
	Users inquiryOfUserById(String id) throws Exception;
	
	//유저번호로 회원의 모든 정보 조회
	Users inquiryOfUserNo(int userNo) throws Exception;
	
	//프로필 사진 삭제
	void deleteUsersImg(int userNo) throws Exception;
	
	//비밀번호 변경
	void modifyPw(Users user) throws Exception;
	
	//회원탈퇴
	void withdrawal() throws Exception;
	
	
}
