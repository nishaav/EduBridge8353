show databases;
use batch18103;
show tables;
select * from emp;

-- insert 
insert into emp values(6,'Priya',23,'78973982','priya@gmail.com');
desc emp;
-- bulk insert
insert into emp values
(7,'Priyank',25,'53423732','priyank@gmail.com'),
(8,'Preeti',24,'58904394','preeti@gmail.com'),
(9,'Priyam',27,'78787907','priyam@gmail.com');

-- update 
-- used to modify a record or multiple records of a table on 
-- the basis of conditions

update emp set email='edu@gmail.com';
select * from emp;
-- conditional update
update emp set email='edu@gmail.com' where empId=4;
-- multiple column update
update emp set email='eduadmin@gmail.com',empContact='98765431' 
where empId<=4;
-- age=24 email = edu@gmail.com 'Jatin' 
update emp set email='edu@gmail.com' where empId=4;

update emp set empName='Jatin Shukla' 
where empAge=24 and email='edu@gmail.com';
 
-- delete  
-- delete all the records from the table
delete from emp; 
-- delete a specific entry
delete from emp where empId=4;
select * from emp;
show databases;
use mysql;
show tables;
-- grant and revoke
-- create user
select * from user;
create user 'priya@localhost' identified by 'priya@123';
grant all privileges on *.* to priya;
select user from information_Schema;


-- show current user
select user();
create user 'pooja' identified by 'pooja@123';
create user 'username' identified by 'password';
-- mysql->database user->tablename
select * from mysql.user;
-- select a single column
select User from mysql.user;
-- *.* alldatabases.allobjects
-- allocate privileges
grant all privileges on batch18103.emp to pooja,username;
grant all privileges on batch18103.* to pooja;
grant select on *.* to pooja;
grant all privileges on * . * TO username;
 -- specific permission
GRANT CREATE, SELECT, INSERT ON * . * TO username;
 -- keywords
-- ALL PRIVILEGES: It permits all privileges to a new user account.
-- CREATE: to create databases and tables.
-- DROP: to drop databases and tables.
-- DELETE: to delete rows from a specific table.
-- INSERT: to insert rows into a specific table.
-- SELECT: to read records from database.
-- UPDATE: to update table rows.

-- to revoke and flush all the privileges of a user account immediately
REVOKE ALL PRIVILEGES, GRANT OPTION FROM username;
FLUSH PRIVILEGES;  