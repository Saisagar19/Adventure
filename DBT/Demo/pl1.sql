/*drop procedure if exists pro;
delimiter $
create procedure pro()
  begin
	select "Hellooooooooooooooo";
  end $
    delimiter ;
	
*/
/*
drop procedure if exists pro2;
delimiter $
create procedure pro2(in x int,out y int)
begin
	set y=x*x;
end $
delimiter ;
*/

/*
--error

drop procedure if exists pro3;
delimiter $
create procedure pro3(int iempno int)
begin
	declare flag bool DEFAULT false;
	select true into flag from emp where empno=iempno;
	
	if flag then 
	select empno,ename,sal from emp where empno=iempno;
	
	ELSE
		select 'not found' as 'messagebox';
	end if;
end $
delimiter ;
*/

/*

--Error
drop procedure if exists pro4;
delimiter $
create procedure pro4(in iempno int,in iname varchar(10))
begin
	insert into dept(empno,ename) values(iempno,iname);
	select "Recorded insertes ad R1;
end $
delimiter ;


--cursor 01
drop procedure if exists Cur;
delimiter @
create procedure Cur()
Begin
	declare v1,v4 int;
	declare v2,v3 varchar(100);
	
	declare c1 cursor for select empno,ename,job,sal from emp;
	declare exit handler for 1329 select 'No more data to be fetch';
	open c1;
	lb1:loop
		fetch c1 into v1 , v2 ,v3, v4;
		select v1 , v2 ,v3, v4;
	end loop lb1;
	close c1;
end @
delimiter ;


drop procedure if exists Cur;
delimiter @
create procedure Cur()
Begin
	declare x int;
	declare y datetime;
	
	declare c1 cursor for select oid,odate from demoorder;
	declare exit handler for 1329 select 'No more data to be fetch';
	open c1;
	lb1:loop
		fetch c1 into x , y;
		if(datediff(y,now()) >=5) then
			update demoorder set status = 'delayed....' where odate >= y;
			select "data is updated";
		end if;
	end loop lb1;
	close c1;
end @
delimiter ;


drop procedure if exists Cur;
delimiter @
create procedure Cur(in ideptNo int)
Begin
	declare done int DEFAULT 0 ;
	declare n int;
	declare name varchar(50);
	declare c1 cursor for 
		select deptno,ename from emp where deptno = ideptNo;
	
	if exists (select 1 from dept where deptno = ideptNo) THEN
		open c1;
				read_loop:loop
					fetch c1 into n,name;
					if done then 
						leave read_loop;
					end if;
					select n as deptno,name as ename;
				end loop read_loop;
		close c1;
			ELSE
				select 'Data does not exists' as message;
	end if;
end @
delimiter ;


*/

/*
drop procedure if exists pro;
delimiter #

create procedure pro(In x int , out a int, out b int)
begin

	set a := x*x;
	set b := x*x*x;

end #
delimiter ;

drop procedure if exists pro;
delimiter #
create procedure pro(In x int , out a int, out b int)
begin

	set a := x*x;
	set b := x*x*x;
	
end #
delimiter ;
*/


/*
drop procedure if exists salHike;

delimiter !
create procedure salHike(in ideptno int)
begin
	declare cename,cgen varchar(100);
	declare cdep, csal int;
	
	declare c1 cursor for select ename ,sal,gender, deptno from demoemp;
	open c1;
		fetch c1 into cename,csal,cgen,cdep;
		if ideptno = 10 then 
			update demoemp set up_sal = csal * (0.15) where cdep = ideptno;
		end if;
	close c1;
end !
delimiter ;


drop procedure if exists salHike;

delimiter !
create procedure salHike(x int, y int)
begin
	declare cname,cgen varchar(100);
	declare cdep, csal int;
	
	declare c1 cursor for select ename ,sal,gender, deptno from demoemp;
	declare exit handler for  1329 select "All records updatd ... " alert;
	open c1;
	label1:loop

		fetch c1 into cname,csal,cgen,cdep;

if cdep = x then 

update demoemp set up_sal = sal + (sal * y/100) where deptno = cdep ;


end if;

	end loop label1;	
	close c1;
end !
delimiter ;


delimiter !
create trigger tr1 before insert on dept for each ROW
	begin
		select 'Hello world' into @x;
	end !
delimiter ;


drop trigger if exists tr1;
delimiter !
create trigger tr1 before insert on dept for each row
	begin
		INSERT INTO bkdept VALUES(NEW.DEPTNO,NEW.DNAME,NEW.loc,NEW.PWD,NEW.STARTEDON);
	end !
delimiter ;
*/

drop trigger if exists tr1;
delimiter !
create trigger tr1 before insert on dept for each row
	begin
		INSERT INTO bkdept VALUES(NEW.DEPTNO,NEW.DNAME,NEW.loc,NEW.PWD,NEW.STARTEDON);
	end !
delimiter ;
