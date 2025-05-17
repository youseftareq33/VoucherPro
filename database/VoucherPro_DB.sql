-- create database VoucherPro_DB;

use VoucherPro_DB;

-- ==============================================================
create table product(
id int auto_increment primary key,
name varchar(255),
description varchar(255),
price decimal(8,3)
);

select * from product;
-- ==============================================================
create table voucher(
id int auto_increment primary key,
code varchar(255) unique,
discount decimal(8,3),
expire_date varchar(100)
);

select * from voucher;

-- delete from voucher where id=1;
-- ALTER TABLE voucher AUTO_INCREMENT = 1;
-- ==============================================================
create table user(
id int not null auto_increment primary key,
first_name varchar(20),
last_name varchar(20),
email varchar(255) unique,
password varchar(255)
);

select * from user;

-- ==============================================================
create table role(
id int not null auto_increment primary key,
name varchar(20)
);

select * from role;

-- ==============================================================
create table user_role(
user_id int,
role_id int,
foreign key (user_id) references user(id),
foreign key (role_id) references user(id)
);

select * from user_role;

-- ==============================================================

insert into user(first_name,last_name,email,password) values('yousef','sharbi','youseftareq33@gmail.com','$2a$10$PyIHGgjq8s3hTrdKHR4E9.rQ2RQcJN6.mhxLLHUY6zJi0olQnOBBK')
,('ahmad','sharbi','ahmadsharbi@gmail.com','$2a$10$LCYiBMxQnspcaoUAQJl3d.GuMvDMUydA6g2B2fWPp/Nhv/3tMRp9a');
-- pass: (yousef --> 1202057) , (ahmad --> admin)

insert into role(name) values('Role_User'),('Role_Admin');

insert into user_role values(1,1),(2,2);