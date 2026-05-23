create database universityData;
use universityData;
create table student(prn varchar(20) primary key, username varchar(20), pwd varchar(20), subject1 float,subject2 float, subject3 float,subject4 float,subject5 float);
create table teacher(username varchar(20),pwd varchar(20));
select * from student;
INSERT INTO student (prn,username,pwd)VALUES("20067","rahul","rahul123");
delete from student where prn = "20067";
