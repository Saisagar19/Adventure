/*
drop procedure if EXISTS proc1;
delimiter #
create procedure proc1()
BEGIN
	select "Hello World";
end #
delimiter ;


drop procedure if exists proc2;
delimiter $
create procedure proc2()
BEGIN
	declare x INT default 500;
	declare y int default 600;
	
	select x + y;
end $
delimiter ;



DROP PROCEDURE IF EXISTS proc3;
DELIMITER $
CREATE PROCEDURE proc3(IN in_id int)
BEGIN
	SELECT student.* FROM student WHERE id = in_id;
END $
DELIMITER ;



DROP PROCEDURE IF EXISTS pro4;

DELIMITER $

CREATE PROCEDURE pro4(IN x INT, OUT y INT)
BEGIN
	SET y = x * x;	
END $

DELIMITER ;	



DROP PROCEDURE IF EXISTS pro4;

DELIMITER $

CREATE PROCEDURE pro4(IN x INT, OUT y INT)
BEGIN
    SET y = x * x;
END $

DELIMITER ;



DROP PROCEDURE IF exists pro5;

DELIMITER $

CREATE PROCEDURE pro5(IN in_id int)
BEGIN
	Declare flag bool default false;
	select true into flag from student where id = in_id;
	
	if flag THEN
		SELECT student.* FROM student WHERE id = in_id;
	ELSE
		select "NOT FOUND";
	end if;
END $

delimiter ;



DROP PROCEDURE IF exists addUser;

DELIMITER $

CREATE PROCEDURE addUser(IN i_username varchar(100), IN i_password varchar(100), IN i_emailid varchar(100))
BEGIN
	INSERT INTO LOGIN (username, password, emailid) values (i_username,i_password,i_emailid);
	SELECT "RECORD INSERTED" as MESSAGE;
END $

DELIMITER ;

*/
DROP PROCEDURE IF exists checkUSER;

DELIMITER $

CREATE PROCEDURE checkUSER(IN i_emailID varchar(100))
BEGIN
	
	DECLARE checkEmail VARCHAR(100);
	SELECT emailID INTO checkEmail FROM LOGIN WHERE emailID = i_emailID;
	IF checkEmail = i_emailID THEN
		SELECT username, password FROM LOGIN;
	ELSE
		INSERT INTO Log1(curr_date,curr_time, message) VALUES(curdate(),curtime(),"log updated");
	END IF;

END $

DELIMITER ;



