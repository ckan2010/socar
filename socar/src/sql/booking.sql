create sequence book_seq start with 1 increment by 1 ;
create table booking(

	book_seq int primary key,
	car_model varchar2(10) ,
	rent_date varchar2(40),
	return_date varchar2(20),
	region varchar2(10),
	travel varchar2(10),
	socar_zone varchar2(20),
	id varchar2(20),
	constraint booking_member_fk foreign key (id)
	references member(id) on delete cascade



select * from booking;
