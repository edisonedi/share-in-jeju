create table member5 (
	id varchar2(20) primary key,
	email varchar2(30),
	password varchar2(30),
	name varchar2(30),
	fileName varchar2(50),
	del char(1) default 'n',
	regdate date
);

-- 관리자
insert into member5(id,password) values('admin','1234');
update member5 set Name='중앙이' where Id='admin';
select * from member5 where id='admin';

