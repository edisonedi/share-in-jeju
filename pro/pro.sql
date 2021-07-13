create table pmember (
	id varchar2(20) primary key,
	email varchar2(30),
	password varchar2(30),
	name varchar2(30),
	del char(1) default 'n',
	regdate date
);
select * from pmember;