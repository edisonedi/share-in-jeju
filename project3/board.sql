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