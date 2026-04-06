/*
DROP PROCEDURE IF EXISTS pro1;

DELIMITER @

CREATE PROCEDURE pro1()
BEGIN
	DECLARE v1,v2,v3 VARCHAR(128);
	DECLARE v4 date;
	
	DECLARE c1 CURSOR FOR SELECT namefirst,namelast,emailID,DOB FROM student;
	DECLARE EXIT HANDLER FOR 1329 SELECT "NO MORE DATA TO FETCH";
	open c1;
		lb1:LOOP
			fetch c1 into v1,v2,v3,v4;
			select v1,v2,v3,v4;
		end loop lb1;
	close c1;
END @

DELIMITER ;


DROP PROCEDURE IF EXISTS pro2;

DELIMITER @

CREATE PROCEDURE pro2()
BEGIN
	DECLARE v5 date;
	
	DECLARE c1 CURSOR FOR SELECT DOB FROM student_new;
	DECLARE EXIT HANDLER FOR 1329 SELECT "NO MORE DATA";
	OPEN c1;
		lb1:loop
		fetch c1 into v5;
		
		if YEAR(v5) > 1984 THEN
			update student_new set status = "can vote" where DOB = v5;
		ELSE
			update student_new set status = "can not vote" where dob = v5;
		END IF;
		end loop lb1;
	CLOSE c1;
END @

DELIMITER ;

*/
