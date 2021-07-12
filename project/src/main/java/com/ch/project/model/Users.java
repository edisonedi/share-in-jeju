//회원 모델 생성
package com.ch.project.model;
import java.util.Date;
import org.springframework.web.multipart.MultipartFile;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Users {
	private int userNo; //회원번호
	private String email; //회원 이메일
	private String id; //회원 아이디
	private String pw; //패스워드
	private String name; //회원 이름
	private String phone; //전화번호
	private String regDate; //가입일
	
	//클라이언트 측에서 넘어온 파일 데이터를 저장하기 위한 파라미터 읽기용
	private MultipartFile file;
	
	//프로필 파일을 위한 필드
	private int userImgNo;
	private String profileName; //파일 이름
	private long profileSize; // 파일크기
	private String profileContentType; //파일 타입
	
}
