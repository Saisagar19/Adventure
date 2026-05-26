use db1;
drop table student;

USE course_db;

DROP TABLE IF EXISTS student;

CREATE TABLE student (
    id         INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    firstname  VARCHAR(50)  NOT NULL,
    lastname   VARCHAR(50)  NOT NULL,
    email      VARCHAR(100) NOT NULL UNIQUE,
    _password   VARCHAR(255) NULL,
    age        INT          NOT NULL
);
select * from student;
