set names utf8;
set foreign_key_checks=0;

drop database if exists myrecipe;
create database if not exists myrecipe;
use myrecipe;

drop table if exists user_account;

create table user_account(
	id int primary key auto_increment,
	mail varchar(100) not null unique,
	pass varchar(8) not null
);

INSERT INTO user_account(mail, pass) VALUES("taro@gmail.com","123");

drop table if exists recipe;

create table recipe(
	id int primary key auto_increment,
	dish varchar(30) not null,
	ing_1 varchar(10),
	ing_2 varchar(10),
	ing_3 varchar(10),
	ing_4 varchar(10),
	ing_5 varchar(10),
	ing_6 varchar(10),
	ing_7 varchar(10),
	ing_8 varchar(10),
	ing_9 varchar(10),
	ing_10 varchar(10),
	cooking_time int,
	mail_id varchar(100) not null
);

INSERT INTO recipe(dish, ing_1, ing_2, ing_3, ing_4, cooking_time, mail_id) VALUES("レタス炒飯","ご飯","生卵","肉","レタス",15,"taro@gmail.com");