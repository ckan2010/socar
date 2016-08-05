create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	birth varchar2(11),
	gender varchar2(1),
	phone varchar2(15),
	address varchar2(100),
	region varchar2(30),
	job varchar2(10),
	licence_num varchar2(20),
	licence_val varchar2(5),
	licence_local varchar2(3),
	licence_end varchar2(11),
	licence_start varchar2(11)
	
	
);
insert into member(id,pw,name,birth,gender,phone,address,region,job,licence_num,licence_val,licence_local,licence_end,licence_start)
				values
				('socar','1','김동혁','910820','남자','010-4122-2361','010-4122-2361','서울시 용산구 청파동 55','서울','16-10-621726-88','1종대형','대구','2023-12-31','2015-03-30'); 

alter table member modify(licence_end varchar2(50));
alter table member modify(licence_start varchar2(50));
desc member;

delete from member where id = 'jang';

select * from member;

