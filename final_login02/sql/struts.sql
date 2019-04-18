set names utf8;
set foreign_key_checks = 0;
drop database if exists logindb_suzukawa;

create database if not exists logindb_suzukawa;
use logindb_suzukawa;

drop table if exists user;
create table user(
	id int primary key auto_increment,
	user_name varchar(255),
	password varchar(255)
);

INSERT INTO user(user_name, password) VALUES("taro", "123");
INSERT INTO user(user_name, password) VALUES("jiro", "456");
INSERT INTO user(user_name, password) VALUES("hanako", "789");