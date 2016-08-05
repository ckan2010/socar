create sequence pay_seq start with 1 increment by 1;

create table payment(
	pay_seq int primary key,
	car_model varchar2(20),
	distance_km int,
	id varchar2(30),
	constraint payment_member_fk foreign key (id)
	references member(id) on delete cascade
);

select * from payment;