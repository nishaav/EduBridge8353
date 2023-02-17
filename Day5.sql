use avizva;
show tables;
select * from employee;
-- aggregate functions : 
-- functions which will receive multiple inputs and can generate
-- a single output
-- working with group of values and generating a single output
-- max, min, sum, avg, count
select max(emp_age) as 'AGE' from employee;
select max(emp_age)  'AGE' from employee;
select max(emp_age) as employee_age from employee;
select max(emp_age) as 'Employee Age' from employee;
select employee_age=max(emp_age) from employee;-- error
select 'employee age'=max(emp_age) from employee;-- incorrect output
select min(emp_age) from employee;
select sum(emp_age) from employee;
select avg(emp_age) from employee;
select count(emp_age) from employee;
desc employee;
select * from employee;
select emp_id,emp_name,min(emp_age) from employee;
select * from employee where emp_age=
	(select min(emp_age) from employee);
-- fetch the records of the candidates where age is minimum of all
-- order by

 select * from employee order by emp_age desc;-- descending
 select * from employee order by emp_age asc;-- ascending

describe employee;
desc employee;
select * from employee order by emp_age;
-- employee_ids of the candidate in each group
-- group by
select count(emp_id) as emp_count,emp_age from employee group by emp_age;
-- Rules
-- 1) either column should be a part of group by clause
-- or it should be applied with the aggregate functions
-- 2) group by column may or may not be specified in the select columns statement


-- fetch the details of the candidate having largest emp_id 
-- in each group classified on the basis of age

select max(emp_id),emp_age from employee group by emp_age;
select * from employee where emp_id =ANY(
		select max(emp_id) from employee group by emp_age
    );
select * from employee where emp_id IN(
		select max(emp_id) from employee group by emp_age
    );    
    
    select * from employee where emp_age IN
    (
		select max(emp_age) from employee
    );
    
    -- sub query should generate a single column output
-- need the details of those age groups in which more than 
-- 3 candidates are there    

    select count(emp_id) as emp_count,emp_age from employee group by emp_age 
    having count(emp_id)>3;
	select count(emp_id) as emp_count,emp_age from employee group by emp_age 
    having emp_age>21;
-- SELECT
-- FROM
-- WHERE
-- GROUP BY
-- HAVING
-- ORDER BY