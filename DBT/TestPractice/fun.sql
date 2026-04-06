/*
DROP FUNCTION IF EXISTS sumSalary;

DELIMITER @

CREATE FUNCTION sumSalary(dept_NO int) returns INT
DETERMINISTIC
BEGIN	
	DECLARE sumSal int default 0;
	SELECT SUM(sal) INTO sumSal FROM emp WHERE deptno = dept_NO;
	return sumSal;
END @

DELIMITER ;


DROP FUNCTION IF EXISTS AcceptEmail;

DELIMITER @

CREATE FUNCTION AcceptEmail(i_email varchar(100)) returns Varchar(100)
DETERMINISTIC 
BEGIN 
	DECLARE checkEmail VArCHAR(100);
	DECLARE printData VARCHAR(100);
	SELECT emailid INTO checkEmail FROM LOGIN WHERE emailid = i_email;
	IF checkEmail = i_email THEN 
		SELECT CONCAT("USERNAME: ",username, " PASSWORD: ",password) INTO printData FROM LOGIN WHERE emailid = i_email;
		return printData;
	ELSE
		return "EMPLOYEE NOT EXISTS";
	END IF;
END	@

DELIMITER ;


DROP FUNCTION IF EXISTS AcceptEmail;

DELIMITER @

CREATE FUNCTION AcceptEmail(i_email varchar(100)) returns Varchar(100)
DETERMINISTIC 
BEGIN 
	DECLARE result varchar(100);
	SELECT CONCAT("USERNAME: ",username, " PASSWORD: ",password) INTO result FROM LOGIN WHERE emailid = i_email LIMIT 1;
	IF result is not NULL THEN 
		return result;
	ELSE
		return "EMPLOYEE NOT EXISTS";
	END IF;
END	@

DELIMITER ;



DROP FUNCTION IF EXISTS sumMarks;

DELIMITER @

CREATE FUNCTION sumMarks(stud_Id INT) RETURNS int
DETERMINISTIC 
BEGIN
	DECLARE totalSum INT default 0;
	SELECT IFNULL(SUM(marks),0) INTO totalSum FROM student_qualifications WHERE name IN (10,12,"BE") and studentID = stud_Id;
	return totalSum;
END @

DELIMITER ;




DROP FUNCTION IF EXISTS autoNumber ;

DELIMITER @

CREATE FUNCTION autoNumber() RETURNS INT
DETERMINISTIC 
BEGIN
	DECLARE autoIncrement INT;
	SELECT max(ID) + 1 INTO autoIncrement FROM student_new;
	RETURN autoIncrement;
END @

DELIMITER ;

*/