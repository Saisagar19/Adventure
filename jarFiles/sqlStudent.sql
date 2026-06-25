create database universityData;
use universityData;
create table student(prn varchar(20) primary key, username varchar(20), pwd varchar(20), subject1 float,subject2 float, subject3 float,subject4 float,subject5 float);
create table teacher(username varchar(20),pwd varchar(20));
select * from student;
INSERT INTO student (prn,username,pwd)VALUES("20067","rahul","rahul123");
-- delete from student where prn = "20067";
use db1;
desc courses;

select * from student s left join enrollments e on e.student_id = s.id join courses c on e.course_id=c.id where s.id = 1; 

SELECT *
FROM student s
LEFT JOIN enrollments e 
    ON e.student_id = s.id
JOIN courses c 
    ON e.course_id = c.id
WHERE s.id = 1;

emp_tableSELECT *
FROM student
WHERE id = 1;

SELECT c.*
FROM courses c
JOIN enrollments e
    ON c.id = e.course_id
WHERE e.student_id = 1;