-- JDBC
-- MYSQL
-- DBMS : database management system / software
-- tables : rows and columns
-- tabular format
-- Data : any information
-- Database :collection of schema objects
-- package: n classes
-- schema object means where we can store the data.
-- table : row and column
-- column is referring a field/attribute/property
-- row is referring a record
-- commands
-- SQL : Structured Query Language
-- case-insensitive 
-- STEP 1:
-- create a database
CREATE DATABASE batch2jdbc;
-- librarymanagementsystem

CREATE DATABASE LMS;
-- open the database
USE batch2jdbc;

-- show list of existing databases
SHOW DATABASES;
USE batch2;
-- show list of tables in batch2 database;
SHOW TABLES;

-- check the structure of table
DESC course;
DESCRIBE course;
-- CHAR(FIXED SIZE) and VARCHAR

-- char(10) varchar(20)

-- how to create a table
CREATE TABLE learner_batch_2_info
(
	learner_id int,
    learner_name varchar(50),
    learner_age int,
    learner_contact varchar(10)
    
    -- learner_mobile char(10)
    
);

DESC learner_batch_2_info;

-- inserting the data
INSERT INTO learner_batch_2_info VALUES(1,'Jatin',23,'98765448');
INSERT INTO learner_batch_2_info VALUES(2,'Shrey',22,'809865448');
INSERT INTO learner_batch_2_info VALUES(3,'Pooja',23,'45465448');
INSERT INTO learner_batch_2_info VALUES(4,'Naman',22,'7985448');
-- partial data insert
INSERT INTO learner_batch_2_info(learner_name,learner_id,learner_age) values('Abhishek',5,21);
-- bulk insert statement
INSERT INTO learner_batch_2_info VALUES(6,'Yogesh',22,'5345435'),
									   (7,'Divya',21,'7675654');

-- fetch/retrieve the data
SELECT * FROM learner_batch_2_info;
-- * -> all
-- update the record
UPDATE learner_batch_2_info SET learner_age=21,learner_contact='89546834' WHERE learner_name='Jatin';
-- delete the record
-- delete a single record
DELETE FROM learner_batch_2_info WHERE learner_age=23 and learner_id=1;
-- delete all records from table
DELETE FROM learner_batch_2_info;

-- 
SELECT * FROM learner_batch_2_info;

SELECT * FROM learner_batch_2_info WHERE learner_age=22;
 -- fetch the details of candidates who name contains letter S
-- WILD CARDS
-- % : multiple character match (0 or more)
-- _ : single character match (exactly 1)
SELECT * FROM learner_batch_2_info WHERE learner_name LIKE '%s%';
SELECT * FROM learner_batch_2_info WHERE learner_name LIKE 'S%';

SELECT * FROM learner_batch_2_info WHERE learner_name LIKE '_a%';

SELECT * FROM learner_batch_2_info WHERE learner_age=22;
USE batch2;
SELECT * FROM learner_batch_2_info WHERE learner_age=21 OR learner_age=23;
-- IN CLAUSE to match with multiple values
SELECT * FROM learner_batch_2_info WHERE learner_age IN (21,23);

-- aggregate functions
-- count function : to count the number of record/row

SELECT COUNT(*) FROM learner_batch_2_info;
-- sum function
SELECT SUM(learner_age) FROM learner_batch_2_info;
-- MIN 
SELECT MIN(learner_age) from learner_batch_2_info;
-- MAX
SELECT MAX(learner_age) from learner_batch_2_info;
-- AVG : average
SELECT AVG(learner_age) from learner_batch_2_info;
-- 152/7
-- ORDER BY ASC | DESC
SELECT * FROM learner_batch_2_info ORDER BY learner_age;
SELECT * FROM learner_batch_2_info ORDER BY learner_age DESC;
-- primary key means the field cannot be null and will not be getting duplicate value
CREATE TABLE learner_information 
(
	learner_id int primary key auto_increment,
    learner_name varchar(50) not null,
    learner_age int default 23,
    learner_salary int check(learner_salary>=30000)
);

DESC learner_batch_2_info;
DESC learner_information;