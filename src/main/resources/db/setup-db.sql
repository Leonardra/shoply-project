create database shopdb;
create user 'shoply_user'@'localhost' identified by 'Shop123';
grant all privileges on shopdb.* to 'shoply_user'@'localhost';

flush privileges