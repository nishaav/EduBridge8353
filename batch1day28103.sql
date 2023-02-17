show databases;

use batch18103;

show tables;

desc emp;

describe emp;

select * from emp;
insert into user values(1,'Nisha','8920916725');
insert into emp values(9,'Shrey',24,'87989','shrey@edu.com');
insert into user(userId,userName) values(2,'Priya');

insert into user(userName,userId) values('Priya',3);
-- bulk of data/multiple data through a single insert command 
insert into emp values
(10,'Shreya Sharma',21,'98798','shreya.s@edu.com'),
(11,'Jatin Sharma',22,'348928','jatin.s@edu.com');
insert into user values
(4,'Jatin','78678080'),
(5,'Preksha','976543820');

desc user;
select * from user;

create table employee 
(
	empId int primary key,
    empName varchar(50) not null,
    empAge int default 24
);
desc employee;
desc emp;
insert into employee values(1,'Jatin',25);
insert into employee(empId,empName) values(2,'Sudheer');
insert into employee(empId,empName,empAge) values(3,NULL,23);
insert into employee(empId,empName,empAge) values(3,'NULL',23);

desc emp;
insert into emp(empId,empName) values(12,'Dhanesh');

select * from emp;




insert into emp(empId,empName,empAge) values(13,NULL,25);
desc emp;
show tables;
select * from emp;
truncate table emp;
delete from emp;

select * from employee;

drop table employee;

desc employee;
select * from emp;
-- alter command : to perform modification in the structure of the existing table.
alter table employee add (empContact varchar(11));

insert into employee values(1,'Aditya',22,'584948304');
insert into employee values(2,'Aditi',21,'434948304');
insert into employee values(3,'Shreya',23,'4343248304');
insert into employee values(4,'Shreyas',24,'667948304');
insert into employee values(5,'Shivaansh',25,'766948304');

select * from employee;

alter table employee add ( empEmail varchar(20));
-- after | before
alter table employee add empQualification varchar(30) after empName;
select * from employee;
desc employee;
alter table employee drop column empQualification;
ALTER TABLE employee MODIFY empName varchar(100); 
-- alter table employee modify (empName varchar(80),empContact varchar(20));
select * from employee_details;
-- rename table 
ALTER TABLE employee RENAME TO employee_details;
RENAME TABLE employee_details to employee;
-- rename a column
alter table employee rename column empEmail to email; 
select * from emp;