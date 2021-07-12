//회원 프로필 사진 모델 생성
package com.ch.project.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(exclude = "profileData")
public class UsersImgs {
	
	private int userImgNo;
	private int userNo;
	private String profileName;
	private long profileSize;
	private String profileContentType;
	private byte[] profileData;
	
	private MultipartFile file;
}
