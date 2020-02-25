insert into person(`id`, `name`, `age`, `blood_type`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`, `job`) values(1, 'shinjjune', 10, 'B',1991,8,15, 'programmer');
insert into person(`id`, `name`, `age`, `blood_type`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values(2, 'hando', 19, 'AB',1992,7,21);
insert into person(`id`, `name`, `age`, `blood_type`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values(3, 'jypark', 14, 'A',1993,10,15);
insert into person(`id`, `name`, `age`, `blood_type`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values(4, 'wonsang', 17, 'O',1994,8,31);
insert into person(`id`, `name`, `age`, `blood_type`, `year_of_birthday`, `month_of_birthday`, `day_of_birthday`) values(5, 'hyeju', 21, 'B',1995,12,23);

insert into block(`id`, `name`) values (1, 'jypark');
insert into block(`id`, `name`) values (2, 'wonsang');

update person set block_id = 1 where id = 3;
update person set block_id = 2 where id = 4;