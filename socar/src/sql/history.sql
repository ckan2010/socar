create sequence hist_seq start with 1 increment by 1;

drop sequence hist_seq;


create table history(
	hist_seq int primary key,
	rent_date varchar2(30),
	rent_zone varchar2(50),
	car_model varchar2(30),
	car_image varchar2(30),
	pay_km int,
	id varchar2(30),
	constraint history_member_fk foreign key (id)
	references member(id) on delete cascade
);

select * from history;
drop table history;
insert into history(hist_seq,rent_date,rent_zone,car_model,car_image,pay_km,id) values
(hist_seq.nextval,'2016-08-03','숙명여대','avante','avante.jpg','15000','socar');

select hist_seq.nextval from dual;

alter table history modify rent_zone varchar2(20);


select * from history;

delete from history where hist_seq = 45;