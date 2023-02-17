-- show current user
select user();
-- grant and revoke

create user 'priya' identified by 'pooja@123';

select * from mysql.user;

grant all privileges on *.* to priya;
grant create,delete,select on *.* to priya;
revoke create,delete,select from priya;
REVOKE ALL PRIVILEGES, GRANT OPTION FROM priya;
flush PRIVILEGES;

select * from mysql.user;
update user set host='localhost' where user='pooja';

