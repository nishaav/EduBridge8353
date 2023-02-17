use batch18103;

show tables;

select * from emp_details;
select * from employee;

select * from employee where empAge between 22 and 24;
select * from employee where empAge>=22 and empAge<=24;
select * from employee where empAge=23;
select * from employee where empAge IN (22,23,24,25);
Select * from employee where empId=5 and empAge>20;

Select * from employee where empId=5 OR empAge>22;
-- SUB QUERY 
-- first of all,inner query executes and on the basis of response of inner query
-- outer query will be generating the satifactory response.
SELECT * FROM employee WHERE empId=(SELECT max(empId) from employee);
-- select * from employee where empid=5;
-- a<b b<c

SELECT * FROM employee WHERE empId=ANY(SELECT empId from employee);

SELECT * FROM employee WHERE empId IN (SELECT empId from employee);

update employee set email='demo@gmail.com' where empId%2=0;
select * from employee where email is null;


-- LIKE is a wildcard operator
-- _ : single character match
-- % : 0 or multiple character match

select * from employee where empName like '_d%a';
select * from employee where empName like '%a';
select * from employee where empName like 'S%a%';