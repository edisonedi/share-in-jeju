//로그인 시도하는 회원정보 담아놓는 모델
package com.ch.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Login {

	private String email; //로그인 시도 이메일
	private String pw; //로그인 시도 비밀번호
}
