/*DROP PROCEDURE IF EXISTS pl1;
DELIMITER $
CREATE PROCEDURE pl1()
	BEGIN
		SELECT * FROM emp;
	END $
DELIMITER ;

DROP PROCEDURE IF EXISTS pl1;
DELIMITER $
CREATE PROCEDURE pl1(IN ideptno int)
	BEGIN
		DECLARE FLAG BOOL DEFAULT FALSE;
        SELECT TRUE INTO FLAG FROM emp WHERE deptno = ideptno;
        
        IF FLAG THEN 
			SELECT * FROM emp WHERE deptno = ideptno;
		ELSE 
			SELECT 'Record Not Found' AS RESULT;
		END IF;
	END $
DELIMITER ;


DROP PROCEDURE IF EXISTS pl2;
DELIMITER $
CREATE PROCEDURE pl2(IN iNo int, IN iName Varchar(10))
	BEGIN
		INSERT INTO Demo (c1,c2) values (iNo, iName);
        select "Record is inserted";
	END $
DELIMITER ;

DROP PROCEDURE IF EXISTS pl3;
DELIMITER $
CREATE PROCEDURE pl3(in x int, in y int)
	BEGIN
		DECLARE x INT DEFAULT 0;		# declaration
        lb1 : LOOP			#loop
			SET x = x + 1;	#increment
            SELECT x*y;		# printing
            IF x = 10 THEN	# condition
				LEAVE lb1;	
			END IF;
		END LOOP lb1;
	END $
DELIMITER ;


DROP PROCEDURE IF EXISTS pl3;
DELIMITER $
CREATE PROCEDURE pl3(in x int)
	BEGIN
		WITH recursive cte as 
        (select 1 as n union all select n + 1 from cte where n < x) select n from cte;
	END $
DELIMITER ;


DROP PROCEDURE IF EXISTS Query;
DELIMITER $
CREATE PROCEDURE Query(in colName Varchar(1000), in tName varchar(64))
	BEGIN
		DECLARE EXIT HANDLER FOR SQLEXCEPTION
        BEGIN
			SELECT "QUERY IS NOT EXECUTED";
		END ;
	
    SET @T := CONCAT("SELECT ",colName," FROM ", tName);
    
    PREPARE stat FROM @T;
    EXECUTE stat;
	DEALLOCATE PREPARE stat;	
	END $
DELIMITER ;
*/

DROP PROCEDURE IF EXISTS addUser;
DELIMITER $
CREATE PROCEDURE addUser(in uName Varchar(50), in pass varchar(50),in em varchar(100))
	BEGIN
		INSERT INTO LOGIN VALUES (uName, pass, em);
        SELECT * FROM LOGIN;
	END $
DELIMITER ;



