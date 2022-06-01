show databases;
create database fruits;
use fruits;
create table bhargav (uname varchar(200) NOT NULL, paasword varchar(200) NOT NULL , role varchar(200) default "user");
create table items (itemId int(20) primary key NOT NULL, itemName varchar(200) , itemQty int(20) );
insert into bhargav values ("server","12345@123","admin");
select * from bhargav;
