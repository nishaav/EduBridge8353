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
-- open the database
USE batch2jdbc;

-- show list of existing databases
SHOW DATABASES;
USE batch2;
-- show list of tables in batch2 database;
SHOW TABLES;

-- check the structure of table
DESC course;
-- CHAR(FIXED SIZE) and VARCHAR

-- char(10) varchar(20)

-- how to create a table
CREATE TABLE learner_batch_2_info
(
	learner_id int,
    learner_name varchar(50),
    learner_age int,
    learner_contact varchar(10)
);

DESC learner_batch_2_info;

-- inserting the data
INSERT INTO learner_batch_2_info VALUES(1,'Jatin',23,'98765448');
INSERT INTO learner_batch_2_info VALUES(2,'Shrey',22,'809865448');
INSERT INTO learner_batch_2_info VALUES(3,'Pooja',23,'45465448');
INSERT INTO learner_batch_2_info VALUES(4,'Naman',22,'7985448');

-- fetch/retrieve the data
SELECT * FROM learner_batch_2_info;
-- * -> all
-- update the record
UPDATE learner_batch_2_info SET learner_age=21 WHERE learner_name='Jatin';
-- delete the record
-- delete a single record
DELETE FROM learner_batch_2_info WHERE learner_age=23 and learner_id=1;
-- delete all records from table
DELETE FROM learner_batch_2_info;







