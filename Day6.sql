use avizva;
show tables;
show databases;
use hibernatedemo;
CREATE TABLE learners
(
	learner_id int primary key auto_increment,
    learner_name varchar(20)
);

CREATE TABLE course_registration_fullstack_java
(
	course_reg_id int primary key,
    learner_id int,
    foreign key (learner_id) references learners(learner_id)
);

show tables;
select * from user;
use batch18103;
show tables;
select * from emp;
desc emp;
insert into emp values(1,'Jatin',24,'839343','jatin@gmail.com');
insert into emp values(2,'Jitesh',21,'98978','jitesh@gmail.com');
insert into emp values(3,'Manav',23,'8879879','manav@gmail.com');
insert into emp values(4,'Naman',23,'809839','naman@gmail.com');
insert into emp values(5,'Pooja',22,'0969706','pooja@gmail.com');


CREATE VIEW emp_view as
select * from emp;


select * from emp_view;
insert into emp_view values(6,'Pooja',22,'0969706','pooja@gmail.com');

desc learners;
desc course_registration_fullstack_java;

insert into learners(learner_name) values('Jatin');
insert into learners(learner_name) values('Priya');
insert into learners(learner_name) values('Pooja');
insert into learners(learner_name) values('Jitesh');

select  * from learners;
-- 1:M
select * from course_registration_fullstack_java;
insert into course_registration_fullstack_java values(1,4);
insert into course_registration_fullstack_java values(2,4);
insert into course_registration_fullstack_java values(3,1);
insert into course_registration_fullstack_java values(4,3);
insert into course_registration_fullstack_java values(5,2);
insert into course_registration_fullstack_java values(6,5);
insert into course_registration_fullstack_java values(7,2);

-- foreign key colum will except only those values which is a part of primary key column
CREATE VIEW view_learner AS
SELECT l.learner_id,l.learner_name, c.course_reg_id 
FROM learners l INNER JOIN course_registration_fullstack_java c 
ON l.learner_id=c.learner_id;

select * from view_learner;
update view_learner set learner_name="Priyanka",course_reg_id=6 where learner_id=2;
-- 0	39	10:29:09	update view_learner set learner_name="Priyanka",course_reg_id=6 where learner_id=2	
-- Error Code: 1393. Can not modify more than one base table through a join view 'hibernatedemo.view_learner'	0.000 sec

drop view view_learner;

-- alter view to edit the select query response 
alter view view_learner as select * from learners;

-- scalar functions : based on the user input, it can return single or multiple values
-- UCASE 
select UCASE(learner_name) from learners;
select LCASE(learner_name) from learners;
select MID(learner_name,2,3) from learners;
-- MID(column_name,start_position,_no_of_characters)
select length(learner_name) from learners;

-- round (column_name,decimals)
select round(learner_id,0) from learners;
-- NOW() : to fetch the current date and time of the system
select learner_id,learner_name,NOW() from learners;
-- learner_id,learner_name, registration_date_time registration
insert into learner values(1,'Dinesh',NOW());
-- FORMAT 
select learner_name,DATE_FORMAT(NOW(),'%a %Y %M %e') as Date from learners;
select date(NOW());
-- 
-- creating a procedure
CREATE PROCEDURE PROC_LEARNER()
select learner_name,DATE_FORMAT(NOW(),'%a %Y %M %e') as Date from learners
GO;

desc learners;
-- source code->compiled code->
-- execute procedure
CALL PROC_LEARNER;
-- dropping procedure
DROP procedure if exists PROC_LEARNER;
 -- parameterised procedure
CREATE PROCEDURE PROC_LEARNER_FILTER(IN id int)
select learner_name,DATE_FORMAT(NOW(),'%a %Y %M %e') as Date from learners where learner_id=id;




CALL PROC_LEARNER_FILTER(3);
 use hibernatedemo;
 -- see procedure code
 show procedure code PROC_LEARNER_FILTER;
-- IN and OUT mode parameterised procedure


select * from learners;
CREATE PROCEDURE PROC_LEARNER_FILTER_OUT_2(OUT total int)
select count(learner_name) into total from learners;
-- session variable
CALL PROC_LEARNER_FILTER_OUT_2(@totalcount);

SELECT @totalcount;


select * from learners;
use batch18103;

show tables;

select * from emp;

CREATE PROCEDURE EMP_INFO()
select * from emp
GO;

call EMP_INFO;

CREATE PROCEDURE EMP_COUNT(IN age int,OUT total int)
select count(*) into total from emp where empAge=age;

select * from emp;

CALL EMP_COUNT(22,@emp);
select @emp;

-- session variable @total
CALL PROC_LEARNER_FILTER_OUT(3,@total);
select @total;
use mysql;
show tables;
use information_schema;
show databases;
select * from routines;
desc PROC_LEARNER_FILTER_OUT;
use batch18103;
select * from emp;
desc emp;
use hibernatedemo;
call emp_info;
insert into emp values(12,'Nishant',25,'8575322','nishant@edy');
insert into emp values(13,'Neeraj',22,'8554922','neeraj@edy');

insert into emp values(14,'Pooja',22,'8798798','pooja@edy');


show tables;
select * from learners;
select * from course_registration_fullstack_java;

-- UNION : merge the response of two or more select statements removing duplicacy
-- 1234
SELECT learner_id
FROM learners
UNION
SELECT course_reg_id
FROM course_registration_fullstack_java;
-- 357412
-- 123457
-- UNION ALL : merge the response of two or more select statements without removing duplicacy
SELECT learner_id
FROM learners
UNION ALL
SELECT course_reg_id
FROM course_registration_fullstack_java;
select * from learners;
select * FROM course_registration_fullstack_java;
select * from statistics;

use batch18103;
desc emp;
show tables;

CREATE UNIQUE INDEX emp_idx ON emp(empName);-- unique
CREATE INDEX emp_idx1 ON emp(empName,empAge);-- composite
-- implicit created automatically on the basis of primary key column or unique key
-- indexes on the basis of foreign key is created implicitly

SHOW databases;
USE information_schema;

SHOW tables;
select * from TRIGGERs;
select * from statistics;
-- query for mysql
DROP INDEX emp_idx ON emp;
-- Triggers
create table emp_update_info
(
    emp_name varchar(50) not null,
    emp_no int not null,
    changedate datetime default NOW(),
    action varchar(50) not null
);

-- after|before
/*
multi-line comment
*/
select * from emp_details;
desc emp_update_info;
select * from emp_update_info;

CREATE TRIGGER before_emp_details_update
	BEFORE UPDATE ON emp_details
	FOR EACH ROW
    INSERT INTO emp_update_info
    SET action='update',
	emp_no=OLD.emp_no,
    emp_name=OLD.emp_name,
    changedate=NOW();

use batch18103;
select * from emp_details;

desc emp_details;
show tables;
select * from emp_update_info;
insert into emp_details(emp_name,emp_no,changedate,action) values
('Suraj',32,NOW(),'insert'),
('Sanjay',38,NOW(),'insert'),
('Seema',45,NOW(),'insert')
;

select * from emp_details;
update emp_details set emp_no=95,emp_name='Jetashree' where emp_id=3;