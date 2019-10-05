create table project
(
    proid   int primary key,
    proname varchar(20)
);
create table employee
(
    empid   int primary key,
    empname varchar(20)
);
create table proemp
(
    rproid int,
    rempid int
);
alter table proemp
    add constraint fk_rproid foreign key (rproid) references project (proid);
alter table proemp
    add constraint fk_rempid foreign key (rempid) references employee (empid);

use hibernate_two;

create table `user`
(
    uid   int primary key,
    uname varchar(20)
);
create table card
(
    cid   int primary key,
    ccode varchar(20),
    ruid int
);

alter table card
    add constraint foreign key fk_ruid (ruid) references user (uid);

create table `sort`
(
    sid   int primary key,
    sname varchar(20)
);
create table book
(
    bid   int primary key,
    bname varchar(20)
);
alter table book
    add constraint fk_sid foreign key (bid) references sort (sid);


