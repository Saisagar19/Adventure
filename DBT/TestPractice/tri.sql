/*DROP TRIGGER IF EXISTS tr1;

DELIMITER #

CREATE TRIGGER tr1 AFTER INSERT ON student_new FOR EACH ROW
BEGIN
	SET @x := "HELLO WORLD";
END #

DELIMITER ;

--changes made AFTER post= use after 

DROP TRIGGER IF EXISTS tr2;

DELIMITER #

CREATE TRIGGER tr2 BEFORE INSERT ON student_new FOR EACH ROW
BEGIN
	INSERT INTO bkStudent VALUES(NEW.ID, NEW.NAMEFIRST,NEW.NAMELAST,new.dob,new.emailid,new.status);
END #

DELIMITER ;

--changes made before post= use before

*/