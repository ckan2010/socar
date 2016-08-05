select * from customer;

create sequence cust_seq start with 1 increment by 1 ;

create table customer(
	cust_seq int primary key,
	val varchar2(20),
	title varchar2(100),
	content varchar2(300),
	file_name varchar2(200),
	reg_date varchar2(30),
	id varchar2(30),
	constraint customer_member_fk foreign key (id)
	references member(id) on delete cascade
);

drop table customer;

alter table customer add val varchar2(20);
	
	
