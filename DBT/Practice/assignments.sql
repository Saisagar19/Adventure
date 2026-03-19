
drop procedure if exists addStudent;
delimiter @
create procedure addStudent(in iid int,in ifname varchar(50),in ilname varchar(50), in iemail varchar(200),in inumber bigint, in iaddress varchar(500))
BEGIN
	insert into student (id,namefirst,namelast,emailid) values (iid,ifname,ilname,iemail);
	insert into student_phone (studentid, number ) values (iid,inumber);
	insert into student_address(studentID,address) values (iid,iaddress);
end @
delimiter ;