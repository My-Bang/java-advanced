

use ssgdb;
create table users (
	userid   		varchar(50)	  	primary key,
	username		varchar(50)	  	not null,
	userpassword	varchar(50)	  	not null,
    memTel          varchar(50)	    not null,
    memAddr         varchar(50)	  	not null

);
insert into users(userid, username, userpassword, userage, useremail)
values ('ssgcom1','신세계','12345', 25, 'ssg1@gmail'),
       ('ssgcom2','신수진','12345', 28, 'ssg2@gmail');


commit;
select * from users;













