-- 게시글 작성
create table board3 ( 
	bid			number(5), -- 작성자 id
 	writer		varchar2(40), -- 작성자
 	title		varchar2(40), -- 제목
 	content		varchar2(100), -- 내용
 	regdate		DATE, -- 등록일
 	hit			number(5), -- 좋아요
-- 	bcode 		number(10), --게시글 번호
 	PRIMARY KEY (bid) 
 );
alter table board3 drop (bcode);
select * from board3;
delete from board3;
-- 시퀀스 작성 필요


INSERT INTO board3 values(1,'길동1','글1','내용1',sysdate,0,1);
INSERT INTO board3 values(2,'길동2','글2','내용2',sysdate,1,2);
INSERT INTO board3 values(3,'길동3','글3','내용3',sysdate,2,3);

-- 회원관리 
create table pmember (
	id varchar2(20) primary key,
	email varchar2(30),
	password varchar2(30),
	name varchar2(30),
	del char(1) default 'n',
	regdate date
);
select * from pmember;

-- 게시판 좋아요 테이블
create table likes{
	likeId varchar2(100) not null,--회원 아이디
	likebid number not null, --게시물 기본키
	likenum number default 0, --좋아요 체크
	FOREIGN KEY(likeId) REFERENCES pmember(id),
	FOREIGN KEY(likebid) REFERENCES board3(bcode)
	};


