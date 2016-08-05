create sequence car_seq start with 1 increment by 1 ;

drop sequence car_seq;
drop sequence car_seq;
create table car(
	car_seq int primary key,
	car_image varchar2(30),
	car_model varchar2(30),
	car_oil varchar2(20),
	car_option varchar2(100),
	pay_km int,
	car_zone varchar2(100),
	rent_time varchar2(80)
);

insert into car(car_seq,car_image,car_model,car_oil,car_option,pay_km,car_zone,rent_time) values
(car_seq.nextval,'GRADUAL.jpg','GRANDUAL','가솔린','전동백미러,열선시트,블루투스,전동시트',6000,'숙명여대','2016-08-07 19:00,2016-08-08 23:00');

alter table car modify car_option varchar2(100);

select * from car;
delete from car where car_model='avante';


drop table car;