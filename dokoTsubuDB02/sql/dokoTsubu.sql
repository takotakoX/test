set names utf8;
set foreign_key_checks = 0;
drop database if exists dokotsubu;

create database if not exists dokotsubu;
use dokotsubu;

drop table if exists mutter;

create table mutter(
	id int not null primary key auto_increment,
	name varchar(255),
	text varchar(255)
);